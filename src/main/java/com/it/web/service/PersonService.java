package com.it.web.service;

import com.github.pagehelper.PageInfo;
import com.it.web.common.ApiRestResponse;
import com.it.web.model.entity.Person;
import com.it.web.model.req.PersonReq;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface PersonService {
    ApiRestResponse insertPersonInfo(Person person);

    Map<String,Object> insertPersonPicture(MultipartFile file);

    PageInfo getPersons(PersonReq personReq);

    void update(Person person);

    void delete(Person person);

    List<Person> getPersonByUserId(Integer userId);
}
