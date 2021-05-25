package com.it.web.mapper;

import com.it.web.model.entity.Company;
import com.it.web.model.req.CompanyReq;

import java.util.List;

public interface CompanyMapper {
    int deleteByPrimaryKey(Integer companyId);

    int insert(Company record);

    int insertSelective(Company record);

    List<Company> selectByPrimaryKey(CompanyReq companyReq);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
}