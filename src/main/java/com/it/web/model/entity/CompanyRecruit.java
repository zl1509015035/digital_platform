package com.it.web.model.entity;

import com.it.web.common.Constant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CompanyRecruit {
    @ApiModelProperty("职位编号")
    private Integer recruitId;

    @ApiModelProperty("职位性质 0-全职 1-兼职 2-实习")
    private String recruitQuality;

    @ApiModelProperty("职位名称")
    private String recruitName;

    @ApiModelProperty("职位类别")
    private String recruitType;

    @ApiModelProperty("职位学历要求")
    private String recruitEducationRequire;

    @ApiModelProperty("职位工作经验")
    private String recruitWorkExperience;

    @ApiModelProperty("职位薪资下限")
    private String recruitSalaryDown;

    @ApiModelProperty("职位薪资上限")
    private String recruitSalaryUp;

    @ApiModelProperty("职位岗位职责")
    private String recruitDuty;

    @ApiModelProperty("职位任职要求")
    private String recruitRequire;

    @ApiModelProperty("职位工作地址")
    private String recruitAddress;

    @ApiModelProperty("职位联系人")
    private String recruitReporter;

    @ApiModelProperty("职位联系人电话")
    private String recruitPhone;

    @ApiModelProperty("企业编号")
    private Integer companyId;

    private String createTime;

    private String isDeleted = Constant.NOT_DELETED;

    public Integer getRecruitId() {
        return recruitId;
    }

    public void setRecruitId(Integer recruitId) {
        this.recruitId = recruitId;
    }

    public String getRecruitQuality() {
        return recruitQuality;
    }

    public void setRecruitQuality(String recruitQuality) {
        this.recruitQuality = recruitQuality == null ? null : recruitQuality.trim();
    }

    public String getRecruitName() {
        return recruitName;
    }

    public void setRecruitName(String recruitName) {
        this.recruitName = recruitName == null ? null : recruitName.trim();
    }

    public String getRecruitType() {
        return recruitType;
    }

    public void setRecruitType(String recruitType) {
        this.recruitType = recruitType == null ? null : recruitType.trim();
    }

    public String getRecruitEducationRequire() {
        return recruitEducationRequire;
    }

    public void setRecruitEducationRequire(String recruitEducationRequire) {
        this.recruitEducationRequire = recruitEducationRequire == null ? null : recruitEducationRequire.trim();
    }

    public String getRecruitWorkExperience() {
        return recruitWorkExperience;
    }

    public void setRecruitWorkExperience(String recruitWorkExperience) {
        this.recruitWorkExperience = recruitWorkExperience == null ? null : recruitWorkExperience.trim();
    }

    public String getRecruitSalaryDown() {
        return recruitSalaryDown;
    }

    public void setRecruitSalaryDown(String recruitSalaryDown) {
        this.recruitSalaryDown = recruitSalaryDown == null ? null : recruitSalaryDown.trim();
    }

    public String getRecruitSalaryUp() {
        return recruitSalaryUp;
    }

    public void setRecruitSalaryUp(String recruitSalaryUp) {
        this.recruitSalaryUp = recruitSalaryUp == null ? null : recruitSalaryUp.trim();
    }

    public String getRecruitDuty() {
        return recruitDuty;
    }

    public void setRecruitDuty(String recruitDuty) {
        this.recruitDuty = recruitDuty == null ? null : recruitDuty.trim();
    }

    public String getRecruitRequire() {
        return recruitRequire;
    }

    public void setRecruitRequire(String recruitRequire) {
        this.recruitRequire = recruitRequire == null ? null : recruitRequire.trim();
    }

    public String getRecruitAddress() {
        return recruitAddress;
    }

    public void setRecruitAddress(String recruitAddress) {
        this.recruitAddress = recruitAddress == null ? null : recruitAddress.trim();
    }

    public String getRecruitReporter() {
        return recruitReporter;
    }

    public void setRecruitReporter(String recruitReporter) {
        this.recruitReporter = recruitReporter == null ? null : recruitReporter.trim();
    }

    public String getRecruitPhone() {
        return recruitPhone;
    }

    public void setRecruitPhone(String recruitPhone) {
        this.recruitPhone = recruitPhone == null ? null : recruitPhone.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }
}