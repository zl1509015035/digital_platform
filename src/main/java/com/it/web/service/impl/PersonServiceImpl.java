package com.it.web.service.impl;

import com.it.web.common.ApiRestResponse;
import com.it.web.mapper.PersonMapper;
import com.it.web.model.entity.Person;
import com.it.web.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonMapper personMapper;

    @Override
    public ApiRestResponse insertPersonInfo(Person person){
        personMapper.insertSelective(person);
        return ApiRestResponse.success();
    }
}
