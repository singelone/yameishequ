package com.app.ymsq.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.net.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ymsq.dao.user.TokenDao;
import com.app.ymsq.dao.user.UserDao;
import com.app.ymsq.model.user.Token;
import com.app.ymsq.model.user.TokenQuery;
import com.app.ymsq.model.user.User;
import com.app.ymsq.model.user.UserQuery;
import com.app.ymsq.model.user.UserQuery.Criteria;
import com.app.ymsq.service.UserService;
import com.app.ymsq.util.DateUtil;
import com.app.ymsq.util.StringUtil;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	@Autowired
	private TokenDao tokenDao;
	
	@Override
	public Boolean regist(User user) throws Exception {
		// TODO Auto-generated method stub
		String password = user.getPassword();
		//密码加密
		String salt = StringUtil.getRandomString(8);
		String codePas = StringUtil.codePassword(password, salt);
		
		user.setPassword(codePas);
		user.setSalt(salt);
		return userDao.insertSelective(user)>0?true:false;
	}

	@Override
	public Map<String,Object> login(User user) throws Exception {
		// TODO Auto-generated method stub
		UserQuery example = new UserQuery();
		Criteria criteria = example.createCriteria();
		criteria.andNicknameEqualTo(user.getNickname());
		List<User> users = userDao.selectByExample(example );
		if (users == null || users.size() < 1) {
			return null;
		}
		
		String password = user.getPassword();
		String codePas = StringUtil.codePassword(password, users.get(0).getSalt());
		if (!codePas.equals(users.get(0).getPassword())) {
			return null;
		}
		
		//token
		String tok = Base64.encodeBase64String(codePas.getBytes());
		Token token = new Token();
		token.setCreateTime(new Date());
		token.setExpiredTime(DateUtil.getNextDay(1));
		token.setToken(tok);
		token.setUserId(user.getId());
		tokenDao.insertSelective(token);
		
		Map<String,Object> map = new HashMap<>();
		map.put("user", users.get(0));
		map.put("token", tok);
		
		return map;
	}

	@Override
	public Boolean checkToken(String token) throws Exception {
		// TODO Auto-generated method stub
		
		TokenQuery example = new TokenQuery();
		com.app.ymsq.model.user.TokenQuery.Criteria criteria = example.createCriteria();
		criteria.andTokenEqualTo(token);
		List<Token> list = tokenDao.selectByExample(example );
		if (list == null || list.size() < 1) {
			return false;
		}
		
		return new Date().before(list.get(0).getExpiredTime());
	}

	@Override
	public Map<String, Object> loginWihtTele(User user) throws Exception {
		// TODO Auto-generated method stub
		UserQuery example = new UserQuery();
		Criteria criteria = example.createCriteria();
		criteria.andMobileEqualTo(user.getMobile());
		List<User> users = userDao.selectByExample(example );
		if (users == null || users.size() < 1) {
			return null;
		}
		
		//token
		String tok = Base64.encodeBase64String(users.get(0).getPassword().getBytes());
		Token token = new Token();
		token.setCreateTime(new Date());
		token.setExpiredTime(DateUtil.getNextDay(1));
		token.setToken(tok);
		token.setUserId(user.getId());
		tokenDao.insertSelective(token);
		
		Map<String,Object> map = new HashMap<>();
		map.put("user", users.get(0));
		map.put("token", tok);
		
		return map;
	}

}
