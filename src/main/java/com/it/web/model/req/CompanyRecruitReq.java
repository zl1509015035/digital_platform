package com.it.web.model.req;

import com.it.web.common.Constant;
import lombok.Data;

@Data
public class CompanyRecruitReq {
    private Integer recruitId;

    private String recruitQuality;

    private String recruitName;

    private String recruitType;

    private String recruitEducationRequire;

    private String recruitWorkExperience;

    private String recruitSalaryDown;

    private String recruitSalaryUp;

    private String recruitDuty;

    private String recruitRequire;

    private String recruitAddress;

    private String recruitReporter;

    private String recruitPhone;

    private Integer companyId;

    private String createTime;

    private String isDeleted = Constant.NOT_DELETED;

    private String startTime;

    private String endTime;

    private Integer pageNum = 1;
    private Integer pageSize = 10;

}