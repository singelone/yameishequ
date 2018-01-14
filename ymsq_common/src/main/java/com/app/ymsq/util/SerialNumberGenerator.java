package com.app.ymsq.util;

/**
 * SerialNumberGenerator用于生成唯一序列号。生成序列算法以当前时间为基准产生唯一序列号
 * 编码规则（从右至左）
 * 1： 1-4位 为随机偏移量
 * 2： 5-6位 为并发偏移量（同一JVM）
 * 3： 6位以上 为时间偏移量,时间以
 * 该生成器对于单机在并发度< 100000 时可以保证序列号唯一性
 * 注意该生成器在多机部署（集群）情况下不能保证唯一性
 * 其中，Long型唯一序列号最长19位，最短7位 String型唯一序列号最长25位，最短7位
 * 默认唯一序列号长度为16位
 *
 * @author xuliang
 * @since 1.0*
 *
 *
 */

import java.util.Random;

public final class SerialNumberGenerator
{

	private static Random randGenerator;
	private static long offset;
	public final static int DEFAULT_SERIAL_NUMBER_SIZE = 16;
	public final static int MAX_LONG_SERIAL_NUMBER_SIZE = 19;
	public final static int MIN_SERIAL_NUMBER_SIZE = 7;
	public final static int MAX_STRING_SERIAL_NUMBER_SIZE = 15;
	public final static int MAX_RAND_OFFSET = 10000;
	public final static int MAX_CONCURRENT_OFFSET = 100;
	public final static int FIXED_OFFSET_SIZE = 5;
	public final static int CONCURRENT_OFFSET_SIZE = 2;
	public final static int RAND_OFFSET_SIZE = 4;
	public final static String FILL_LETTER = "0";
	public final static String TIME_OFFSET_FORMAT = "yyMMddHHmmssSSS";

	/**
	 * 不允许实例化该类
	 */
	private SerialNumberGenerator()
	{
	}

	/**
	 * 加载时初始化经静态数据
	 */
	static
	{
		randGenerator = new Random();
		offset = 0;
	}

	/**
	 * 返回默认长度的long型唯一序列码
	 *
	 * @return 长度为默认长度的long型唯一序列码
	 */
	public static synchronized long generateSerialNumber()
	{
		return Long.parseLong(getSerialNumber(DEFAULT_SERIAL_NUMBER_SIZE));
	}

	/**
	 * 返回指定长度的long型唯一序列码.  特殊情况:
	 * <ul><li>如果指定长度大于最大支持的最大长度，将产生默认长度的long型唯一序列码.
	 * <li>如果指定长度小于最小支持的最大长度，将产生默认长度的long型唯一序列码.</ul>
	 *
	 * @param serialNumberSize 指定序列码位数
	 * @return 长度为指定长度的long型唯一序列码
	 */
	public static synchronized long generateSerialNumber(int serialNumberSize)
	{
		if (serialNumberSize > MAX_LONG_SERIAL_NUMBER_SIZE || serialNumberSize < MIN_SERIAL_NUMBER_SIZE)
		{
			return Long.parseLong(getSerialNumber(DEFAULT_SERIAL_NUMBER_SIZE));
		}
		else
		{
			return Long.parseLong(getSerialNumber(serialNumberSize));
		}
	}

	/**
	 * 返回指定长度的String型唯一序列码.  特殊情况:
	 * <ul><li>如果指定长度大于最大支持的最大长度，将产生默认长度的String型唯一序列码.
	 * <li>如果指定长度小于最小支持的最大长度，将产生默认长度的String型唯一序列码.</ul>
	 *
	 * @param serialNumberSize 指定序列码位数
	 * @return 长度为指定长度的String型唯一序列码
	 */
	public static synchronized String generateSerialNumberString(int serialNumberSize)
	{
		if (serialNumberSize > MAX_STRING_SERIAL_NUMBER_SIZE || serialNumberSize < MIN_SERIAL_NUMBER_SIZE)
		{
			return getSerialNumber(DEFAULT_SERIAL_NUMBER_SIZE);
		}
		else
		{
			return getSerialNumber(serialNumberSize);
		}
	}

