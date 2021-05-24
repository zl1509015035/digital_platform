package com.it.web.service.impl;

import com.it.web.common.ApiRestResponse;
import com.it.web.mapper.CompanyRecruitMapper;
import com.it.web.model.entity.CompanyRecruit;
import com.it.web.service.CompanyRecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyRecruitServiceImpl implements CompanyRecruitService {

    @Autowired
    CompanyRecruitMapper companyRecruitMapper;

    @Override
    public ApiRestResponse insertCompanyRecruitInfo(CompanyRecruit companyRecruit){
        companyRecruitMapper.insertSelective(companyRecruit);
        return ApiRestResponse.success();
    }
}
