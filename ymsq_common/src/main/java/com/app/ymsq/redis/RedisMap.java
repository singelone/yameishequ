package com.app.ymsq.redis;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.app.ymsq.constant.SystemConfig;

import redis.clients.jedis.Jedis;

/**
 * <Redis缓存工具类>
 * 
 * @author WangZhijian
 * @version V3.0.0
 * @date [2016年3月14日]
 */
public class RedisMap<T>
{
	protected static Logger logger = LogManager.getLogger(RedisUtil.class);

	/**
	 * key字段前缀
	 */
	private String prefix;

	private int liveTime;

	/**
	 * prefix 字段值来自常量：@see
	 * com.cmiot.iov.xcws.dse.common.constants.CommonConstants；
	 * 
	 * @param prefix
	 */
	public RedisMap(String prefix)
	{
		this.prefix = prefix;
		this.liveTime = Integer.parseInt(SystemConfig.redisLivetime);
	}

	public RedisMap(String prefix, int liveTime)
	{
		this.prefix = prefix;
		this.liveTime = liveTime;
	}

	/**
	 * 把指定kv数据存入RedisMap
	 * 
	 * @param key
	 * 
	 *            , -1为永不超时
	 */
	public void put(String key, String value)
	{
		this.put(key, value, this.liveTime);
	}

	/**
	 * 删除
	 */
	public void del(List<String> keys)
	{
		if (keys == null || keys.size() == 0)
		{
			return;
		}
		Jedis jedis = null;
		try
		{
			jedis = JedisPoolUtils.getJedis();
			for (String key : keys)
			{
				String tmpKey = prefix + "_" + key;
				jedis.del(tmpKey);
			}
			JedisPoolUtils.close(jedis);
		}
		catch (Exception e)
		{
			// 释放redis对象
			JedisPoolUtils.returnBrokenResource(jedis);
			logger.error("Jedis has wrong!", e);
		}

	}

	/**
	 * 把指定kv数据存入RedisMap
	 * 
	 * @param key
	 * @param value
	 * @param livetime
	 *            , -1为永不超时
	 */
	public void put(String key, String value, int livetime)
	{
		if (key == null || "".equals(key.trim()))
		{
			return;
		}
		String tmp = prefix + "_" + key;
		Jedis jedis = null;
		try
		{
			jedis = JedisPoolUtils.getJedis();
			if (livetime == -1)
			{
				jedis.set(tmp, value);
			}
			else
			{
				jedis.setex(tmp, livetime, value);
			}
			JedisPoolUtils.close(jedis);
		}
		catch (Exception e)
		{
			// 释放redis对象
			JedisPoolUtils.returnBrokenResource(jedis);
			logger.error("Jedis has wrong!", e);
		}
	}

	public void put(Map<String, String> map)
	{
		if (map == null)
		{
			return;
		}

		Jedis jedis = null;
		try
		{
			jedis = JedisPoolUtils.getJedis();
			if (liveTime == -1)
			{
				for (Map.Entry<String, String> entry : map.entrySet())
				{
					String tmpKey = prefix + "_" + entry.getKey();
					jedis.set(tmpKey, entry.getValue());
				}
			}
			else
			{
				for (Map.Entry<String, String> entry : map.entrySet())
				{
					String tmpKey = prefix + "_" + entry.getKey();
					jedis.setex(tmpKey, liveTime, entry.getValue());
				}
			}
			JedisPoolUtils.close(jedis);
		}
		catch (Exception e)
		{
			// 释放redis对象
			JedisPoolUtils.returnBrokenResource(jedis);
			logger.error("Jedis has wrong!", e);
		}
	}

	/**
	 * 获取jedis对象
	 * 
	 * 
	 * @return T
	 */
	public String get(String key)
	{
		if (key == null || "".equals(key.trim()))
		{
			return null;
		}
		String tmp = prefix + "_" + key;
		String value = null;
		Jedis jedis = null;
		try
		{
			jedis = JedisPoolUtils.getJedis();
			value = jedis.exists(tmp) ? jedis.get(tmp) : null;
			JedisPoolUtils.close(jedis);
		}
		catch (Exception e)
		{
			// 释放redis对象
			JedisPoolUtils.returnBrokenResource(jedis);
			logger.error("Jedis has wrong!", e);
		}

		return value;
	}

	/** set Object */
	public String set(String key, Object object)
	{
		return this.set(key, object, -1);
	}

	public String set(String key, Object object, int livetime)
	{
		key = prefix + "_" + key;
		Jedis jedis = JedisPoolUtils.getJedis();
		if (livetime != -1)
		{
			String s = jedis.setex(key.getBytes(), livetime, SerializeUtil.serialize(object));
			JedisPoolUtils.close(jedis);
			return s;
		}
		else
		{
			String s = jedis.set(key.getBytes(), SerializeUtil.serialize(object));
			JedisPoolUtils.close(jedis);
			return s;
		}
	}

	/** get Object */
	public Object getObj(String key)
	{
		key = prefix + "_" + key;
		Jedis jedis = JedisPoolUtils.getJedis();
		byte[] value = jedis.get(key.getBytes());
		JedisPoolUtils.close(jedis);
		return SerializeUtil.unserialize(value);
	}

	//	/**
	//	 * 获取jedis对象
	//	 *
	//
	//	 * @return T
	//	 */
	//	public byte[] getByte(String key)
	//	{
	//		if (key == null || "".equals(key.trim()))
	//		{
	//			return null;
	//		}
	//		String tmp = prefix + "_" + key;
	//		byte[] value = null;
	//		Jedis jedis = null;
	//		try
	//		{
	//			jedis = JedisPoolUtils.getJedis();
	//			value = jedis.exists(tmp.getBytes()) ? jedis.get(tmp.getBytes()) : null;
	//			JedisPoolUtils.close(jedis);
	//		}
	//		catch (Exception e)
	//		{
	//			// 释放redis对象
	//			JedisPoolUtils.returnBrokenResource(jedis);
	//			logger.error("Jedis has wrong!", e);
	//		}
	//		return value;
	//	}
	public static void main(String[] args) {
		RedisMap<String> map = new RedisMap<>("test_");
		map.put("test_", "test");
		System.out.println(map.get("test_"));
	}
}
