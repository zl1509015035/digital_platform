package com.it.web.controller;

import com.github.pagehelper.PageInfo;
import com.it.web.common.ApiRestResponse;
import com.it.web.model.entity.Person;
import com.it.web.model.req.PersonReq;
import com.it.web.service.PersonService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@RequestMapping("/person")
@CrossOrigin
public class PersonController {

    @Autowired
    PersonService personService;

    @ApiOperation("添加人才信息")
    @PostMapping("/insertPersonInfo")
    public ApiRestResponse insertPersonInfo( Person person){
        personService.insertPersonInfo(person);
        return ApiRestResponse.success("添加人才信息成功");
    }

    @ApiOperation("添加人才头像")
    @PostMapping("/insertPersonPicture")
    public ApiRestResponse insertPersonPicture(MultipartFile file){
        Map<String, Object> map = personService.insertPersonPicture(file);
        return ApiRestResponse.success(map);
    }

    @ApiOperation("查询人才信息")
    @PostMapping("/getPersons")
    public ApiRestResponse getPersons(@RequestBody PersonReq personReq){
        PageInfo pageInfo = personService.getPersons(personReq);
        return ApiRestResponse.success(pageInfo);
    }

    @ApiOperation("修改人才信息")
    @PostMapping("/update")
    public ApiRestResponse update(@RequestBody Person person){
        personService.update(person);
        return ApiRestResponse.success("修改成功");
    }

    @ApiOperation("删除人才信息")
    @PostMapping("/delete")
    public ApiRestResponse delete(@RequestBody Person person){
        personService.delete(person);
        return ApiRestResponse.success("删除成功");
    }
}
