/*
 * 文 件 名:  TimeUtil.java
 * 描    述:  <描述>
 * 修 改 人:  Administrator
 * 修改时间:  2014年7月1日
 */
package com.app.ymsq.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Description：日期时间工具类
 * 
 * @author Administrator
 * @version [版本号]
 * @date [2014年7月1日]
 */
public class TimeUtil
{

	/**
	 * Description: 获得当前的日期，固定格式：yyyy-MM-dd HH:mm:ss
	 * 
	 * @return String
	 */
	public static String now()
	{
		return getDateString(new Date());
	}

	/**
	 * Description：根据指定的格式获得当前的时间字符形式
	 * 
	 * @param format
	 *            格式化形式，如：yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String now(String format)
	{
		return getDateStringByFormat(new Date(), format);
	}

	/**
	 * Description:通过时间获得格式化的字符串 <br>
	 * 
	 * @param date
	 *            时间对象
	 * @return String 格式化后的字符串(异常返回空)
	 */
	public static String getDateString(Date date)
	{
		String dateString = "";
		if (date == null)
		{
			return dateString;
		}
		try
		{
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			dateString = df.format(date);
		}
		catch (Exception e)
		{
			dateString = "";
		}
		return dateString;
	}

	/**
	 * Description: 通过制定的格式化形式获得时间的字符串<br>
	 * 
	 * @param date
	 *            需要格式化的时间
	 * @param format
	 *            格式化类型 eg:yyyy-MM-dd HH:mm:ss
	 * @return String 格式化后的字符串(异常返回空)
	 */
	public static String getDateStringByFormat(Date date, String format)
	{
		String dateString = "";
		if (date == null)
		{
			return dateString;
		}
		try
		{
			SimpleDateFormat df = new SimpleDateFormat(format);
			dateString = df.format(date);
		}
		catch (Exception e)
		{
			dateString = "";
		}
		return dateString;
	}

	/**
	 * Description: 通过制定的格式化形式获得时间的字符串<br>
	 * 
	 * @param strDate
	 *            需要格式化的时间
	 * @param format
	 *            格式化类型 eg:yyyy-MM-dd HH:mm:ss
	 * @return String 格式化后的字符串(异常返回空)
	 */
	public static String getDateStringByFormat(String strDate, String format)
	{
		String dateString = "";
		if (strDate == null || "".equals(strDate.trim()))
		{
			return dateString;
		}

		strDate = strDate.trim();

		Date date = null;
		if (strDate.length() == 10)
		{
			date = getShortDate(strDate);
		}
		else
		{
			date = getLongDate(strDate);
		}

		try
		{
			SimpleDateFormat df = new SimpleDateFormat(format);
			dateString = df.format(date);
		}
		catch (Exception e)
		{
			dateString = "";
		}

		return dateString;
	}

	/**
	 * Description:通过"yyyy-MM-dd HH:mm:ss"字符串获得时间
	 * 
	 * @param dateString
	 * @return
	 * 
	 * @return Date [返回值说明]
	 * @exception throws [异常说明]
	 */
	public static Date getDate(String dateString)
	{
		if (dateString == null || "".equals(dateString))
		{
			return null;
		}

		Date date = null;
		try
		{
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			date = df.parse(dateString);
		}
		catch (Exception e)
		{
			date = null;
		}
		return date;
	}

	/**
	 * Description:通过制定的格式化方法获得date <br>
	 * 
	 * @param dateString
	 *            日期的字符表现
	 * @param format
	 *            格式化的字符串 eg："yyyy-MM-dd HH:mm:ss"
	 * @return Date (异常返回null)
	 */
	public static Date getDateByFormat(String dateString, String format)
	{
		Date date = null;
		try
		{
			SimpleDateFormat df = new SimpleDateFormat(format);
			date = df.parse(dateString);
		}
		catch (Exception e)
		{
			date = null;
		}

		return date;
	}

	/**
	 * Description: 通过"yyyy-MM-dd HH:mm:ss"字符串获得时间<br>
	 * 
	 * @param format
	 * @return Date (异常返回null)
	 */
	public static Date getLongDate(String dateString)
	{
		if (dateString == null || "".equals(dateString))
		{
			return null;
		}

		Date date = null;
		try
		{
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			date = df.parse(dateString);
		}
		catch (Exception e)
		{
			date = null;
		}
		return date;
	}

