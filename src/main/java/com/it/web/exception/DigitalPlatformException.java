package com.it.web.exception;

/**
 * 描述： 统一异常
 */
public class DigitalPlatformException extends RuntimeException{
    private final Integer code;
    private final String message;

    public DigitalPlatformException(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public DigitalPlatformException(DigitalPlatformExceptionEnum exceptionEnum){
        //调用上一个构造函数
        this(exceptionEnum.getCode(),exceptionEnum.getMsg());
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
