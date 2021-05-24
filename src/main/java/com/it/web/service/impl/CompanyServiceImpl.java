package com.it.web.service.impl;

import com.it.web.common.ApiRestResponse;
import com.it.web.mapper.CompanyMapper;
import com.it.web.model.entity.Company;
import com.it.web.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyMapper companyMapper;

    @Override
    public ApiRestResponse insertCompanyInfo(Company company){
        companyMapper.insertSelective(company);
        return ApiRestResponse.success();
    }
}
