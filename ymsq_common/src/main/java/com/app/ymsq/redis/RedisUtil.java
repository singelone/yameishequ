package com.app.ymsq.redis;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import redis.clients.jedis.Jedis;

/**
 * redis的工具类
 * @author mj
 *
 */
public class RedisUtil
{
	private static Logger log = LogManager.getLogger(RedisUtil.class);
	
	/**
	 * 获取list的对象
	 * @param start  开始位置
	 * @param end	结束位置
	 */
	public static List<String> getList(String key, int start,int end) {
		try {
			Jedis jedis = JedisPoolUtils.getJedis();
			List<String> lrange = jedis.lrange(key, start, end);
			jedis.close();
			return lrange;
		} catch (Exception e) {
			log.error("获取list对象异常 : " + e);
		}
		return null;
	}
	
	/**
	 * 取出list中的所有值
	 */
	public static List<String> getList(String key) {
		try {
			Jedis jedis = JedisPoolUtils.getJedis();
			List<String> lrange = jedis.lrange(key, 0, -1);
			jedis.close();
			return lrange;
		} catch (Exception e) {
			log.error("获取list对象异常 : " + e);
		}
		return null;
	}
	
	/**
	 * 获取list的长度
	 * @param start  开始位置
	 * @param end	结束位置
	 */
	public static Long getLLen(String key) {
		try {
			Jedis jedis = JedisPoolUtils.getJedis();
			Long lrange = jedis.llen(key);
			jedis.close();
			return lrange;
		} catch (Exception e) {
			log.error("获取list的长度异常 : " + e);
		}
		return null;
	}
	/**
	 * 保留指定范围的值，即删除范围外其他值
	 * @param start  开始位置
	 * @param end	结束位置，-1表示到末尾
	 */
	public static void ltrim(String key, int start,int end) {
		try {
			Jedis jedis = JedisPoolUtils.getJedis();
			jedis.ltrim(key, start, end);
			jedis.close();
		} catch (Exception e) {
			log.error("删除list元素异常 : " + e);
		}
	}
	
	/**
	 * 删除key
	 */
	public static void delete(String key) {
		try {
			Jedis jedis = JedisPoolUtils.getJedis();
			jedis.del(key);
			jedis.close();
		} catch (Exception e) {
			log.error("删除key异常 : " + e);
		}
	}
	
	/**
	 * 向list中添加数据并返回list长度
	 * @param key
	 * @param key
	 */
	public  static Long rpush(String key, String... strings) {
		try {
			Jedis jedis = JedisPoolUtils.getJedis();
			Long llen = jedis.rpush(key, strings);
			jedis.close();
			return llen;
		} catch (Exception e) {
			log.error("lpush error : " + e);
		}
		return null;
	}
	
	/**
	 * 向list中添加java的list并返回list长度
	 * @param key
	 * @param key
	 */
	public static Long rpush(String key, List<String> list) {
		try {
			Jedis jedis = JedisPoolUtils.getJedis();
			Long llen = jedis.rpush(key, (String[])list.toArray(new String[0]));
			jedis.close();
			return llen;
		} catch (Exception e) {
			log.error("lpush error : " + e);
		}
		return null;
	}
	
}
