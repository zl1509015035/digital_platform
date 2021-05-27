package com.it.web.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it.web.common.ApiRestResponse;
import com.it.web.mapper.CompanyRecruitMapper;
import com.it.web.model.entity.CompanyRecruit;
import com.it.web.model.entity.Person;
import com.it.web.model.req.CompanyRecruitReq;
import com.it.web.model.req.PersonReq;
import com.it.web.service.CompanyRecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyRecruitServiceImpl implements CompanyRecruitService {

    @Autowired
    CompanyRecruitMapper companyRecruitMapper;

    @Override
    public ApiRestResponse insertCompanyRecruitInfo(CompanyRecruit companyRecruit){
        companyRecruitMapper.insertSelective(companyRecruit);
        return ApiRestResponse.success();
    }

    @Override
    public PageInfo getCompanyRecruits(CompanyRecruitReq companyRecruitReq){
        PageHelper.startPage(companyRecruitReq.getPageNum(),companyRecruitReq.getPageSize());
        List<CompanyRecruit> companyRecruits = companyRecruitMapper.getCompanyRecruits(companyRecruitReq);
        PageInfo pageInfo = new PageInfo(companyRecruits);
        return pageInfo;
    }

    @Override
    public void update(CompanyRecruit companyRecruit){
        companyRecruitMapper.updateByPrimaryKeySelective(companyRecruit);
    }

    @Override
    public void delete(CompanyRecruit companyRecruit){
        companyRecruitMapper.deleteByPrimaryKey(companyRecruit.getRecruitId());
    }
}