	/**
	 * 返回默认长度的String型唯一序列码
	 *
	 * @return 长度为默认长度的String型唯一序列码
	 */
	public static synchronized String generateSerialNumberString()
	{
		return getSerialNumber(DEFAULT_SERIAL_NUMBER_SIZE);
	}

	/**
	 * 根据指定长度产生的String型唯一序列码.  唯一序列号由三部分构成:
	 * <ul>
	 * <li>随机函数生成的伪随机序列
	 * <li>并发偏移的序列
	 * <li>时间便宜序列.
	 * </ul>
	 *
	 * @param serialNumberSize 指定序列码位数
	 * @return 长度为指定长度的String型唯一序列码
	 */
	private static synchronized String getSerialNumber(int serialNumberSize)
	{
		return getTimestampOffset(serialNumberSize - FIXED_OFFSET_SIZE) + getConcurrentOffset() + getRandOffset();
	}

	/**
	 * 并发偏移序列，位数由并发偏移位数确定，不够位数许以补位符补位
	 *
	 * @return 并发偏移序列
	 */
	private static synchronized String getConcurrentOffset()
	{
		offset = (offset + 1) % MAX_CONCURRENT_OFFSET;
		StringBuilder concurrentOffset = new StringBuilder();
		concurrentOffset.append(offset);
		while (concurrentOffset.length() < CONCURRENT_OFFSET_SIZE)
		{
			concurrentOffset.insert(0, FILL_LETTER);
		}
		return concurrentOffset.toString();
	}

	/**
	 * 随机偏移序列，位数由随机偏移位数确定，不够位数许以补位符补位
	 *
	 * @return 随机偏移序列
	 */
	private static String getRandOffset()
	{
		StringBuilder randOffset = new StringBuilder();
		randOffset.append(randGenerator.nextInt(MAX_RAND_OFFSET));
		while (randOffset.length() < RAND_OFFSET_SIZE)
		{
			randOffset.insert(0, FILL_LETTER);
		}
		return randOffset.toString();
	}

	/**
	 * 时间偏移序列，长度由序列总长度、随机偏移序列长度以及并发偏移序列长度共同确定，
	 * 不够位数许以补位符补位
	 *
	 * @return 时间偏移序列
	 */
	private static String getTimestampOffset(int timestampOffsetSize)
	{
		StringBuilder timestampOffset = new StringBuilder();
		timestampOffset.append(TimeUtil.now(TIME_OFFSET_FORMAT));
		while (timestampOffset.length() < timestampOffsetSize)
		{
			timestampOffset.append(FILL_LETTER);
		}
		while (timestampOffset.length() > timestampOffsetSize)
		{
			timestampOffset.deleteCharAt(0);
		}
		return timestampOffset.toString();
	}
	
	
	public static void main(String[] args)
	{
		System.out.println(SerialNumberGenerator.generateSerialNumberString(SerialNumberGenerator.MAX_STRING_SERIAL_NUMBER_SIZE));
		System.out.println(SerialNumberGenerator.generateSerialNumberString(SerialNumberGenerator.MAX_STRING_SERIAL_NUMBER_SIZE));
		System.out.println(SerialNumberGenerator.generateSerialNumberString(SerialNumberGenerator.MAX_STRING_SERIAL_NUMBER_SIZE));
		System.out.println(SerialNumberGenerator.generateSerialNumberString(SerialNumberGenerator.MAX_STRING_SERIAL_NUMBER_SIZE));
		System.out.println(SerialNumberGenerator.generateSerialNumberString(SerialNumberGenerator.MAX_STRING_SERIAL_NUMBER_SIZE));
		System.out.println(SerialNumberGenerator.generateSerialNumberString(SerialNumberGenerator.MAX_STRING_SERIAL_NUMBER_SIZE));
		
	}

}
