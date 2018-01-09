/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.app.ymsq.util;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.UUID;



/**
 * 封装各种生成唯一性ID算法的工具类.
 * @author ThinkGem
 * @version 2013-01-15
 */

public class IdGen  {

	private static SecureRandom random = new SecureRandom();
	
	private static SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
	
	/**
	 * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割.
	 */
	public static String uuid() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	public static String recId()
	{
		return idWorker.nextId() + "";
	}
	
	/**
	 * 使用SecureRandom随机生成Long. 
	 */
	public static long randomLong() {
		return Math.abs(random.nextLong());
	}


	/**
	 * Activiti ID 生成
	 */

	public String getNextId() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}




	public static String id_15() {
		// return UUID.randomUUID().toString().replaceAll("-", "");
		return SerialNumberGenerator.generateSerialNumberString(SerialNumberGenerator.MAX_STRING_SERIAL_NUMBER_SIZE);
	}


}
