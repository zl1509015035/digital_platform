package com.it.web.service;

import com.github.pagehelper.PageInfo;
import com.it.web.common.ApiRestResponse;
import com.it.web.model.entity.Person;
import com.it.web.model.req.PersonReq;

public interface PersonService {
    ApiRestResponse insertPersonInfo(Person person);

    PageInfo getPersons(PersonReq personReq);

    void update(Person person);

    void delete(Person person);
}
