package com.it.web.model.req;

import com.it.web.common.Constant;
import lombok.Data;

@Data
public class PersonReq {
    private Integer personId;

    private String personPicture;

    private String personName;

    private String personAge;

    private String personBirthday;

    private String personSpecial;

    private String personEducation;

    private String personPolitical;

    private String personSchool;

    private String personWorkExp;

    private String personLearnExp;

    private String personLanguage;

    private String personHonor;

    private String personIntroduce;

    private String personType;

    private String createTime;

    private Integer userId;

    private String verifyStatus;

    private String isDeleted = Constant.NOT_DELETED;

    private String startTime;

    private String endTime;

    private Integer pageNum = 1;
    private Integer pageSize = 10;
}