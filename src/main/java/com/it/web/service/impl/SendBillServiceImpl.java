package com.it.web.service.impl;

import com.it.web.common.ApiRestResponse;
import com.it.web.mapper.SendBillMapper;
import com.it.web.model.entity.Person;
import com.it.web.model.entity.SendBill;
import com.it.web.service.SendBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendBillServiceImpl implements SendBillService {

    @Autowired
    SendBillMapper sendBillMapper;

    @Override
    public ApiRestResponse insertBillInfo(SendBill sendBill){
        sendBillMapper.insertSelective(sendBill);
        return ApiRestResponse.success();
    }
}
