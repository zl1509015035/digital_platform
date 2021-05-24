package com.it.web.service;

import com.it.web.common.ApiRestResponse;
import com.it.web.model.entity.CompanyRecruit;

public interface CompanyRecruitService {

    ApiRestResponse insertCompanyRecruitInfo(CompanyRecruit companyRecruit);
}
