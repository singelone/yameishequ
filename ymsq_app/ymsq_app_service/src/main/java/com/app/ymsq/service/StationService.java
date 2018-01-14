package com.app.ymsq.service;

import java.util.List;

import com.app.ymsq.dto.saller.StationUserDTO;
import com.app.ymsq.model.saller.DeliverPrice;
import com.app.ymsq.model.saller.Saller;
import com.app.ymsq.model.saller.StationOrder;
import com.app.ymsq.model.saller.StationUser;

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

	Boolean sentPriceAdd(List<DeliverPrice> list)throws Exception;

	Boolean pick(StationOrder order);

	List<StationUser> listStationUser(String sellerId);
}
