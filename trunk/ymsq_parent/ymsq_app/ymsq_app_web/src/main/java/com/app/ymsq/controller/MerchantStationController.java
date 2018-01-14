package com.app.ymsq.controller;

import com.app.ymsq.constant.Auth;
import com.app.ymsq.constant.BaseResp;
import com.app.ymsq.constant.ErrCode;
import com.app.ymsq.dto.saller.StationUserDTO;
import com.app.ymsq.model.saller.DeliverPrice;
import com.app.ymsq.service.StationService;
import com.app.ymsq.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@SuppressWarnings("unchecked")
@Controller
@Api(description = "商家快递小站接口")
@RequestMapping("/app/yamei/express/merchant")
public class MerchantStationController {

	private static Logger logger = LogManager.getLogger(MerchantStationController.class);
	
	private BaseResp baseResp = new BaseResp<>(ErrCode.SUCCESS,"success");
	
	@Autowired
	private StationService stationService;
	
	@Auth
	@RequestMapping(value = "price/get/add", method = RequestMethod.GET)
	@ApiOperation(value = "取件价格发布", notes = "王波")
	@ResponseBody
	public BaseResp add(List<DeliverPrice> list ) {
//		logger.info("# method : getStationInfo() [req]: " + dto.toString());
//		if (StringUtil.isNull(dto)) {
//			logger.warn("# getStationInfo() : dto is null");
//			return new BaseResp<>(ErrCode.VALIDATE_FAILED, "dto is null");
//		}
		try {
			stationService.sentPriceAdd(list);
		} catch (Exception e) {
			logger.error("获取小站信息异常:{}", e);
			baseResp = new BaseResp<>(ErrCode.ACCESS_DB_FAILED, "服务器异常");
		}
		return baseResp;
	}
	
	@Auth
	@RequestMapping(value = "price/send/add", method = RequestMethod.GET)
	@ApiOperation(value = "寄件价格发布", notes = "王波")
	@ResponseBody
	public BaseResp getStationInfo(List<DeliverPrice> list) {
//		logger.info("# method : getStationInfo() [req]: " + dto.toString());
//		if (StringUtil.isNull(dto)) {
//			logger.warn("# getStationInfo() : dto is null");
//			return new BaseResp<>(ErrCode.VALIDATE_FAILED, "dto is null");
//		}
		try {
			stationService.sentPriceAdd(list);
		} catch (Exception e) {
			logger.error("获取小站信息异常:{}", e);
			baseResp = new BaseResp<>(ErrCode.ACCESS_DB_FAILED, "服务器异常");
		}
		return baseResp;
	}
	
	@Auth
	@RequestMapping(value = "price/send/find", method = RequestMethod.GET)
	@ApiOperation(value = "寄件价格查询", notes = "王波")
	@ResponseBody
	public BaseResp findSend(StationUserDTO dto) {
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
	@RequestMapping(value = "price/get/find", method = RequestMethod.GET)
	@ApiOperation(value = "取件价格查询", notes = "王波")
	@ResponseBody
	public BaseResp findGet(StationUserDTO dto) {
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
	@RequestMapping(value = "price/get/edit", method = RequestMethod.GET)
	@ApiOperation(value = "修改删除取件价格", notes = "王波")
	@ResponseBody
	public BaseResp editGet(StationUserDTO dto) {
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
	@RequestMapping(value = "price/send/edit", method = RequestMethod.GET)
	@ApiOperation(value = "修改删除寄件价格", notes = "王波")
	@ResponseBody
	public BaseResp editSend(StationUserDTO dto) {
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
	@RequestMapping(value = "order/detail", method = RequestMethod.GET)
	@ApiOperation(value = "小站订单查询", notes = "王波")
	@ResponseBody
	public BaseResp getOrder(StationUserDTO dto) {
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
	@RequestMapping(value = "user/add", method = RequestMethod.GET)
	@ApiOperation(value = "用户信息备案", notes = "王波")
	@ResponseBody
	public BaseResp userAdd(StationUserDTO dto) {
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
	@RequestMapping(value = "user/phone", method = RequestMethod.GET)
	@ApiOperation(value = "根据手机号匹配用户信息", notes = "王波")
	@ResponseBody
	public BaseResp userInfo(StationUserDTO dto) {
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
	@RequestMapping(value = "user/list", method = RequestMethod.GET)
	@ApiOperation(value = "用户备案信息列表", notes = "王波")
	@ResponseBody
	public BaseResp userList(StationUserDTO dto) {
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
	@RequestMapping(value = "user/infoadd", method = RequestMethod.GET)
	@ApiOperation(value = "取件信息提交", notes = "王波")
	@ResponseBody
	public BaseResp infoAdd(StationUserDTO dto) {
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
}
