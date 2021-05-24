package com.it.web.mapper;

import com.it.web.model.entity.SendBill;

public interface SendBillMapper {
    int deleteByPrimaryKey(Integer billId);

    int insert(SendBill record);

    int insertSelective(SendBill record);

    SendBill selectByPrimaryKey(Integer billId);

    int updateByPrimaryKeySelective(SendBill record);

    int updateByPrimaryKey(SendBill record);
}