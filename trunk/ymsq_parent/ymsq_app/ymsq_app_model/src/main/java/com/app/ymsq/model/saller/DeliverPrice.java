package com.app.ymsq.model.saller;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DeliverPrice implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 商家编号
     */
    private String sellerNo;

    /**
     * 快递小站地址
     */
    private String address;

    /**
     * 货架号
     */
    private String containerNo;

    /**
     * 地址范围
     */
    private String addressRange;

    /**
     * 重量范围
     */
    private String weightRange;

    /**
     * 价格
     */
    private BigDecimal price;

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

    /**
     * 快递公司
     */
    private String company;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSellerNo() {
        return sellerNo;
    }

    public void setSellerNo(String sellerNo) {
        this.sellerNo = sellerNo == null ? null : sellerNo.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getAddressRange() {
        return addressRange;
    }

    public void setAddressRange(String addressRange) {
        this.addressRange = addressRange == null ? null : addressRange.trim();
    }

    public String getWeightRange() {
        return weightRange;
    }

    public void setWeightRange(String weightRange) {
        this.weightRange = weightRange == null ? null : weightRange.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sellerNo=").append(sellerNo);
        sb.append(", address=").append(address);
        sb.append(", containerNo=").append(containerNo);
        sb.append(", addressRange=").append(addressRange);
        sb.append(", weightRange=").append(weightRange);
        sb.append(", price=").append(price);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", delTime=").append(delTime);
        sb.append(", addOperatorId=").append(addOperatorId);
        sb.append(", modiOperatorId=").append(modiOperatorId);
        sb.append(", delOperatorId=").append(delOperatorId);
        sb.append(", status=").append(status);
        sb.append(", company=").append(company);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}