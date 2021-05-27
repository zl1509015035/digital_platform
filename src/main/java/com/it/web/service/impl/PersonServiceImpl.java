package com.it.web.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it.web.common.ApiRestResponse;
import com.it.web.mapper.PersonMapper;
import com.it.web.model.entity.New;
import com.it.web.model.entity.Person;
import com.it.web.model.req.NewReq;
import com.it.web.model.req.PersonReq;
import com.it.web.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonMapper personMapper;

    @Override
    public ApiRestResponse insertPersonInfo(Person person){
        personMapper.insertSelective(person);
        return ApiRestResponse.success();
    }

    @Override
    public PageInfo getPersons(PersonReq personReq){
        PageHelper.startPage(personReq.getPageNum(),personReq.getPageSize());
        List<Person> persons = personMapper.getPersons(personReq);
        PageInfo pageInfo = new PageInfo(persons);
        return pageInfo;
    }

    @Override
    public void update(Person person){
        personMapper.updateByPrimaryKeySelective(person);
    }

    @Override
    public void delete(Person person){
        personMapper.deleteByPrimaryKey(person.getPersonId());
    }
}
