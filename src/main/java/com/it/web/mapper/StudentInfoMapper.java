package com.it.web.mapper;

import com.it.web.model.entity.StudentInfo;

public interface StudentInfoMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    StudentInfo selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);
}