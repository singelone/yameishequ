package com.app.ymsq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ymsq.dao.saller.SallerDao;
import com.app.ymsq.dao.saller.StationOrderDao;
import com.app.ymsq.dao.saller.StationUserDao;
import com.app.ymsq.dto.saller.StationUserDTO;
import com.app.ymsq.model.saller.Saller;
import com.app.ymsq.model.saller.StationUser;
import com.app.ymsq.model.saller.StationUserQuery;
import com.app.ymsq.model.saller.StationUserQuery.Criteria;
import com.app.ymsq.service.StationService;

@Service
public class StationServiceImpl implements StationService{

	@Autowired
	private SallerDao sallerDao;
	@Autowired
	private StationUserDao stationUserDao;
	@Autowired
	private StationOrderDao stationOrderDao;
	
	
	@Override
	public Saller getStation(StationUserDTO dto) throws Exception {
		// TODO Auto-generated method stub
		StationUserQuery example = new StationUserQuery();
		Criteria criteria = example.createCriteria();
		criteria.andUserNameEqualTo(dto.getUserName());
		criteria.andMobileEqualTo(dto.getMobile());
		List<StationUser> list = stationUserDao.selectByExample(example);
		if (list == null || list.size() < 1) {
			return null;
		}
		return sallerDao.selectByPrimaryKey(list.get(0).getSellerId());
	}

}
