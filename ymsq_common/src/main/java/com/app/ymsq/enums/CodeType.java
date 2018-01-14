package com.app.ymsq.enums;

/**
 * 短信类型
 * @author wangbo
 *
 */
public enum CodeType implements StatusEnum{
	LOGIN("0","登录"), 
	RESET("1","重置找回密码"), 
	REGIST("2","注册");

	private final String value;
	private final String descption;
	
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return this.value;
	}

	private CodeType(String value, String descption) {
		this.value = value;
		this.descption = descption;
	}

	@Override
	public String getDescption() {
		// TODO Auto-generated method stub
		return this.descption;
	}

}
