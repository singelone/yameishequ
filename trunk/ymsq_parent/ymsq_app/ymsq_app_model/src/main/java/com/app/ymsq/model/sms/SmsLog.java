package com.app.ymsq.model.sms;

import java.io.Serializable;
import java.util.Date;

public class SmsLog implements Serializable {
    private Integer id;

    /**
     * 短信类型 0验证码 1通知
     */
    private Byte type;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 短信内容
     */
    private String content;

    /**
     * 发送时间
     */
    private Date sendTime;

    /**
     * 发送状态 0成功 1失败
     */
    private Byte status;

    /**
     * 手机号
     */
    private String mobile;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", userId=").append(userId);
        sb.append(", content=").append(content);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", status=").append(status);
        sb.append(", mobile=").append(mobile);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}