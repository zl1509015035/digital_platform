package com.it.web.controller;

import com.it.web.common.ApiRestResponse;
import com.it.web.model.entity.CompanyRecruit;
import com.it.web.service.CompanyRecruitService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company/recruit")
public class CompanyRecruitController {

    @Autowired
    CompanyRecruitService companyRecruitService;

    @ApiOperation("添加企业信息")
    @PostMapping("insertCompanyRecruitInfo")
    public ApiRestResponse insertCompanyRecruitInfo(@RequestBody CompanyRecruit companyRecruit){
        return companyRecruitService.insertCompanyRecruitInfo(companyRecruit);
    }
}
