package com.app.ymsq.interceptor;

import java.io.PrintWriter;
import java.lang.annotation.Annotation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class AuthInterceptor extends HandlerInterceptorAdapter {
	
    public static final String SESSION_USERID = "kUSERID";  
    public static final String SESSION_AUTHS = "kAUTHS"; 
	
    private static Logger logger = LogManager.getLogger(AuthInterceptor.class);
    

	boolean flag = false;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.info("# interceptor: auth");
		if (handler instanceof HandlerMethod) {
			Annotation[] ans=  ((HandlerMethod) handler).getMethod().getDeclaredAnnotations();
            //Auth auth = ((HandlerMethod) handler).getMethod().getAnnotation(Auth.class);
//			if (auth != null) {// 有权限控制的就要检查
//				String token = request.getHeader("token");
//				if (request.getHeader("token") == null ) {// 没登录就要求登录
//					flag = false;
//				} else {// 登录了检查,方法上只是@Auth,表示只要求登录就能通过.@Auth("authority")这类型,验证用户权限
//					//flag = userService.checkToken(token);
//				}
//			}
		}
		if (!flag) {
			response.setStatus(HttpStatus.FORBIDDEN.value());
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.write("{\"type\":\"nosignin\",\"msg\":\"用户凭证已过期\"}");
			out.flush();
			out.close();
		}
		return flag;
	}
}