	/**
	 * Description: 通过"yyyy-MM-dd HH:mm:ss"字符串获得时间<br>
	 * 
	 * @param format
	 * @return Date (异常返回null)
	 */
	public static Date getLongDate(String dateString, String format)
	{
		if (dateString == null || "".equals(dateString))
		{
			return null;
		}

		Date date = null;
		try
		{
			SimpleDateFormat df = new SimpleDateFormat(format);
			date = df.parse(dateString);
		}
		catch (Exception e)
		{
			date = null;
		}
		return date;
	}

	/**
	 * Description: 通过"yyyy-MM-dd"字符串获得时间<br>
	 * 
	 * @param format
	 * @return Date (异常返回null)
	 */
	public static Date getShortDate(String dateString)
	{
		if (dateString == null || "".equals(dateString))
		{
			return null;
		}

		Date date = null;
		try
		{
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			date = df.parse(dateString);
		}
		catch (Exception e)
		{
			date = null;
		}
		return date;
	}

	/**
	 * Description: 判断两个日期是否相同 <br> Implement: <br> 1、… <br> 2、… <br>
	 * [参数列表，说明每个参数用途]
	 * 
	 * @param
	 * @return boolean
	 * @exception/throws [违例类型] [违例说明]
	 * @see [类、类#方法、类#成员]
	 */
	public static boolean isSameDate(Date date1, Date date2)
	{
		if (date1 == null || date2 == null)
		{
			return false;
		}

		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		cal1.setTime(date1);
		cal2.setTime(date2);

		return (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)) && (cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH))
				&& (cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH));
	}

	/**
	 * Description: 时间转换成毫秒数
	 * 
	 * @param date
	 * @return long
	 * @exception/throws
	 */
	public final static long tranDateToMillisecond(String date)
	{
		if (date == null)
		{
			return 0;
		}
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try
		{
			Date d = simpleDate.parse(date);
			return d.getTime();
		}
		catch (ParseException e)
		{
			return 0;
		}
	}

	// 将yyyy-MM-dd格式的时间转化为yyyyMM格式
	public final static String dateFormat(String date)
	{
		String[] tempList = date.split("-");
		String newDate = "";
		if (tempList.length > 1)
		{
			newDate = tempList[0] + tempList[1];
		}
		else
		{
			newDate = tempList[0];
		}

		return newDate;
	}

	/**
	 * Description:获得数据库可以认识的当前时间 <br>
	 * 
	 * @return java.sql.Date
	 */
	public static java.sql.Date getSqlNow()
	{
		return new java.sql.Date(new Date().getTime());
	}

	/**
	 * Description: 把string转化为数据库使用的时间(yyyy-MM-dd HH:mm:ss)<br>
	 * 
	 * @param dateString
	 * @return java.sql.Date
	 */
	public static java.sql.Date getSqlDate(String dateString)
	{
		if (dateString == null || "".equals(dateString))
		{
			return null;
		}
		Date date = null;
		try
		{
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			date = df.parse(dateString);
		}
		catch (Exception e)
		{
			return null;
		}
		return new java.sql.Date(date.getTime());
	}

	/**
	 * Description: 获得sql里面的时间<br>
	 * 
	 * @param dateString
	 * @param format
	 * @return java.sql.Date
	 */
	public static java.sql.Date getSqlDateByFormat(String dateString, String format)
	{
		if (dateString == null || "".equals(dateString))
		{
			return null;
		}
		Date date = null;
		try
		{
			SimpleDateFormat df = new SimpleDateFormat(format);
			date = df.parse(dateString);
		}
		catch (Exception e)
		{
			return null;
		}
		return new java.sql.Date(date.getTime());
	}
	
	/** 
	 * Description：根据制定日志取当前星期几
	 *
	 * @param date 制定日期
	 * @return 星期，1-星期1；7-星期日
	 */
	public static int getWeekDay(Date date) 
	{
		if  (date == null)
		{
			return -1;
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);		
		// 返回日期为{1...7}代表{星期日...星期六}，故做下转换
		int weekday = cal.get(Calendar.DAY_OF_WEEK) - 1 ;
		if (weekday <= 0)
		{
			weekday = 7;
		}
		
		return weekday;
	}
	
	/**
	 * 获取当前时间是当前月份的哪一天。
	 * create by majie
	 * @param date
	 * @return
	 */
	public static int getMonthDay(Date date) {
		if  (date == null)
		{
			return -1;
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.DAY_OF_MONTH);
	}
	
	/**
	 * 获取当前月份的上一个月的时间
	 * @param date
	 * @return
	 */
	public static Date getPerMonth(Date date) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.MONTH, cal.get(Calendar.MONTH) - 1);  
		Date time =  cal.getTime();  
		return time;
	}
	
	
}
