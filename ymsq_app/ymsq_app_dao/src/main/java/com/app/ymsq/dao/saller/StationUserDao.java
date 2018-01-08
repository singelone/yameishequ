package com.app.ymsq.dao.saller;

import com.app.ymsq.model.saller.StationUser;
import com.app.ymsq.model.saller.StationUserQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StationUserDao {
    int countByExample(StationUserQuery example);

    int deleteByExample(StationUserQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(StationUser record);

    int insertSelective(StationUser record);

    List<StationUser> selectByExample(StationUserQuery example);

    StationUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StationUser record, @Param("example") StationUserQuery example);

    int updateByExample(@Param("record") StationUser record, @Param("example") StationUserQuery example);

    int updateByPrimaryKeySelective(StationUser record);

    int updateByPrimaryKey(StationUser record);
}