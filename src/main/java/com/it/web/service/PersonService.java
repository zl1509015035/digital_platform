package com.it.web.service;

import com.it.web.common.ApiRestResponse;
import com.it.web.model.entity.Person;

public interface PersonService {
    ApiRestResponse insertPersonInfo(Person person);
}
