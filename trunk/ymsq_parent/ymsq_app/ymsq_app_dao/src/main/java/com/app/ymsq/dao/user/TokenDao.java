package com.app.ymsq.dao.user;

import com.app.ymsq.model.user.Token;
import com.app.ymsq.model.user.TokenQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TokenDao {
    int countByExample(TokenQuery example);

    int deleteByExample(TokenQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Token record);

    int insertSelective(Token record);

    List<Token> selectByExample(TokenQuery example);

    Token selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Token record, @Param("example") TokenQuery example);

    int updateByExample(@Param("record") Token record, @Param("example") TokenQuery example);

    int updateByPrimaryKeySelective(Token record);

    int updateByPrimaryKey(Token record);
}