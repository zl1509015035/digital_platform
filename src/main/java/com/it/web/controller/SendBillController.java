package com.it.web.controller;

import com.github.pagehelper.PageInfo;
import com.it.web.common.ApiRestResponse;
import com.it.web.model.entity.Person;
import com.it.web.model.entity.SendBill;
import com.it.web.model.req.PersonReq;
import com.it.web.model.req.SendBillReq;
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

    @ApiOperation("查询新闻信息")
    @PostMapping("getSendBills")
    public ApiRestResponse getSendBills(@RequestBody SendBillReq sendBillReq){
        PageInfo pageInfo = sendBillService.getSendBills(sendBillReq);
        return ApiRestResponse.success(pageInfo);
    }

    @ApiOperation("修改用户信息")
    @PostMapping("update")
    public ApiRestResponse update(@RequestBody SendBill sendBill){
        sendBillService.update(sendBill);
        return ApiRestResponse.success("修改成功");
    }

    @ApiOperation("删除用户信息")
    @PostMapping("delete")
    public ApiRestResponse delete(@RequestBody SendBill sendBill){
        sendBillService.delete(sendBill);
        return ApiRestResponse.success("删除成功");
    }
}
