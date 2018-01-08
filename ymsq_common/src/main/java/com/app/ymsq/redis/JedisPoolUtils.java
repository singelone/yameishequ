package com.app.ymsq.redis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.app.ymsq.constant.SystemConfig;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;



/**
 * <Redis连接池管理>
 * 
 * @author WangZhijian
 * @version V3.0.0
 * @date [2016年3月14日]
 */
public final class JedisPoolUtils
{
	protected static Logger logger = LogManager.getLogger(JedisPoolUtils.class);

    /**
     * 连接池缓存对象
     */
    private static JedisPool pool;
    
    /**
     * 根据配置信息，初始化连接池
     * @return
     */
    //    public static final boolean initJedisPool()
    static
    {
        
        JedisPoolConfig config = new JedisPoolConfig();
 
        // 控制一个pool可分配多少个jedis实例，通过pool.getResource()来获取；如果赋值为-1，则表示不限制.
        config.setMaxTotal(Integer.parseInt(SystemConfig.redisPoolMaxActive));
        // 控制一个pool最多有多少个状态为idle(空闲的)的jedis实例.
        config.setMaxIdle(Integer.parseInt(SystemConfig.redisPoolMaxIdle));
        // 表示当borrow一个jedis实例时，最大的等待时间，如果超过等待时间，则直接抛出JedisConnectionException.
        config.setMaxWaitMillis(Integer.parseInt(SystemConfig.redisPoolMaxWait));
        //在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的.      
        config.setTestOnBorrow(true);
        
        //实例化连接池
        pool = new JedisPool(config, SystemConfig.redisHost, Integer.parseInt(SystemConfig.redisPort),
        		Integer.parseInt(SystemConfig.redisTimeout), SystemConfig.redisPasswd);
        //        return true;
    }
    
    /**
     * @return Jedis连接对象
     */
    public static Jedis getJedis()
    {
        if (null == pool)
        {
        	logger.warn("JedisTool is null!");
            return null;
        }
        Jedis jedis = null;
        try
        {
            jedis = pool.getResource();
        }
        catch (Exception e)
        {
        	logger.error("JedisTool getResource has exception!", e);
        }
        return jedis;
    }
    
    /**
     * @param jedis 将Jedis连接放回连接池
     */
    public static void close(Jedis jedis)
    {
        if (null == pool)
        {
        	logger.warn("JedisTool is null!");
            return;
        }
        if (null != jedis)
        {
            try
            {
                pool.returnResource(jedis);
            }
            catch (Exception e)
            {
            	logger.error("JedisTool returnResource has exception!", e);
            }
        }
    }
    
    /**
     * @param jedis 将打断的Jedis连接放回连接池
     */
    public static void returnBrokenResource(Jedis jedis)
    {
        if (null == pool)
        {
        	logger.warn("JedisTool is null!");
            return;
        }
        if (null != jedis)
        {
            try
            {
                pool.returnBrokenResource(jedis);
            }
            catch (Exception e)
            {
            	logger.error("JedisTool returnBrokenResource has exception!", e);
            }
        }
    }
    
}
