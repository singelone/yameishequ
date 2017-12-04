/*
 * 文 件 名:  StringUtil.java
 * 描    述:  <描述>
 * 修 改 人:  Administrator
 * 修改时间:  2014年7月1日
 */
package com.app.ymsq.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;
import java.util.regex.Pattern;

/**
 * Description：字符串处理工具类
 * 
 * @author Administrator
 * @version [版本号]
 * @date [2014年7月1日]
 */
public class StringUtil
{
	// 手机号码正则表达式
	private static Pattern phonePattern = Pattern.compile("^[0-9]{11}$");
	
	/**
	 * 校验手机号码格式.
	 * 
	 * @param phone
	 * @return
	 */
	public static boolean validateMobilePhone(String phone)
	{
		return phone != null && !"".equals(phone.trim()) && phonePattern.matcher(phone).matches();
	}
	/**
	 * Description:判断字符串是否为空
	 * 
	 * @param str
	 * @return
	 * 
	 * @return boolean [返回值说明]
	 * @exception throws [异常说明]
	 */
	public static boolean isNull(String str)
	{
		if (str == null || "".equals(str.trim()))
		{
			return true;
		}

		return false;
	}
	
	public static String getRandom4(){
		int max=10000;
        int min=1000;
		Random random = new Random();
        int s = random.nextInt(max)%(max-min+1) + min;
        return s+"";
	}
	
	public static String codePassword(String password,String salt){
		//密码加密处理
		String a = MD5Util.GetMD5Code(password);
		String a1 = a.substring(2, 27);
		String b = MD5Util.GetMD5Code(salt);
		String b1 = b.substring(0,b.length()-1);
		String pas = MD5Util.GetMD5Code(a1+b1);
		return pas;
	}

	/**
	 * Description:判断对象是否为空
	 * 
	 * @param obj
	 * @return
	 * 
	 * @return boolean [返回值说明]
	 * @exception throws [异常说明]
	 */
	public static boolean isNull(Object obj)
	{
		if (obj == null)
		{
			return true;
		}
		if (obj instanceof String)
		{
			return isNull((String) obj);
		}
		return false;
	}

	/**
	 * Description:判断字符数组是否为空
	 * 
	 * @param ss
	 * @return
	 * 
	 * @return boolean [返回值说明]
	 * @exception throws [异常说明]
	 */
	public static boolean isNull(String[] strArray)
	{
		if (strArray == null || strArray.length == 0)
		{
			return true;
		}

		for (int i = 0; i < strArray.length; i++)
		{
			if (strArray[i] == null || "".equals(strArray[i].trim()))
			{
				return true;
			}
		}

		return false;
	}

	/**
	 * Description:判断是否为数字
	 * 
	 * @param str
	 * @return
	 * 
	 * @return boolean [返回值说明]
	 * @exception throws [异常说明]
	 */
	public static boolean isNumber(String str)
	{
		if (null == str || "".equals(str))
		{
			return false;
		}
		else
		{
			return Pattern.matches("^[0-9]+$", str);
		}
	}
	
	public static boolean isPer(String str)
	{
		if (null == str || "".equals(str))
		{
			return false;
		}
		else
		{
			return Pattern.matches("[1-9]|[1-9]\\d|100", str);
		}
	}
	
	/**
	 * isNumber不能识别负数，新增isNum（判断整数，包含正数、负数，0）
	 * @param str
	 * @return
	 */
	public static boolean isNum(String str)
	{
		if (null == str || "".equals(str))
		{
			return false;
		}
		else
		{
			return Pattern.matches("^-?[0-9]+$", str);
		}
	}
	
	/**
	 * 判断是否手机号
	 * @param str
	 * @return
	 */
	public static boolean isMobile(String str)
	{
		if (null == str || "".equals(str))
		{
			return false;
		}else if(!str.startsWith("1") || str.length() != 11){
			return false;
		}else {
			return Pattern.matches("[1-9]\\d*", str);
		}
	}
	
	/**
	 * 判断是否QQ
	 * @param str
	 * @return
	 */
	public static boolean isQq(String str)
	{
		if (null == str || "".equals(str))
		{
			return false;
		}
		else
		{
			return Pattern.matches("[1-9][0-9]{4,14}", str);
		}
	}
	
	/**
	 * Description:判断是否为数字
	 * 
	 * @param str
	 * @return
	 * 
	 * @return boolean [返回值说明]
	 * @exception throws [异常说明]
	 */
	public static boolean isInt(String str)
	{
		if (null == str || "".equals(str))
		{
			return false;
		}
		else
		{
			try{
				Integer.parseInt(str);
				return true;
			}catch (Exception ex){
				return false;
			}
		}
	}

	
	/**
	 * Description:判断是否为字母
	 * 
	 * @param str
	 * @return
	 * 
	 * @return boolean [返回值说明]
	 * @exception throws [异常说明]
	 */
	public static boolean isLetter(String str)
	{
		if (null == str || "".equals(str))
		{
			return false;
		}
		else
		{
			return Pattern.matches("^[A-Za-z]+$", str);
		}
	}

