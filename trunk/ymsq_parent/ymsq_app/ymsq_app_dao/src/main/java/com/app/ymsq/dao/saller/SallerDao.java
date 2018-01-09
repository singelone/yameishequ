package com.app.ymsq.dao.saller;

import com.app.ymsq.model.saller.Saller;
import com.app.ymsq.model.saller.SallerQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SallerDao {
    int countByExample(SallerQuery example);

    int deleteByExample(SallerQuery example);

    int deleteByPrimaryKey(Integer sellerId);

    int insert(Saller record);

    int insertSelective(Saller record);

    List<Saller> selectByExample(SallerQuery example);

    Saller selectByPrimaryKey(Integer sellerId);

    int updateByExampleSelective(@Param("record") Saller record, @Param("example") SallerQuery example);

    int updateByExample(@Param("record") Saller record, @Param("example") SallerQuery example);

    int updateByPrimaryKeySelective(Saller record);

    int updateByPrimaryKey(Saller record);
}