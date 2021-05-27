package com.it.web.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it.web.common.ApiRestResponse;
import com.it.web.mapper.SendBillMapper;
import com.it.web.model.entity.Person;
import com.it.web.model.entity.SendBill;
import com.it.web.model.req.PersonReq;
import com.it.web.model.req.SendBillReq;
import com.it.web.service.SendBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SendBillServiceImpl implements SendBillService {

    @Autowired
    SendBillMapper sendBillMapper;

    @Override
    public ApiRestResponse insertBillInfo(SendBill sendBill){
        sendBillMapper.insertSelective(sendBill);
        return ApiRestResponse.success();
    }

    @Override
    public PageInfo getSendBills(SendBillReq sendBillReq){
        PageHelper.startPage(sendBillReq.getPageNum(),sendBillReq.getPageSize());
        List<SendBill> sendBills = sendBillMapper.getSendBills(sendBillReq);
        PageInfo pageInfo = new PageInfo(sendBills);
        return pageInfo;
    }

    @Override
    public void update(SendBill sendBill){
        sendBillMapper.updateByPrimaryKeySelective(sendBill);
    }

    @Override
    public void delete(SendBill sendBill){
        sendBillMapper.deleteByPrimaryKey(sendBill.getBillId());
    }
}