	/**
	 * Description:判断是否为数字字母
	 * 
	 * @param str
	 * @return
	 * 
	 * @return boolean [返回值说明]
	 * @exception throws [异常说明]
	 */
	public static boolean isNumberOrLetter(String str)
	{
		if (null == str || "".equals(str))
		{
			return false;
		}
		else
		{
			return Pattern.matches("^[0-9A-Za-z]+$", str);
		}
	}

	/**
	 * Description:判断是否为数字字母或者.
	 * 
	 * @param str
	 * @return
	 * 
	 * @return boolean [返回值说明]
	 * @exception throws [异常说明]
	 */
	public static boolean isNumberOrLetterOrDot(String str)
	{
		if (null == str || "".equals(str))
		{
			return false;
		}
		else
		{
			return Pattern.matches("^[.0-9A-Za-z]+$", str);
		}
	}

	/**
	 * Description:检查非法字符
	 * 
	 * @param s
	 * @return
	 * 
	 * @return boolean [返回值说明]
	 * @exception throws [异常说明]
	 */
	public static boolean isUnlawfulChar(String s)
	{
		if (null == s || "".equals(s))
		{
			return false;
		}
		else
		{
			return Pattern.matches("^[^`~@#\\$%\\^&\\*\\(\\)=\\!\\+\\\\/\\|<>\\?;\\:\\.'\"\\{\\}\\[\\]??, ]*$", s);
		}
	}

	/**
	 * Description:检查字符串中是否含有SQL语句
	 * 
	 * @param str
	 * @return
	 * 
	 * @return boolean [返回值说明]
	 * @exception throws [异常说明]
	 */
	public static boolean isContainSql(String str)
	{
		if (isNull(str))
		{
			return false;
		}
		String para = str.toUpperCase();
		if (para.contains("SELECT") && para.contains("FROM"))
		{
			return true;
		}

		if (para.contains("UPDATE") && para.contains("SET"))
		{
			return true;
		}
		if (para.contains("DELETE"))
		{
			return true;
		}
		if (para.contains("TRUNCATE") && para.contains("TABLE"))
		{
			return true;
		}
		if (para.contains("DROP") && para.contains("TABLE"))
		{
			return true;
		}
		if (para.contains("ALTER") && para.contains("TABLE"))
		{
			return true;
		}
		if (para.contains("ALTER") && para.contains("USER"))
		{
			return true;
		}
		return false;
	}

	/**
	 * Description:生成随机码
	 * 
	 * @param length
	 *            长度位数
	 * @return
	 * 
	 * @return String [返回值说明]
	 * @exception throws [异常说明]
	 */
	public static String randomCode(int length)
	{
		// 生成随机码
		String verifyCode = "";

		for (int i = 0; i < length; i++)
		{
			Random r = new Random();
			verifyCode += String.valueOf(r.nextInt(10));
		}
		return verifyCode;
	}
	
	/**
	 * 随机生成字符串
	 * @param length
	 * @return
	 */
	public static String getRandomString(int length) { //length表示生成字符串的长度  
	    String base = "abcdefghijklmnopqrstuvwxyz0123456789QWERTYUIOPASDFGHJKLZXCVBNM";     
	    Random random = new Random();     
	    StringBuffer sb = new StringBuffer();     
	    for (int i = 0; i < length; i++) {     
	        int number = random.nextInt(base.length());     
	        sb.append(base.charAt(number));     
	    }     
	    return sb.toString();     
	 }
	
	/**
	 * 判断str中某个字符的个数
	 * 
	 * @param str1
	 * @param str2
	 * @return counter
	 */
	
	public static int countStr(String str1, String str2) {
		int count = 0;
		char[] charArray = str1.toCharArray();
		for (char c : charArray) {
			if(c == '_'){
				count ++;
			}
		}
		return count;
	}
	
	public String getValueByKey(String key,String path) throws Exception
	{
		try
		{
			Properties pps = new Properties();
			InputStream in = getClass().getResourceAsStream(path);
			if (in == null)
			{
				in = getClass().getClassLoader().getResourceAsStream(path);
			}
			pps.load(in);
			return pps.getProperty(key);

		}
		catch (IOException e)
		{
			throw new Exception("读取配置出错：", e);
		}
	}
	
	public static void main(String[] args) {
		StringUtil mobile = new StringUtil();
		try {
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
