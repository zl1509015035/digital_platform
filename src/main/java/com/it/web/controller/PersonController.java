package com.it.web.controller;

import com.github.pagehelper.PageInfo;
import com.it.web.common.ApiRestResponse;
import com.it.web.model.entity.Person;
import com.it.web.model.req.PersonReq;
import com.it.web.service.PersonService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @ApiOperation("添加企业信息")
    @PostMapping("insertPersonInfo")
    public ApiRestResponse insertPersonInfo(@RequestBody Person person){
        return personService.insertPersonInfo(person);
    }

    @ApiOperation("查询新闻信息")
    @PostMapping("getPersons")
    public ApiRestResponse getPersons(@RequestBody PersonReq personReq){
        PageInfo pageInfo = personService.getPersons(personReq);
        return ApiRestResponse.success(pageInfo);
    }

    @ApiOperation("修改用户信息")
    @PostMapping("update")
    public ApiRestResponse update(@RequestBody Person person){
        personService.update(person);
        return ApiRestResponse.success("修改成功");
    }

    @ApiOperation("删除用户信息")
    @PostMapping("delete")
    public ApiRestResponse delete(@RequestBody Person person){
        personService.delete(person);
        return ApiRestResponse.success("删除成功");
    }
}
