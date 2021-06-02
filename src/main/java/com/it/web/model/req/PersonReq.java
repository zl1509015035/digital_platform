package com.it.web.model.req;

import com.it.web.common.Constant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PersonReq {

    @ApiModelProperty("人才编号")
    private Integer personId;

    @ApiModelProperty("人才姓名")
    private String personName;

    @ApiModelProperty("人才年龄")
    private String personAge;

    @ApiModelProperty("人才生日")
    private String personBirthday;

    @ApiModelProperty("人才专业")
    private String personSpecial;

    @ApiModelProperty("人才学历")
    private String personEducation;

    @ApiModelProperty("人才政治面貌")
    private String personPolitical;

    @ApiModelProperty("人才毕业学校")
    private String personSchool;

    @ApiModelProperty("人才工作经历")
    private String personWorkExp;

    @ApiModelProperty("人才学习经历")
    private String personLearnExp;

    @ApiModelProperty("人才语言等级")
    private String personLanguage;

    @ApiModelProperty("人才荣耀")
    private String personHonor;

    @ApiModelProperty("人才自我介绍")
    private String personIntroduce;

    @ApiModelProperty("人才类型")
    private String personType;

    private String createTime;

    private Integer userId;

    @ApiModelProperty("人才审核状态（0-待审核 1-已通过 2-已拒绝  新增人才信息传0，查询传1）")
    private String verifyStatus;

    private String isDeleted = Constant.NOT_DELETED;

    private String startTime;

    private String endTime;

    private Integer pageNum = 1;
    private Integer pageSize = 10;
}