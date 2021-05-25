package com.it.web.service;

import com.github.pagehelper.PageInfo;
import com.it.web.common.ApiRestResponse;
import com.it.web.model.entity.Company;
import com.it.web.model.req.CompanyReq;

public interface CompanyService {

    ApiRestResponse insertCompanyInfo(Company company);

    PageInfo getCompanyInfo(CompanyReq companyReq);

    void update(Company company);

    void delete(Company company);
}
