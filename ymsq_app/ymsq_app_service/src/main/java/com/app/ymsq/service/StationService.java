package com.app.ymsq.service;

import com.app.ymsq.dto.saller.StationUserDTO;
import com.app.ymsq.model.saller.Saller;

/**
 * 小站服务
 * @author wangbo
 *
 */
public interface StationService {

	/**
	 * 获取小站信息
	 * @param dto
	 * @return
	 * @throws Exception
	 */
	Saller getStation(StationUserDTO dto) throws Exception;

	
}
