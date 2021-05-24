package com.it.web.service.impl;

import com.it.web.common.ApiRestResponse;
import com.it.web.mapper.NewMapper;
import com.it.web.model.entity.Company;
import com.it.web.model.entity.New;
import com.it.web.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewServiceImpl implements NewService {

    @Autowired
    NewMapper newMapper;

    @Override
    public ApiRestResponse insertNewInfo(New n){
        newMapper.insertSelective(n);
        return ApiRestResponse.success();
    }
}
