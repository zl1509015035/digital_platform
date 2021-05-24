package com.it.web.controller;

import com.it.web.common.ApiRestResponse;
import com.it.web.model.entity.CompanyRecruit;
import com.it.web.model.entity.Person;
import com.it.web.service.CompanyRecruitService;
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
}
