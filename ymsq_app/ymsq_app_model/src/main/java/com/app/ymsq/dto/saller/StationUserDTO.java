package com.app.ymsq.dto.saller;

import java.io.Serializable;

public class StationUserDTO implements Serializable{

	private static final long serialVersionUID = 8431022334235726586L;
	
	private String userName;
	private String mobile;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "StationUserDTO [userName=" + userName + ", mobile=" + mobile + "]";
	}
	
	
	
}
