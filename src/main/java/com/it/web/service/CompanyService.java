package com.it.web.service;

import com.it.web.common.ApiRestResponse;
import com.it.web.model.entity.Company;

public interface CompanyService {

    ApiRestResponse insertCompanyInfo(Company company);
}
