package com.it.web.mapper;

import com.it.web.model.entity.studentInfo;

public interface studentInfoMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(studentInfo record);

    int insertSelective(studentInfo record);

    studentInfo selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(studentInfo record);

    int updateByPrimaryKey(studentInfo record);
}