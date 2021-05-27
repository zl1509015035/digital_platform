package com.it.web.service;

import com.github.pagehelper.PageInfo;
import com.it.web.common.ApiRestResponse;
import com.it.web.model.entity.Person;
import com.it.web.model.req.PersonReq;
import org.springframework.web.multipart.MultipartFile;

public interface PersonService {
    ApiRestResponse insertPersonInfo(MultipartFile file,Person person);

    PageInfo getPersons(PersonReq personReq);

    void update(Person person);

    void delete(Person person);
}
