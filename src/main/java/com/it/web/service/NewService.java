package com.it.web.service;

import com.github.pagehelper.PageInfo;
import com.it.web.common.ApiRestResponse;
import com.it.web.model.entity.New;
import com.it.web.model.req.NewReq;

import java.util.List;

public interface NewService {

    ApiRestResponse insertNewInfo(New n);

    PageInfo getNews(NewReq n);

    void update(New n);

    void delete(New n);
}
