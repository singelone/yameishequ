package com.app.ymsq.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.ymsq.cache.SmsCodeCache;
import com.app.ymsq.constant.Auth;
import com.app.ymsq.constant.BaseResp;
import com.app.ymsq.constant.ErrCode;
import com.app.ymsq.constant.SmsCodeBean;
import com.app.ymsq.dto.saller.StationUserDTO;
import com.app.ymsq.model.saller.Saller;
import com.app.ymsq.model.user.User;
import com.app.ymsq.redis.RedisMap;
import com.app.ymsq.redis.RedisPrefix;
import com.app.ymsq.service.UserService;
import com.app.ymsq.util.StringUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@SuppressWarnings("unchecked")
@Controller
@Api(description = "用户接口")
@RequestMapping("/app/yamei/user")
public class UserController {

	private static Logger logger = LogManager.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	private BaseResp baseResp = new BaseResp<>(ErrCode.SUCCESS,"success");
	
	@RequestMapping(value = "regist", method = RequestMethod.POST)
	@ApiOperation(value = "用户注册", notes = "王波")
	@ResponseBody
	public BaseResp regist(User user) {
		logger.info("# method : regist() ");
		if (user == null) {
			logger.warn("# regist() : user is null");
			return new BaseResp<>(ErrCode.VALIDATE_FAILED,"user is null");
		}
		if (StringUtil.isNull(user.getPassword())) {
			logger.warn("# regist() : password is null");
			return new BaseResp<>(ErrCode.VALIDATE_FAILED,"密码为空");
		}
		if (StringUtil.isNull(user.getMobile())) {
			logger.warn("# regist() : mobile is null");
			return new BaseResp<>(ErrCode.VALIDATE_FAILED,"手机号为空");
		}
		if (StringUtil.isNull(user.getCode())) {
			logger.warn("# regist() : code is null");
			return new BaseResp<>(ErrCode.VALIDATE_FAILED,"验证码为空");
		}
		if (StringUtil.isNull(user.getSmsId())) {
			logger.warn("# regist() : smsId is null");
			return new BaseResp<>(ErrCode.VALIDATE_FAILED,"短信ID为空");
		}
		try {
			SmsCodeBean smsCodeBean = SmsCodeCache.get(user.getMobile());
			String string = smsCodeBean.getCode();
			if (smsCodeBean != null && smsCodeBean.getSendTime().before(new Date()) ) {
				return new BaseResp<>(ErrCode.FAILED,"短信已超时");
			}
			SmsCodeBean bean = SmsCodeCache.get(user.getMobile());
			if (bean.getType() == 1) {
				return new BaseResp<>(ErrCode.FAILED,"短信失效");
			}
			bean.setSendTimes(bean.getSendTimes()+1);
			if (!user.getCode().equals(string)) {
				logger.warn("# regist() : code not equal");
				return new BaseResp<>(ErrCode.VALIDATE_FAILED,"验证码错误");
			}
			user.setRegisterTime(new Date());
			Boolean regist = userService.regist(user);
			if (!regist) {
				baseResp = new BaseResp<>(ErrCode.ACCESS_DB_FAILED,"数据库异常");
			}
		} catch (Exception e) {
			logger.error("注册异常:{}",e);
			baseResp = new BaseResp<>(ErrCode.ACCESS_DB_FAILED,"服务器异常");
		}
		return baseResp;
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	@ApiOperation(value = "用户登录", notes = "王波")
	@ResponseBody
	public BaseResp login(User user) {
		logger.info("# method : login() ");
		if (user == null) {
			logger.warn("# login() : user is null");
			return new BaseResp<>(ErrCode.VALIDATE_FAILED,"user is null");
		}
		if (StringUtil.isNull(user.getNickname())) {
			logger.warn("# login() : nickname is null");
			return new BaseResp<>(ErrCode.VALIDATE_FAILED,"账户名为空");
		}
		if (StringUtil.isNull(user.getPassword())) {
			logger.warn("# login() : password is null");
			return new BaseResp<>(ErrCode.VALIDATE_FAILED,"密码为空");
		}
		try {
			Map<String,Object> map = userService.login(user);
			if (!StringUtil.isNull(map)) {
				baseResp.setDetail(map);
			}else {
				baseResp = new BaseResp<>(ErrCode.FAILED,"登录失败");
			}
		} catch (Exception e) {
			logger.error("登录异常:{}",e);
			baseResp = new BaseResp<>(ErrCode.ACCESS_DB_FAILED,"服务器异常");
		}
		
		return baseResp;
	}
	
	@RequestMapping(value = "login/tele", method = RequestMethod.POST)
	@ApiOperation(value = "手机号登录", notes = "王波")
	@ResponseBody
	public BaseResp loginWihtTele(User user) {
		logger.info("# method : loginWihtTele() ");
		
		if (user == null) {
			logger.warn("# loginWihtTele() : user is null");
			return new BaseResp<>(ErrCode.VALIDATE_FAILED,"user is null");
		}
		if (StringUtil.isNull(user.getMobile())) {
			logger.warn("# loginWihtTele() : mobile is null");
			return new BaseResp<>(ErrCode.VALIDATE_FAILED,"手机号为空");
		}
		if (StringUtil.isNull(user.getCode())) {
			logger.warn("# loginWihtTele() : code is null");
			return new BaseResp<>(ErrCode.VALIDATE_FAILED,"验证码为空");
		}
		try {
			String string = SmsCodeCache.get(user.getMobile()).getCode();
			if (!user.getCode().equals(string)) {
				logger.warn("# regist() : code not equal");
				return new BaseResp<>(ErrCode.VALIDATE_FAILED,"验证码错误");
			}
			
			Map<String,Object> map = userService.loginWihtTele(user);
			if (!StringUtil.isNull(map)) {
				baseResp.setDetail(map);
			}else {
				baseResp = new BaseResp<>(ErrCode.FAILED,"登录失败");
			}
			
		} catch (Exception e) {
			logger.error("手机号登录异常:{}",e);
			baseResp = new BaseResp<>(ErrCode.ACCESS_DB_FAILED,"服务器异常");
		}
		
		return baseResp;
	}
	
	@Auth
	@RequestMapping(value = "order/list", method = RequestMethod.GET)
	@ApiOperation(value = "用户订单", notes = "王波")
	@ResponseBody
	public BaseResp getStationInfo(StationUserDTO dto) {
		logger.info("# method : getStationInfo() [req]: " + dto.toString());
		if (StringUtil.isNull(dto)) {
			logger.warn("# getStationInfo() : dto is null");
			return new BaseResp<>(ErrCode.VALIDATE_FAILED, "dto is null");
		}
		try {
		} catch (Exception e) {
			logger.error("获取小站信息异常:{}", e);
			baseResp = new BaseResp<>(ErrCode.ACCESS_DB_FAILED, "服务器异常");
		}
		return baseResp;
	}
	
	@Auth
	@RequestMapping(value = "market", method = RequestMethod.GET)
	@ApiOperation(value = "购物车接口", notes = "王波")
	@ResponseBody
	public BaseResp market( ) {
		return null;
	}
	
	@Auth
	@RequestMapping(value = "address", method = RequestMethod.GET)
	@ApiOperation(value = "用户地址管理查询接口", notes = "王波")
	@ResponseBody
	public BaseResp address( ) {
		return null;
	}
	
	@Auth
	@RequestMapping(value = "market/order", method = RequestMethod.GET)
	@ApiOperation(value = "生成购物订单", notes = "王波")
	@ResponseBody
	public BaseResp order( ) {
		return null;
	}
	
	@Auth
	@RequestMapping(value = "address/dele", method = RequestMethod.GET)
	@ApiOperation(value = "用户地址管理删除接口", notes = "王波")
	@ResponseBody
	public BaseResp dele( ) {
		return null;
	}
	
	@Auth
	@RequestMapping(value = "address/add", method = RequestMethod.GET)
	@ApiOperation(value = "用户地址管理添加接口", notes = "王波")
	@ResponseBody
	public BaseResp addAddr( ) {
		return null;
	}
	
	@Auth
	@RequestMapping(value = "voucher", method = RequestMethod.GET)
	@ApiOperation(value = "用户抵用券查询接口", notes = "王波")
	@ResponseBody
	public BaseResp voucher( ) {
		return null;
	}
	
	@Auth
	@RequestMapping(value = "vouchers", method = RequestMethod.GET)
	@ApiOperation(value = "用户代金券查询接口", notes = "王波")
	@ResponseBody
	public BaseResp vouchers( ) {
		return null;
	}
	
	@Auth
	@RequestMapping(value = "letter", method = RequestMethod.GET)
	@ApiOperation(value = "我的私信接口", notes = "王波")
	@ResponseBody
	public BaseResp letter( ) {
		return null;
	}
	
	@Auth
	@RequestMapping(value = "message", method = RequestMethod.GET)
	@ApiOperation(value = "我的通知接口", notes = "王波")
	@ResponseBody
	public BaseResp message( ) {
		return null;
	}
	
	
	
}
