package com.app.ymsq.service;

import com.app.ymsq.model.sms.SmsLog;

public interface SmsService {

	/**
	 * 判断当日发送短信次数小于num次
	 * @return
	 * @throws Exception
	 */
	Boolean countSms (String mobile, Integer num) throws Exception;
	
	Boolean saveSmsLog (SmsLog log) throws Exception;
	
	SmsLog findById(Integer id) throws Exception;
}
