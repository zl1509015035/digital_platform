package com.it.web.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it.web.common.ApiRestResponse;
import com.it.web.common.Constant;
import com.it.web.mapper.NewMapper;
import com.it.web.model.entity.Company;
import com.it.web.model.entity.New;
import com.it.web.model.entity.User;
import com.it.web.model.req.NewReq;
import com.it.web.service.NewService;
import com.it.web.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewServiceImpl implements NewService {

    @Autowired
    NewMapper newMapper;

    @Override
    public ApiRestResponse insertNewInfo(New n){
        n.setCreateTime(DateUtils.getNowDate());
        n.setIsDeleted(Constant.NOT_DELETED);
        newMapper.insertSelective(n);
        return ApiRestResponse.success();
    }


    @Override
    public PageInfo getNews(NewReq n){
        PageHelper.startPage(n.getPageNum(),n.getPageSize());
        List<New> newsInfo = newMapper.getNewsInfo(n);
        PageInfo pageInfo = new PageInfo(newsInfo);
        return pageInfo;
    }

    @Override
    public void update(New n){
        newMapper.updateByPrimaryKeySelective(n);
    }

    @Override
    public void delete(New n){
        newMapper.deleteByPrimaryKey(n.getNewId());
    }
}
