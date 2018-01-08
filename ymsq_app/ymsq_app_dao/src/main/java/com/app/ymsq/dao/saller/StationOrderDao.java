package com.app.ymsq.dao.saller;

import com.app.ymsq.model.saller.StationOrder;
import com.app.ymsq.model.saller.StationOrderQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StationOrderDao {
    int countByExample(StationOrderQuery example);

    int deleteByExample(StationOrderQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(StationOrder record);

    int insertSelective(StationOrder record);

    List<StationOrder> selectByExample(StationOrderQuery example);

    StationOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StationOrder record, @Param("example") StationOrderQuery example);

    int updateByExample(@Param("record") StationOrder record, @Param("example") StationOrderQuery example);

    int updateByPrimaryKeySelective(StationOrder record);

    int updateByPrimaryKey(StationOrder record);
}