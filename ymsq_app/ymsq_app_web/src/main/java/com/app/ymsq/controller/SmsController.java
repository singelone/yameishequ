package com.app.ymsq.controller;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.ymsq.cache.SmsCodeCache;
import com.app.ymsq.constant.BaseResp;
import com.app.ymsq.constant.ErrCode;
import com.app.ymsq.constant.SmsCodeBean;
import com.app.ymsq.model.user.User;
import com.app.ymsq.util.DateUtil;
import com.app.ymsq.util.SmsUtil;
import com.app.ymsq.util.StringUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@SuppressWarnings("unchecked")
@Controller
@Api(description = "短信接口")
@RequestMapping("/app/yamei/sms")
public class SmsController {

	private static Logger logger = LogManager.getLogger(SmsController.class);
	
	@RequestMapping(value = "send", method = RequestMethod.POST)
	@ApiOperation(value = "发送验证码", notes = "王波")
	@ResponseBody
	public BaseResp sendSms(String mobile) {
		logger.info("# method : sendSms() req: mobile="+mobile);
		BaseResp baseResp = null;
		if (StringUtil.isNull(mobile) || !StringUtil.isMobile(mobile)) {
			logger.warn("# sendSms() : mobile faomat error");
			return new BaseResp<>(ErrCode.VALIDATE_FAILED,"手机号格式错误");
		}
		
		try {
			SmsCodeBean smsCodeBean = SmsCodeCache.get(mobile);
			
			if (smsCodeBean != null && smsCodeBean.getSendTimes() > 2) {
				logger.warn("# sendSms() : out of sms_count");
				return new BaseResp<>(ErrCode.FAILED,"该手机号今日发送次数已超");
			}
			String code = StringUtil.randomCode(6);
			Boolean sendSms = SmsUtil.sendSms(mobile, code);	//验证码发送
			
			SmsCodeBean bean = new SmsCodeBean(DateUtil.addMinute(new Date(), 2), code, 0);
			if (smsCodeBean != null ) {
				bean.setSendTimes(bean.getSendTimes()+1);
			}
			SmsCodeCache.put(mobile, bean );
			baseResp = new BaseResp<>(ErrCode.SUCCESS,"success");
		} catch (Exception e) {
			logger.error("发送短信异常:{}",e);
			baseResp = new BaseResp<>(ErrCode.ACCESS_DB_FAILED,"服务器异常");
		}
		
		return baseResp;
	}
}