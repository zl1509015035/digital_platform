package com.it.web.service;

import com.it.web.common.ApiRestResponse;
import com.it.web.model.entity.SendBill;

public interface SendBillService {
    ApiRestResponse insertBillInfo(SendBill sendBill);
}
