package com.it.web.model.entity;

import lombok.Data;

@Data
public class Company {
    private Integer companyId;

    private String companyName;

    private String companyAddress;

    private String companyFocusing;

    private String companyTime;

    private String campanyMoney;

    private String companyTrade;

    private Integer userId;

    private String createTime;

    private String isDeleted;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getCompanyFocusing() {
        return companyFocusing;
    }

    public void setCompanyFocusing(String companyFocusing) {
        this.companyFocusing = companyFocusing == null ? null : companyFocusing.trim();
    }

    public String getCompanyTime() {
        return companyTime;
    }

    public void setCompanyTime(String companyTime) {
        this.companyTime = companyTime == null ? null : companyTime.trim();
    }

    public String getCampanyMoney() {
        return campanyMoney;
    }

    public void setCampanyMoney(String campanyMoney) {
        this.campanyMoney = campanyMoney == null ? null : campanyMoney.trim();
    }

    public String getCompanyTrade() {
        return companyTrade;
    }

    public void setCompanyTrade(String companyTrade) {
        this.companyTrade = companyTrade == null ? null : companyTrade.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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