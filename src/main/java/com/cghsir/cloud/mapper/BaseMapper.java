package com.cghsir.cloud.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by cghsir on 2017/7/25.
 */
public interface BaseMapper <M,E>{
    long countByExample(E example);

    int deleteByExample(E example);

    int deleteByPrimaryKey(Long id);

    int insert(M record);

    int insertSelective(M record);

    List<M> selectByExample(E example);

    M selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") M record, @Param("example") E example);

    int updateByExample(@Param("record") M record, @Param("example") E example);

    int updateByPrimaryKeySelective(M record);

    int updateByPrimaryKey(M record);
}
