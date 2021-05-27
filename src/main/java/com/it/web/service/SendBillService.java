package com.it.web.service;

import com.github.pagehelper.PageInfo;
import com.it.web.common.ApiRestResponse;
import com.it.web.model.entity.SendBill;
import com.it.web.model.req.SendBillReq;

public interface SendBillService {
    ApiRestResponse insertBillInfo(SendBill sendBill);

    PageInfo getSendBills(SendBillReq sendBillReq);

    void update(SendBill sendBill);

    void delete(SendBill sendBill);
}
