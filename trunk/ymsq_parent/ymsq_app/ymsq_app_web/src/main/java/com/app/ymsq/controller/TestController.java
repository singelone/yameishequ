package com.app.ymsq.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.ymsq.constant.BaseResp;
import com.app.ymsq.constant.ErrCode;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@SuppressWarnings("all")
@Controller
@Api(description = "测试接口")
public class TestController {

	private static Logger logger = LogManager.getLogger(TestController.class);
	
	@RequestMapping(value = "/app/yamei/test", method = RequestMethod.GET)
	@ApiOperation(value = "测试", notes = "王波")
	@ResponseBody
	public BaseResp test() {
		logger.info("test() #");
		Map<String,String> m = new HashMap<>();
		m.put("测试接口", "json");
		BaseResp result = new BaseResp<>(ErrCode.SUCCESS,"success",m);
		try {
			
		} catch (Exception e) {
			logger.error("err{}", e);
			BaseResp.setResp(false, result);
		}
		return result;
	}
}
