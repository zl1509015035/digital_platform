package com.it.web.mapper;

import com.it.web.model.entity.CompanyRecruit;
import com.it.web.model.req.CompanyRecruitReq;

import java.util.List;

public interface CompanyRecruitMapper {
    int deleteByPrimaryKey(Integer recruitId);

    int insert(CompanyRecruit record);

    int insertSelective(CompanyRecruit record);

    CompanyRecruit selectByPrimaryKey(Integer recruitId);

    int updateByPrimaryKeySelective(CompanyRecruit record);

    int updateByPrimaryKey(CompanyRecruit record);

    List<CompanyRecruit> getCompanyRecruits(CompanyRecruitReq companyRecruitReq);
}