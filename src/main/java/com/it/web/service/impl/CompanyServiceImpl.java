package com.it.web.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it.web.common.ApiRestResponse;
import com.it.web.common.Constant;
import com.it.web.mapper.CompanyMapper;
import com.it.web.model.entity.Company;
import com.it.web.model.entity.New;
import com.it.web.model.req.CompanyReq;
import com.it.web.model.req.NewReq;
import com.it.web.service.CompanyService;
import com.it.web.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyMapper companyMapper;

    @Override
    public ApiRestResponse insertCompanyInfo(Company company){
        company.setIsDeleted(Constant.NOT_DELETED);
        company.setCreateTime(DateUtils.getNowDate());
        companyMapper.insertSelective(company);
        return ApiRestResponse.success("新增成功");
    }

    @Override
    public PageInfo getCompanyInfo(CompanyReq companyReq){
        PageHelper.startPage(companyReq.getPageNum(),companyReq.getPageSize());
        List<Company> companies = companyMapper.selectByPrimaryKey(companyReq);
        PageInfo pageInfo = new PageInfo(companies);
        return pageInfo;
    }

    @Override
    public void update(Company company){
        companyMapper.updateByPrimaryKeySelective(company);
    }

    @Override
    public void delete(Company company){
        companyMapper.deleteByPrimaryKey(company.getCompanyId());
    }
}
