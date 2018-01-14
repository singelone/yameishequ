package com.app.ymsq.service;

import java.util.Map;

import com.app.ymsq.dto.saller.StationUserDTO;
import com.app.ymsq.model.user.User;

public interface UserService {

	Boolean regist(User user) throws Exception;

	Map<String,Object> login(User user) throws Exception;
	
	Map<String,Object> loginWihtTele(User user) throws Exception;
	
	Boolean checkToken(String token) throws Exception;

	User findByMobOrName(StationUserDTO dto);
}
