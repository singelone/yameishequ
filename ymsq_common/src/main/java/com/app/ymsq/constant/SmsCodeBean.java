package com.app.ymsq.constant;

import java.io.Serializable;
import java.util.Date;

public class SmsCodeBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Date sendTime;	//发送时间
	private String code;
	private int sendTimes;	//已发送次数
	private int type; 	//0正常   1失效
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public SmsCodeBean() {}
	
	public SmsCodeBean(Date sendTime, String code, int sendTimes) {
		this.sendTime = sendTime;
		this.code = code;
		this.sendTimes = sendTimes;
	}
	
	public int getSendTimes() {
		return sendTimes;
	}

	public void setSendTimes(int sendTimes) {
		this.sendTimes = sendTimes;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
