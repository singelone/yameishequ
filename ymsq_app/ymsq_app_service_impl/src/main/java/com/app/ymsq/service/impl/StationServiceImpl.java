package com.app.ymsq.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ymsq.dao.saller.DeliverPriceDao;
import com.app.ymsq.dao.saller.SallerDao;
import com.app.ymsq.dao.saller.StationOrderDao;
import com.app.ymsq.dao.saller.StationUserDao;
import com.app.ymsq.dto.saller.StationUserDTO;
import com.app.ymsq.model.saller.DeliverPrice;
import com.app.ymsq.model.saller.Saller;
import com.app.ymsq.model.saller.StationOrder;
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
	@Autowired
	private DeliverPriceDao deliverPriceDao;
	
	
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


	@Override
	public Boolean sentPriceAdd(List<DeliverPrice> list) throws Exception {
		// TODO Auto-generated method stub
		return deliverPriceDao.addBatch(list)>0?true:false;
	}


	@Override
	public Boolean pick(StationOrder order) {
		// TODO Auto-generated method stub
		order.setOrderNo("SJ-158"+UUID.randomUUID().toString().replaceAll("-", "").substring(0, 6));
		order.setOrderSubmitTime(new Date());
		order.setCreateTime(new Date());
		order.setStatus((byte)0);
		return stationOrderDao.insertSelective(order)>0?true:false;
	}


	@Override
	public List<StationUser> listStationUser(String sellerId) {
		// TODO Auto-generated method stub
		StationUserQuery example = new StationUserQuery();
		Criteria criteria = example.createCriteria();
		criteria.andSellerIdEqualTo(Integer.parseInt(sellerId));
		return stationUserDao.selectByExample(example);
	}

}
