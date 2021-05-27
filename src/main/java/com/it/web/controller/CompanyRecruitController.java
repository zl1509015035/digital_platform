package com.it.web.controller;

import com.github.pagehelper.PageInfo;
import com.it.web.common.ApiRestResponse;
import com.it.web.model.entity.CompanyRecruit;
import com.it.web.model.entity.Person;
import com.it.web.model.req.CompanyRecruitReq;
import com.it.web.model.req.PersonReq;
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

    @ApiOperation("添加企业招聘信息")
    @PostMapping("insertCompanyRecruitInfo")
    public ApiRestResponse insertCompanyRecruitInfo(@RequestBody CompanyRecruit companyRecruit){
        return companyRecruitService.insertCompanyRecruitInfo(companyRecruit);
    }

    @ApiOperation("查询企业招聘信息")
    @PostMapping("getCompanyRecruits")
    public ApiRestResponse getCompanyRecruits(@RequestBody CompanyRecruitReq companyRecruitReq){
        PageInfo pageInfo = companyRecruitService.getCompanyRecruits(companyRecruitReq);
        return ApiRestResponse.success(pageInfo);
    }

    @ApiOperation("修改企业招聘信息")
    @PostMapping("update")
    public ApiRestResponse update(@RequestBody CompanyRecruit companyRecruit){
        companyRecruitService.update(companyRecruit);
        return ApiRestResponse.success("修改成功");
    }

    @ApiOperation("删除企业招聘信息")
    @PostMapping("delete")
    public ApiRestResponse delete(@RequestBody CompanyRecruit companyRecruit){
        companyRecruitService.delete(companyRecruit);
        return ApiRestResponse.success("删除成功");
    }
}
