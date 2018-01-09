package com.app.ymsq.dao.sms;

import com.app.ymsq.model.sms.SmsLog;
import com.app.ymsq.model.sms.SmsLogQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsLogDao {
    int countByExample(SmsLogQuery example);

    int deleteByExample(SmsLogQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmsLog record);

    int insertSelective(SmsLog record);

    List<SmsLog> selectByExample(SmsLogQuery example);

    SmsLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmsLog record, @Param("example") SmsLogQuery example);

    int updateByExample(@Param("record") SmsLog record, @Param("example") SmsLogQuery example);

    int updateByPrimaryKeySelective(SmsLog record);

    int updateByPrimaryKey(SmsLog record);
}