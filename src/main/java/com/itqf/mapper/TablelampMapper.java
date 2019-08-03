package com.itqf.mapper;

import com.itqf.pojo.Tablelamp;

import java.util.List;

public interface TablelampMapper {

    //全查
    List<Tablelamp> findall();

    int deleteByPrimaryKey(Integer tablelampid);

    int insert(Tablelamp record);

    int insertSelective(Tablelamp record);

    Tablelamp selectByPrimaryKey(Integer tablelampid);

    int updateByPrimaryKeySelective(Tablelamp record);

    int updateByPrimaryKey(Tablelamp record);
}