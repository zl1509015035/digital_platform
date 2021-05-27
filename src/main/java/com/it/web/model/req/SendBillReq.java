package com.it.web.model.req;

import com.it.web.common.Constant;
import lombok.Data;

@Data
public class SendBillReq {
    private Integer billId;

    private Integer userId;

    private Integer companyId;

    private Integer recruitId;

    private String recruitName;

    private String recruitType;

    private String verifyStatus;

    private String createTime;

    private String isDeleted = Constant.NOT_DELETED;

    private Integer pageNum = 1;
    private Integer pageSize = 10;

    private String startTime;
    private String endTime;

}