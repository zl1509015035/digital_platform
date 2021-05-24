package com.it.web.service;

import com.it.web.common.ApiRestResponse;
import com.it.web.model.entity.New;

public interface NewService {

    ApiRestResponse insertNewInfo(New n);
}
