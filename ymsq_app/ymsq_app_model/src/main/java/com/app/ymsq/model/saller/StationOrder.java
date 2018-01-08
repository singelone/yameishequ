package com.app.ymsq.model.saller;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StationOrder implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 订单名称（取件）
     */
    private String name;

    /**
     *  取件码  
     */
    private String code;

    /**
     *  取件货架号  
     */
    private String storageNo;

    /**
     *  取件预约时间
     */
    private Date receiveBespeakTime;

    /**
     *  取件价格
     */
    private BigDecimal receivePrice;

    /**
     * 寄件公司
     */
    private String company;

    /**
     * 寄件范围
     */
    private String range;

    /**
     *  寄件重量
     */
    private String weight;

    /**
     * 寄件预约时间
     */
    private Date sendBespeakTime;

    /**
     *  取件价格
     */
    private BigDecimal sendPrice;

    /**
     * 商家名称
     */
    private String sellerName;

    /**
     * 商家编号
     */
    private String sellerNo;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 平台管理员工用户编号
     */
    private String empNo;

    /**
     * 销管员工编号
     */
    private String salesUserNo;

    /**
     * 检测员工编号
     */
    private String ceheckUserNo;

    /**
     * 订单提交时间
     */
    private Date orderSubmitTime;

    /**
     * 订单完成时间
     */
    private Date orderFinishTime;

    /**
     * 取件订单用户收货时间
     */
    private Date userReceiveTime;

    /**
     * 取件小站确认时间
     */
    private Date stationFinishTime;

    /**
     * 寄件小站收货时间
     */
    private Date stationReceiveTime;

    /**
     * 寄件用户确认时间
     */
    private Date userConfirmTime;

    /**
     * 新增时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 删除时间
     */
    private Date delTime;

    /**
     * 新增员工编号
     */
    private Long addOperatorId;

    /**
     * 修改员工编号
     */
    private Long modiOperatorId;

    /**
     * 删除工编号
     */
    private Long delOperatorId;

    /**
     * 0-正常 1-删除
     */
    private Byte status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getStorageNo() {
        return storageNo;
    }

    public void setStorageNo(String storageNo) {
        this.storageNo = storageNo == null ? null : storageNo.trim();
    }

    public Date getReceiveBespeakTime() {
        return receiveBespeakTime;
    }

    public void setReceiveBespeakTime(Date receiveBespeakTime) {
        this.receiveBespeakTime = receiveBespeakTime;
    }

    public BigDecimal getReceivePrice() {
        return receivePrice;
    }

    public void setReceivePrice(BigDecimal receivePrice) {
        this.receivePrice = receivePrice;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range == null ? null : range.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public Date getSendBespeakTime() {
        return sendBespeakTime;
    }

    public void setSendBespeakTime(Date sendBespeakTime) {
        this.sendBespeakTime = sendBespeakTime;
    }

    public BigDecimal getSendPrice() {
        return sendPrice;
    }

    public void setSendPrice(BigDecimal sendPrice) {
        this.sendPrice = sendPrice;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public String getSellerNo() {
        return sellerNo;
    }

    public void setSellerNo(String sellerNo) {
        this.sellerNo = sellerNo == null ? null : sellerNo.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo == null ? null : empNo.trim();
    }

    public String getSalesUserNo() {
        return salesUserNo;
    }

    public void setSalesUserNo(String salesUserNo) {
        this.salesUserNo = salesUserNo == null ? null : salesUserNo.trim();
    }

    public String getCeheckUserNo() {
        return ceheckUserNo;
    }

    public void setCeheckUserNo(String ceheckUserNo) {
        this.ceheckUserNo = ceheckUserNo == null ? null : ceheckUserNo.trim();
    }

    public Date getOrderSubmitTime() {
        return orderSubmitTime;
    }

    public void setOrderSubmitTime(Date orderSubmitTime) {
        this.orderSubmitTime = orderSubmitTime;
    }

    public Date getOrderFinishTime() {
        return orderFinishTime;
    }

    public void setOrderFinishTime(Date orderFinishTime) {
        this.orderFinishTime = orderFinishTime;
    }

    public Date getUserReceiveTime() {
        return userReceiveTime;
    }

    public void setUserReceiveTime(Date userReceiveTime) {
        this.userReceiveTime = userReceiveTime;
    }

    public Date getStationFinishTime() {
        return stationFinishTime;
    }

    public void setStationFinishTime(Date stationFinishTime) {
        this.stationFinishTime = stationFinishTime;
    }

    public Date getStationReceiveTime() {
        return stationReceiveTime;
    }

    public void setStationReceiveTime(Date stationReceiveTime) {
        this.stationReceiveTime = stationReceiveTime;
    }

    public Date getUserConfirmTime() {
        return userConfirmTime;
    }

    public void setUserConfirmTime(Date userConfirmTime) {
        this.userConfirmTime = userConfirmTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getDelTime() {
        return delTime;
    }

    public void setDelTime(Date delTime) {
        this.delTime = delTime;
    }

    public Long getAddOperatorId() {
        return addOperatorId;
    }

    public void setAddOperatorId(Long addOperatorId) {
        this.addOperatorId = addOperatorId;
    }

    public Long getModiOperatorId() {
        return modiOperatorId;
    }

    public void setModiOperatorId(Long modiOperatorId) {
        this.modiOperatorId = modiOperatorId;
    }

    public Long getDelOperatorId() {
        return delOperatorId;
    }

    public void setDelOperatorId(Long delOperatorId) {
        this.delOperatorId = delOperatorId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", name=").append(name);
        sb.append(", code=").append(code);
        sb.append(", storageNo=").append(storageNo);
        sb.append(", receiveBespeakTime=").append(receiveBespeakTime);
        sb.append(", receivePrice=").append(receivePrice);
        sb.append(", company=").append(company);
        sb.append(", range=").append(range);
        sb.append(", weight=").append(weight);
        sb.append(", sendBespeakTime=").append(sendBespeakTime);
        sb.append(", sendPrice=").append(sendPrice);
        sb.append(", sellerName=").append(sellerName);
        sb.append(", sellerNo=").append(sellerNo);
        sb.append(", userId=").append(userId);
        sb.append(", empNo=").append(empNo);
        sb.append(", salesUserNo=").append(salesUserNo);
        sb.append(", ceheckUserNo=").append(ceheckUserNo);
        sb.append(", orderSubmitTime=").append(orderSubmitTime);
        sb.append(", orderFinishTime=").append(orderFinishTime);
        sb.append(", userReceiveTime=").append(userReceiveTime);
        sb.append(", stationFinishTime=").append(stationFinishTime);
        sb.append(", stationReceiveTime=").append(stationReceiveTime);
        sb.append(", userConfirmTime=").append(userConfirmTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", delTime=").append(delTime);
        sb.append(", addOperatorId=").append(addOperatorId);
        sb.append(", modiOperatorId=").append(modiOperatorId);
        sb.append(", delOperatorId=").append(delOperatorId);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}