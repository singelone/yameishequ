package com.app.ymsq.controller;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.ymsq.constant.Auth;
import com.app.ymsq.constant.BaseResp;
import com.app.ymsq.constant.ErrCode;
import com.app.ymsq.dto.saller.StationUserDTO;
import com.app.ymsq.model.saller.Saller;
import com.app.ymsq.model.saller.StationOrder;
import com.app.ymsq.model.user.User;
import com.app.ymsq.service.StationService;
import com.app.ymsq.util.StringUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@SuppressWarnings("unchecked")
@Controller
@Api(description = "快递小站接口")
@RequestMapping("/app/yamei/express")
public class StationController {

	private static Logger logger = LogManager.getLogger(StationController.class);
	
	private BaseResp baseResp = new BaseResp<>(ErrCode.SUCCESS,"success");
	
	private StationService stationService;
	
	@Auth
	@RequestMapping(value = "info", method = RequestMethod.GET)
	@ApiOperation(value = "查询小站信息", notes = "王波")
	@ResponseBody
	public BaseResp getStationInfo(StationUserDTO dto) {
		logger.info("# method : getStationInfo() [req]: " + dto.toString());
		if (StringUtil.isNull(dto)) {
			logger.warn("# getStationInfo() : dto is null");
			return new BaseResp<>(ErrCode.VALIDATE_FAILED, "dto is null");
		}
		try {
			Saller station = stationService.getStation(dto);
			baseResp.setDetail(station);
			if (station == null) {
				baseResp.setResultNote("查无小站信息");
			}
		} catch (Exception e) {
			logger.error("获取小站信息异常:{}", e);
			baseResp = new BaseResp<>(ErrCode.ACCESS_DB_FAILED, "服务器异常");
		}
		return baseResp;
	}
	
	@Auth
	@RequestMapping(value = "pick", method = RequestMethod.POST)
	@ApiOperation(value = "我要取件", notes = "王波")
	@ResponseBody
	public BaseResp pickup(StationOrder order ) {
		logger.info("# method : pickup() [req]: " );
		try {
			//stationService.getStation(dto);
			stationService.pick(order);
		} catch (Exception e) {
			logger.error("新增取件订单异常:{}", e);
			baseResp = new BaseResp<>(ErrCode.ACCESS_DB_FAILED, "服务器异常");
		}

		return baseResp;
	}
	
	@Auth
	@RequestMapping(value = "order/price", method = RequestMethod.GET)
	@ApiOperation(value = "寄件服务价格计算", notes = "王波")
	@ResponseBody
	public BaseResp price () {
		logger.info("# method : price() [req]: " );
		try {
			//stationService.getStation(dto);
		} catch (Exception e) {
			logger.error("查询价格异常:{}", e);
			baseResp = new BaseResp<>(ErrCode.ACCESS_DB_FAILED, "服务器异常");
		}

		return baseResp;
	}
	
	@Auth
	@RequestMapping(value = "send", method = RequestMethod.POST)
	@ApiOperation(value = "我要寄件", notes = "王波")
	@ResponseBody
	public BaseResp send( ) {
		logger.info("# method : send() [req]: " );
		try {
			
		} catch (Exception e) {
			logger.error("新增寄件订单异常:{}", e);
			baseResp = new BaseResp<>(ErrCode.ACCESS_DB_FAILED, "服务器异常");
		}

		return baseResp;
	}
	
	@Auth
	@RequestMapping(value = "info", method = RequestMethod.POST)
	@ApiOperation(value = "第三方快递查询", notes = "王波")
	@ResponseBody
	public BaseResp find( ) {
		logger.info("# method : find() [req]: " );
		try {
			
		} catch (Exception e) {
			logger.error("快递查询异常:{}", e);
			baseResp = new BaseResp<>(ErrCode.ACCESS_DB_FAILED, "服务器异常");
		}

		return baseResp;
	}
}
