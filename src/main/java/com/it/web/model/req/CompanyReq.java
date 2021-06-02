package com.it.web.model.req;

import com.it.web.common.Constant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CompanyReq {

    @ApiModelProperty("企业编号")
    private Integer companyId;

    @ApiModelProperty("企业名称")
    private String companyName;

    @ApiModelProperty("企业地址")
    private String companyAddress;

    @ApiModelProperty("企业法人")
    private String companyFocusing;

    @ApiModelProperty("企业成立时间")
    private String companyTime;

    @ApiModelProperty("企业注册资本")
    private String campanyMoney;

    @ApiModelProperty("企业行业")
    private String companyTrade;

    @ApiModelProperty("用户编号")
    private Integer userId;


    private String isDeleted = Constant.NOT_DELETED;

    @ApiModelProperty("开始时间")
    private String startTime;

    @ApiModelProperty("结束时间")
    private String endTime;

    private Integer pageNum = 1;
    private Integer pageSize = 10;

}
