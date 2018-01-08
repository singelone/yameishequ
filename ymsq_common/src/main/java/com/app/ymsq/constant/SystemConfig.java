/*
 * 文 件 名:  CacheInitService.java
 * 描    述:  <描述>
 * 修 改 人:  Administrator
 * 修改时间:  2014年7月16日
 */
package com.app.ymsq.constant;

/**
 * Description：系统缓存初始化服务层
 * 
 * @author Administrator
 * @version [版本号]
 * @date [2014年7月16日]
 */
public class SystemConfig {
	

	// reids配置
	public static String redisStringKey;
	public static String redisHost = "127.0.0.1";
	public static String redisPort = "6379";
	public static String redisPasswd = null;
	public static String redisTimeout = "10000";
	//缓存时间
	public static String redisLivetime = "1800";
	public static String redisPoolMaxActive = "1000";
	public static String redisPoolMaxIdle = "100";
	public static String redisPoolMaxWait = "10000";
	
	//在线会员数量统计
	public static final String ONLINEMEBERSTAT = "onlineMemberStat:";
	//上机时长统计
	public static final String ONLINETIMESTAT="onlineTimeStat:";
	//会员增长量统计
	public static final String MEMBERSTAT="memberStat:";
	
	//百度语音key
	public static final String BAIDUSPEECH = "baiduSpeech";
	//语音访问
	public static final String trader="trader_web";
}
