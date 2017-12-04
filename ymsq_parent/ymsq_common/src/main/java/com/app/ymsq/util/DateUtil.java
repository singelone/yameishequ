/**
 *
 */
package com.app.ymsq.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * 
 * Description：时间处理的工具类
 * 
 * @author wlpc
 * @version [版本号]
 * @date [2015年5月22日]
 */
public class DateUtil {
	public static final Timestamp ZERO_TIMESTAMP = new Timestamp(0);

	public static final String FORMAT_DATE = "yyyy-MM-dd";

	public static final String FORMAT_DATETIME = "yyyy-MM-dd HH:mm:ss";

	public static final String FORMAT_MINUTE = "yyyy-MM-dd HH:mm";
	
	public static final String FORMAT_TIME = "yyyyMMddHHmmss";

	public static Date str2Date(String str, String pattern) {
		Date date = null;
		DateFormat format;
		try {
			format = new SimpleDateFormat(pattern, Locale.CHINESE);
			format.setLenient(false);
			date = format.parse(str);

		} catch (Exception e) {

		}
		return date;
	}

	public static String date2Str(Date date, String pattern) {
		if (null == date) {
			return null;
		}
		String str = null;
		try {
			SimpleDateFormat format = new SimpleDateFormat(pattern);
			str = format.format(date);
		} catch (Exception e) {
		}
		return str;
	}

	public static int getMonth() {
		Calendar cal = Calendar.getInstance();
		return cal.get(Calendar.MONTH) + 1;
	}

	public static int getHour() {
		Calendar cal = Calendar.getInstance();
		return cal.get(Calendar.HOUR_OF_DAY);
	}

	public static int getYear() {
		Calendar cal = Calendar.getInstance();
		return cal.get(Calendar.YEAR);
	}

	/**
	 * 
	 * 方法说明：获取两个时间段之间的月份
	 * 
	 * @return
	 */
	public static List<Integer> getMonths(Date minDate, Date maxDate) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");// 格式化为年月

		Calendar min = Calendar.getInstance();
		Calendar max = Calendar.getInstance();

		try {
			min.setTime(sdf.parse(sdf.format(minDate)));
			min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), 1);
			max.setTime(sdf.parse(sdf.format(maxDate)));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), 2);

		Calendar curr = min;
		while (curr.before(max)) {
			result.add(curr.get(Calendar.MONTH) + 1);
			curr.add(Calendar.MONTH, 1);
		}
		return result;
	}

	public static Date getDate(int year,int month) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");// 格式化为年月
		String monthStr;
		if(month<10){
			monthStr="0"+month;
		}else{
			monthStr=""+month;
		}
		return sdf.parse(year+"-"+monthStr);
	}

	 public static Integer getWeekOfDate(Date dt) {
	        Integer[] weekDays = {0, 1, 2, 3, 4, 5, 6};
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(dt);
	        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
	        if (w < 0)
	            w = 0;
	        return weekDays[w];
	    }
	 
	 /**
	  * 获取当日的指定小时
	  * @param a
	  * @return
	  */
	 public static Date getTheDay(Integer a){
		 Calendar calendar = Calendar.getInstance();
         calendar.setTime(new Date());
         calendar.set(Calendar.HOUR_OF_DAY, a);
         calendar.set(Calendar.MINUTE, 0);
         calendar.set(Calendar.SECOND, 0);
         Date zero = calendar.getTime();
         return zero;
	 }
	 
	 /**
	  * 当日加减运算
	  * @param day
	  * @return
	  */
	 public static Date getNextDay(Integer day){
		 Calendar calendar = Calendar.getInstance();
         calendar.setTime(new Date());
         calendar.add(Calendar.DAY_OF_MONTH, day);
         Date zero = calendar.getTime();
         return zero;
	 }
	 public static void main(String[] args) {
		 System.out.println(date2Str(getNextDay(1), DateUtil.FORMAT_DATETIME));
	 }
	 /**
	  * 指定时间加减多少分钟
	  * @param date
	  * @param a
	  * @return
	  */
	 public static Date addMinute(Date date,Integer a){
		 Calendar calendar = Calendar.getInstance();
         calendar.setTime(date);
         calendar.add(Calendar.MINUTE, a);
         Date zero = calendar.getTime();
         return zero;
	 }
}
