package com.it.web.controller;

import com.it.web.common.ApiRestResponse;
import com.it.web.model.entity.Company;
import com.it.web.service.CompanyService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @ApiOperation("添加企业信息")
    @PostMapping("insertCompanyInfo")
    public ApiRestResponse insertCompanyInfo(@RequestBody Company company){
        return companyService.insertCompanyInfo(company);
    }
}
