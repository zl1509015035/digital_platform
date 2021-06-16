package com.it.web.exception;

import com.it.web.common.ApiRestResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：    处理统一异常的handler
 */
//拦截异常
@ControllerAdvice
public class GloalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(GloalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object handleException(Exception e) {
        logger.error("Default Exception:", e);
        return ApiRestResponse.error(DigitalPlatformExceptionEnum.SYSTEM_ERROR);
    }

    @ExceptionHandler(DigitalPlatformException.class)
    @ResponseBody
    public Object handleDispatchException(DigitalPlatformException e) {
        logger.error("DigitalPlatformException:", e);
        return ApiRestResponse.error(e.getCode(), e.getMessage());
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ApiRestResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        logger.error("MethodArgumentNotValidException:", e);
        return handleBindingResult(e.getBindingResult());
    }

    private ApiRestResponse handleBindingResult(BindingResult result) {
        //把异常处理为对外暴露的提示
        List<String> list = new ArrayList<>();
        if (result.hasErrors()) {
            List<ObjectError> allErrors = result.getAllErrors();
            // itli
            for (ObjectError objectError : allErrors) {
                String message = objectError.getDefaultMessage();
                list.add(message);
            }
        }
        if (list.size() == 0) {
            return ApiRestResponse.error(DigitalPlatformExceptionEnum.REQUEST_PARAM_ERROR);
        }
        return ApiRestResponse.error(DigitalPlatformExceptionEnum.REQUEST_PARAM_ERROR.getCode(), list.toString());
    }


}
