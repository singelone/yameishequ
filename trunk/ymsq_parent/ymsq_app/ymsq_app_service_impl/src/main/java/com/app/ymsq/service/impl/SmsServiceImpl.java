package com.app.ymsq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ymsq.dao.sms.SmsLogDao;
import com.app.ymsq.model.sms.SmsLog;
import com.app.ymsq.model.sms.SmsLogQuery;
import com.app.ymsq.model.sms.SmsLogQuery.Criteria;
import com.app.ymsq.service.SmsService;
import com.app.ymsq.util.DateUtil;

@Service
public class SmsServiceImpl implements SmsService{

	@Autowired
	private SmsLogDao smsLogDao;
	
	@Override
	public Boolean countSms(String mobile, Integer num) throws Exception {
		SmsLogQuery example = new SmsLogQuery();
		Criteria criteria = example.createCriteria();
		criteria.andMobileEqualTo(mobile);
		criteria.andSendTimeBetween(DateUtil.getTheDay(0), DateUtil.getTheDay(24));
		return smsLogDao.countByExample(example) < num ? true : false;
	}

	@Override
	public Boolean saveSmsLog(SmsLog log) throws Exception {
		// TODO Auto-generated method stub
		return smsLogDao.insertSelective(log)>0?true:false;
	}

	@Override
	public SmsLog findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return smsLogDao.selectByPrimaryKey(id);
	}

}
