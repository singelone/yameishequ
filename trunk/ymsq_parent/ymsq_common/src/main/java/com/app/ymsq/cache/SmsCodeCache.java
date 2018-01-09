package com.app.ymsq.cache;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.app.ymsq.constant.SmsCodeBean;
import com.app.ymsq.redis.RedisMap;
import com.app.ymsq.redis.RedisPrefix;

public class SmsCodeCache {

	private static Logger logger = LogManager.getLogger(SmsCodeCache.class);

    private static final int liveTime = 10*60;

	public static RedisMap<SmsCodeBean> codeMap = new RedisMap<SmsCodeBean>(RedisPrefix.SEND_MSG_CODE,-1);

	/**
	 * Description：
	 *
	 * @return
	 */
	public static SmsCodeBean get(String mobile)
	{

		return (SmsCodeBean) codeMap.getObj(mobile);
	}

	/**
	 * Description：
	 *
	 */
	public static void put(String mobile, SmsCodeBean bean)
	{
		codeMap.set(mobile,bean);
	}
}
