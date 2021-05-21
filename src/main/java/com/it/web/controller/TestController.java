package com.it.web.controller;

import com.it.web.common.ApiRestResponse;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
@Api(tags = {"测试controller"})
public class TestController {


    @ApiOperation("get方法测试")
    @GetMapping("/getTest")
    public ApiRestResponse getTest(String msg) {
        return ApiRestResponse.success(msg);
    }

    @ApiOperation("get方法测试")
    @PostMapping("/postTest")
    public ApiRestResponse postTest(String msg) {
        return ApiRestResponse.success(msg);
    }
}
