package com.app.ymsq.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.ymsq.constant.Auth;
import com.app.ymsq.constant.BaseResp;
import com.app.ymsq.constant.ErrCode;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@SuppressWarnings("unchecked")
@Controller
@Api(description = "超市接口")
@RequestMapping("/app/yamei/express/saller")
public class SallerController {

	private static Logger logger = LogManager.getLogger(SallerController.class);
	
	private BaseResp baseResp = new BaseResp<>(ErrCode.SUCCESS,"success");

	@Auth
	@RequestMapping(value = "get", method = RequestMethod.GET)
	@ApiOperation(value = "查询超市", notes = "王波")
	@ResponseBody
	public BaseResp find( ) {
		return null;
	}
	@Auth
	@RequestMapping(value = "goods", method = RequestMethod.GET)
	@ApiOperation(value = "条件查询超市商品", notes = "王波")
	@ResponseBody
	public BaseResp goods( ) {
		return null;
	}
	@Auth
	@RequestMapping(value = "goods/one", method = RequestMethod.GET)
	@ApiOperation(value = "单个商品信息查询", notes = "王波")
	@ResponseBody
	public BaseResp getGoods( ) {
		return null;
	}
	
	@Auth
	@RequestMapping(value = "category", method = RequestMethod.GET)
	@ApiOperation(value = "返回对应商品分类", notes = "王波")
	@ResponseBody
	public BaseResp category( ) {
		return null;
	}
	@Auth
	@RequestMapping(value = "goods/add", method = RequestMethod.GET)
	@ApiOperation(value = "商品发布", notes = "王波")
	@ResponseBody
	public BaseResp addGood( ) {
		return null;
	}
	@Auth
	@RequestMapping(value = "goods/add2", method = RequestMethod.GET)
	@ApiOperation(value = "租赁商品发布", notes = "王波")
	@ResponseBody
	public BaseResp addGood2( ) {
		return null;
	}
	@Auth
	@RequestMapping(value = "goods/image/add", method = RequestMethod.GET)
	@ApiOperation(value = "商品图片么上传", notes = "王波")
	@ResponseBody
	public BaseResp image( ) {
		return null;
	}
	
	@Auth
	@RequestMapping(value = "goods/sell/add", method = RequestMethod.GET)
	@ApiOperation(value = "添加促销设置", notes = "王波")
	@ResponseBody
	public BaseResp sell( ) {
		return null;
	}
	@Auth
	@RequestMapping(value = "goods/order/find", method = RequestMethod.GET)
	@ApiOperation(value = "购物订单查询", notes = "王波")
	@ResponseBody
	public BaseResp findOrder( ) {
		return null;
	}
	
	@Auth
	@RequestMapping(value = "goods/order/send", method = RequestMethod.GET)
	@ApiOperation(value = "购物订单确认送达", notes = "王波")
	@ResponseBody
	public BaseResp orderSend( ) {
		return null;
	}
	
	@Auth
	@RequestMapping(value = "goods/order/find2", method = RequestMethod.GET)
	@ApiOperation(value = "租赁订单查询", notes = "王波")
	@ResponseBody
	public BaseResp findOrder2( ) {
		return null;
	}
	
	@Auth
	@RequestMapping(value = "goods/order/statistics", method = RequestMethod.GET)
	@ApiOperation(value = "统计订单接口", notes = "王波")
	@ResponseBody
	public BaseResp statistics( ) {
		return null;
	}
	
	@Auth
	@RequestMapping(value = "goods/order/update", method = RequestMethod.GET)
	@ApiOperation(value = "租赁订单状态更改", notes = "王波")
	@ResponseBody
	public BaseResp update( ) {
		return null;
	}
	
	@Auth
	@RequestMapping(value = "goods/saller/update", method = RequestMethod.GET)
	@ApiOperation(value = "商家休息/打烊接口", notes = "王波")
	@ResponseBody
	public BaseResp updateSaller( ) {
		return null;
	}
	
	
}
