package com.app.ymsq.dao.saller;

import com.app.ymsq.model.saller.DeliverPrice;
import com.app.ymsq.model.saller.DeliverPriceQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliverPriceDao {
    int countByExample(DeliverPriceQuery example);

    int deleteByExample(DeliverPriceQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(DeliverPrice record);

    int insertSelective(DeliverPrice record);

    List<DeliverPrice> selectByExample(DeliverPriceQuery example);

    DeliverPrice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeliverPrice record, @Param("example") DeliverPriceQuery example);

    int updateByExample(@Param("record") DeliverPrice record, @Param("example") DeliverPriceQuery example);

    int updateByPrimaryKeySelective(DeliverPrice record);

    int updateByPrimaryKey(DeliverPrice record);
}