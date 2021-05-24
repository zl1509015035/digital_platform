package com.it.web.model.entity;

public class CompanyRecruit {
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

    private String isDeleted;

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