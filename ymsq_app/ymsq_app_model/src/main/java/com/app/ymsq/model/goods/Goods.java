package com.app.ymsq.model.goods;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Goods implements Serializable {
    /**
     * 商品ID
     */
    private Integer goodsId;

    private String goodsNo;

    /**
     * 商品分类id
     */
    private Integer goodsCategory;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品销售价格
     */
    private BigDecimal sellPrice;

    /**
     * 销量
     */
    private Long salesNum;

    /**
     * 库存
     */
    private Integer stockNum;

    /**
     * 父id
     */
    private Integer pid;

    /**
     * 商品类型 1超市商品  2超市租赁  3快递取件  4快递寄件 5净水器租赁  6空气进化租赁
     */
    private Byte goodsType;

    private Integer rangeAge;

    /**
     * 商品品牌
     */
    private String brand;

    /**
     * 商家id
     */
    private Integer sellerId;

    /**
     * 商品促销id
     */
    private Integer goodsSalesSpec;

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
     * 新增员员工编号
     */
    private Long addOperatorId;

    /**
     * 修改员工编号
     */
    private Long modiOperatorId;

    /**
     * 删除员工编号
     */
    private Long delOperatorId;

    /**
     * 0-下架 1-正常 2删除
     */
    private Byte status;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo == null ? null : goodsNo.trim();
    }

    public Integer getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(Integer goodsCategory) {
        this.goodsCategory = goodsCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Long getSalesNum() {
        return salesNum;
    }

    public void setSalesNum(Long salesNum) {
        this.salesNum = salesNum;
    }

    public Integer getStockNum() {
        return stockNum;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Byte getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Byte goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getRangeAge() {
        return rangeAge;
    }

    public void setRangeAge(Integer rangeAge) {
        this.rangeAge = rangeAge;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getGoodsSalesSpec() {
        return goodsSalesSpec;
    }

    public void setGoodsSalesSpec(Integer goodsSalesSpec) {
        this.goodsSalesSpec = goodsSalesSpec;
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
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsNo=").append(goodsNo);
        sb.append(", goodsCategory=").append(goodsCategory);
        sb.append(", name=").append(name);
        sb.append(", sellPrice=").append(sellPrice);
        sb.append(", salesNum=").append(salesNum);
        sb.append(", stockNum=").append(stockNum);
        sb.append(", pid=").append(pid);
        sb.append(", goodsType=").append(goodsType);
        sb.append(", rangeAge=").append(rangeAge);
        sb.append(", brand=").append(brand);
        sb.append(", sellerId=").append(sellerId);
        sb.append(", goodsSalesSpec=").append(goodsSalesSpec);
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