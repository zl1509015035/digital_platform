package com.it.web.controller;

import com.github.pagehelper.PageInfo;
import com.it.web.common.ApiRestResponse;
import com.it.web.exception.DigitalPlatformExceptionEnum;
import com.it.web.model.entity.New;
import com.it.web.model.entity.User;
import com.it.web.model.req.NewReq;
import com.it.web.service.NewService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/new")
public class NewController {

    @Autowired
    NewService newService;

    @ApiOperation("新增新闻信息")
    @PostMapping("insertNews")
    public ApiRestResponse insertNews(@RequestBody New n){
        newService.insertNewInfo(n);
        return ApiRestResponse.success("新增成功");
    }

    @ApiOperation("查询新闻信息")
    @PostMapping("getNews")
    public ApiRestResponse getNews(@RequestBody NewReq newReq){
        PageInfo pageInfo = newService.getNews(newReq);
        return ApiRestResponse.success(pageInfo);
    }

    @ApiOperation("修改用户信息")
    @PostMapping("update")
    public ApiRestResponse update(@RequestBody New n){
        newService.update(n);
        return ApiRestResponse.success("修改成功");
    }

    @ApiOperation("删除用户信息")
    @PostMapping("delete")
    public ApiRestResponse delete(@RequestBody New n){
        newService.delete(n);
        return ApiRestResponse.success("删除成功");
    }
}
