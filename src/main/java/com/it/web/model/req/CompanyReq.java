package com.it.web.model.req;

import com.it.web.common.Constant;
import lombok.Data;

@Data
public class CompanyReq {

    private Integer companyId;

    private String companyName;

    private String companyAddress;

    private String companyFocusing;

    private String companyTime;

    private String campanyMoney;

    private String companyTrade;

    private Integer userId;


    private String isDeleted = Constant.NOT_DELETED;

    private String startTime;

    private String endTime;

    private Integer pageNum = 1;
    private Integer pageSize = 10;

}