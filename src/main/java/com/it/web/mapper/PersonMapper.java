package com.it.web.mapper;

import com.it.web.model.entity.Person;
import com.it.web.model.req.PersonReq;

import java.util.List;

public interface PersonMapper {
    int deleteByPrimaryKey(Integer personId);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer personId);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);

    List<Person> getPersons(PersonReq personReq);
}