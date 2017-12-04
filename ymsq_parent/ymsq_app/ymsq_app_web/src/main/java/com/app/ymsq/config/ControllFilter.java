package com.app.ymsq.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class ControllFilter implements Filter {

    private static Logger logger = Logger.getLogger(ControllFilter.class);

    
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
	
		HttpServletResponse response = (HttpServletResponse) res;
	    response.setHeader("Access-Control-Allow-Origin", "*");
	    response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE,PUT");
	    response.setHeader("Access-Control-Max-Age", "3600");
	    response.addHeader("Access-Control-Allow-Headers", "x-requested-with,Content-Type,token");
	    chain.doFilter(request, res);
	    
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	

}