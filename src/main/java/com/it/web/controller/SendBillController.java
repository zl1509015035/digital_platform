package com.it.web.controller;

import com.it.web.common.ApiRestResponse;
import com.it.web.model.entity.Person;
import com.it.web.model.entity.SendBill;
import com.it.web.service.PersonService;
import com.it.web.service.SendBillService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sendBill")
public class SendBillController {

    @Autowired
    SendBillService sendBillService;

    @ApiOperation("添加企业信息")
    @PostMapping("insertBillInfo")
    public ApiRestResponse insertBillInfo(@RequestBody SendBill sendBill){
        return sendBillService.insertBillInfo(sendBill);
    }
}
