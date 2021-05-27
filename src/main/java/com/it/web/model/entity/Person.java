package com.it.web.model.entity;

import com.it.web.common.Constant;

public class Person {
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

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonPicture() {
        return personPicture;
    }

    public void setPersonPicture(String personPicture) {
        this.personPicture = personPicture == null ? null : personPicture.trim();
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public String getPersonAge() {
        return personAge;
    }

    public void setPersonAge(String personAge) {
        this.personAge = personAge == null ? null : personAge.trim();
    }

    public String getPersonBirthday() {
        return personBirthday;
    }

    public void setPersonBirthday(String personBirthday) {
        this.personBirthday = personBirthday == null ? null : personBirthday.trim();
    }

    public String getPersonSpecial() {
        return personSpecial;
    }

    public void setPersonSpecial(String personSpecial) {
        this.personSpecial = personSpecial == null ? null : personSpecial.trim();
    }

    public String getPersonEducation() {
        return personEducation;
    }

    public void setPersonEducation(String personEducation) {
        this.personEducation = personEducation == null ? null : personEducation.trim();
    }

    public String getPersonPolitical() {
        return personPolitical;
    }

    public void setPersonPolitical(String personPolitical) {
        this.personPolitical = personPolitical == null ? null : personPolitical.trim();
    }

    public String getPersonSchool() {
        return personSchool;
    }

    public void setPersonSchool(String personSchool) {
        this.personSchool = personSchool == null ? null : personSchool.trim();
    }

    public String getPersonWorkExp() {
        return personWorkExp;
    }

    public void setPersonWorkExp(String personWorkExp) {
        this.personWorkExp = personWorkExp == null ? null : personWorkExp.trim();
    }

    public String getPersonLearnExp() {
        return personLearnExp;
    }

    public void setPersonLearnExp(String personLearnExp) {
        this.personLearnExp = personLearnExp == null ? null : personLearnExp.trim();
    }

    public String getPersonLanguage() {
        return personLanguage;
    }

    public void setPersonLanguage(String personLanguage) {
        this.personLanguage = personLanguage == null ? null : personLanguage.trim();
    }

    public String getPersonHonor() {
        return personHonor;
    }

    public void setPersonHonor(String personHonor) {
        this.personHonor = personHonor == null ? null : personHonor.trim();
    }

    public String getPersonIntroduce() {
        return personIntroduce;
    }

    public void setPersonIntroduce(String personIntroduce) {
        this.personIntroduce = personIntroduce == null ? null : personIntroduce.trim();
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType == null ? null : personType.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus == null ? null : verifyStatus.trim();
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }
}