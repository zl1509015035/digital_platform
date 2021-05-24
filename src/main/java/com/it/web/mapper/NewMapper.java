package com.it.web.mapper;

import com.it.web.model.entity.New;

public interface NewMapper {
    int deleteByPrimaryKey(Integer newId);

    int insert(New record);

    int insertSelective(New record);

    New selectByPrimaryKey(Integer newId);

    int updateByPrimaryKeySelective(New record);

    int updateByPrimaryKey(New record);
}