package com.it.web.service;

import com.github.pagehelper.PageInfo;
import com.it.web.common.ApiRestResponse;
import com.it.web.model.entity.CompanyRecruit;
import com.it.web.model.req.CompanyRecruitReq;

public interface CompanyRecruitService {

    ApiRestResponse insertCompanyRecruitInfo(CompanyRecruit companyRecruit);

    PageInfo getCompanyRecruits(CompanyRecruitReq companyRecruitReq);

    void update(CompanyRecruit companyRecruit);

    void delete(CompanyRecruit companyRecruit);
}
