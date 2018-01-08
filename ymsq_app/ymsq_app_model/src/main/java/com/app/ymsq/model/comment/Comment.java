package com.app.ymsq.model.comment;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    /**
     * 评论表
     */
    private Long id;

    /**
     * 商品id
     */
    private Integer goodsid;

    /**
     * 订单id
     */
    private Long orderid;

    /**
     * 评论类型 0完成订单评价  1评价回复  2私信  3私信回复
     */
    private Byte type;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户id
     */
    private Long userid;

    /**
     * 发布时间
     */
    private Date createdate;

    /**
     * 内容
     */
    private String text;

    /**
     * 图片路径
     */
    private String picture;

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

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
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
        sb.append(", goodsid=").append(goodsid);
        sb.append(", orderid=").append(orderid);
        sb.append(", type=").append(type);
        sb.append(", username=").append(username);
        sb.append(", userid=").append(userid);
        sb.append(", createdate=").append(createdate);
        sb.append(", text=").append(text);
        sb.append(", picture=").append(picture);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}