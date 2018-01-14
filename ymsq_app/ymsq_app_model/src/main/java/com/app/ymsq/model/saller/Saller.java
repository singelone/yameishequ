package com.app.ymsq.model.saller;

import java.io.Serializable;
import java.util.Date;

public class Saller implements Serializable {
    /**
     * 商家id
     */
    private Integer sellerId;

    /**
     * 商家编号
     */
    private String sellerNo;

    /**
     * 商家名称
     */
    private String sellerName;

    /**
     * 商家类型，0 快递小站，1 万能超市，2 共享租赁
     */
    private Byte sellerType;

    /**
     * 商家省份
     */
    private String sellerProvince;

    /**
     * 商家城市
     */
    private String sellerCity;

    /**
     * 商家区域
     */
    private String sellerArea;

    /**
     * 商家街道
     */
    private String sellerStreet;

    /**
     * 商家小区
     */
    private String sellerVillage;

    /**
     * 商家地址
     */
    private String sellerAddress;

    /**
     * 商家电话
     */
    private String sellerPhone;

    /**
     * 负责人姓名
     */
    private String personName;

    /**
     * 负责人电话
     */
    private String personPhone;

    /**
     * 负责人邮箱
     */
    private String personEmail;

    /**
     * 商家营业执照
     */
    private String sellerLicence;

    /**
     * 商家营业执照注册时间
     */
    private Date sellerLicencedate;

    /**
     * 商家营业执照有效期限
     */
    private Date sellerLicenceDeadline;

    /**
     * 商家营业执照 照片
     */
    private String sellerLicencePhoto;

    /**
     * 负责人身份证 照片
     */
    private String personidcardPhoto;

    /**
     * 商家提交时间
     */
    private Date sellerCommitTime;

    /**
     * 商家通过时间
     */
    private Date sellerPassTime;

    /**
     * 0-正常 1-删除
     */
    private Byte status;

    /**
     * 新增时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date modifyDate;

    /**
     * 删除时间
     */
    private Date delDate;

    /**
     * 新增员员工编号
     */
    private Integer addOperatorId;

    /**
     * 修改员工编号
     */
    private Integer modiOperatorId;

    /**
     * 删除员工编号
     */
    private Integer delOperatorId;

    private static final long serialVersionUID = 1L;

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerNo() {
        return sellerNo;
    }

    public void setSellerNo(String sellerNo) {
        this.sellerNo = sellerNo == null ? null : sellerNo.trim();
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public Byte getSellerType() {
        return sellerType;
    }

    public void setSellerType(Byte sellerType) {
        this.sellerType = sellerType;
    }

    public String getSellerProvince() {
        return sellerProvince;
    }

    public void setSellerProvince(String sellerProvince) {
        this.sellerProvince = sellerProvince == null ? null : sellerProvince.trim();
    }

    public String getSellerCity() {
        return sellerCity;
    }

    public void setSellerCity(String sellerCity) {
        this.sellerCity = sellerCity == null ? null : sellerCity.trim();
    }

    public String getSellerArea() {
        return sellerArea;
    }

    public void setSellerArea(String sellerArea) {
        this.sellerArea = sellerArea == null ? null : sellerArea.trim();
    }

    public String getSellerStreet() {
        return sellerStreet;
    }

    public void setSellerStreet(String sellerStreet) {
        this.sellerStreet = sellerStreet == null ? null : sellerStreet.trim();
    }

    public String getSellerVillage() {
        return sellerVillage;
    }

    public void setSellerVillage(String sellerVillage) {
        this.sellerVillage = sellerVillage == null ? null : sellerVillage.trim();
    }

    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress == null ? null : sellerAddress.trim();
    }

    public String getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone == null ? null : sellerPhone.trim();
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone == null ? null : personPhone.trim();
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail == null ? null : personEmail.trim();
    }

    public String getSellerLicence() {
        return sellerLicence;
    }

    public void setSellerLicence(String sellerLicence) {
        this.sellerLicence = sellerLicence == null ? null : sellerLicence.trim();
    }

    public Date getSellerLicencedate() {
        return sellerLicencedate;
    }

    public void setSellerLicencedate(Date sellerLicencedate) {
        this.sellerLicencedate = sellerLicencedate;
    }

    public Date getSellerLicenceDeadline() {
        return sellerLicenceDeadline;
    }

    public void setSellerLicenceDeadline(Date sellerLicenceDeadline) {
        this.sellerLicenceDeadline = sellerLicenceDeadline;
    }

    public String getSellerLicencePhoto() {
        return sellerLicencePhoto;
    }

    public void setSellerLicencePhoto(String sellerLicencePhoto) {
        this.sellerLicencePhoto = sellerLicencePhoto == null ? null : sellerLicencePhoto.trim();
    }

    public String getPersonidcardPhoto() {
        return personidcardPhoto;
    }

    public void setPersonidcardPhoto(String personidcardPhoto) {
        this.personidcardPhoto = personidcardPhoto == null ? null : personidcardPhoto.trim();
    }

    public Date getSellerCommitTime() {
        return sellerCommitTime;
    }

    public void setSellerCommitTime(Date sellerCommitTime) {
        this.sellerCommitTime = sellerCommitTime;
    }

    public Date getSellerPassTime() {
        return sellerPassTime;
    }

    public void setSellerPassTime(Date sellerPassTime) {
        this.sellerPassTime = sellerPassTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Date getDelDate() {
        return delDate;
    }

    public void setDelDate(Date delDate) {
        this.delDate = delDate;
    }

    public Integer getAddOperatorId() {
        return addOperatorId;
    }

    public void setAddOperatorId(Integer addOperatorId) {
        this.addOperatorId = addOperatorId;
    }

    public Integer getModiOperatorId() {
        return modiOperatorId;
    }

    public void setModiOperatorId(Integer modiOperatorId) {
        this.modiOperatorId = modiOperatorId;
    }

    public Integer getDelOperatorId() {
        return delOperatorId;
    }

    public void setDelOperatorId(Integer delOperatorId) {
        this.delOperatorId = delOperatorId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sellerId=").append(sellerId);
        sb.append(", sellerNo=").append(sellerNo);
        sb.append(", sellerName=").append(sellerName);
        sb.append(", sellerType=").append(sellerType);
        sb.append(", sellerProvince=").append(sellerProvince);
        sb.append(", sellerCity=").append(sellerCity);
        sb.append(", sellerArea=").append(sellerArea);
        sb.append(", sellerStreet=").append(sellerStreet);
        sb.append(", sellerVillage=").append(sellerVillage);
        sb.append(", sellerAddress=").append(sellerAddress);
        sb.append(", sellerPhone=").append(sellerPhone);
        sb.append(", personName=").append(personName);
        sb.append(", personPhone=").append(personPhone);
        sb.append(", personEmail=").append(personEmail);
        sb.append(", sellerLicence=").append(sellerLicence);
        sb.append(", sellerLicencedate=").append(sellerLicencedate);
        sb.append(", sellerLicenceDeadline=").append(sellerLicenceDeadline);
        sb.append(", sellerLicencePhoto=").append(sellerLicencePhoto);
        sb.append(", personidcardPhoto=").append(personidcardPhoto);
        sb.append(", sellerCommitTime=").append(sellerCommitTime);
        sb.append(", sellerPassTime=").append(sellerPassTime);
        sb.append(", status=").append(status);
        sb.append(", createDate=").append(createDate);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", delDate=").append(delDate);
        sb.append(", addOperatorId=").append(addOperatorId);
        sb.append(", modiOperatorId=").append(modiOperatorId);
        sb.append(", delOperatorId=").append(delOperatorId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}