package com.itqf.service;

import com.itqf.pojo.Tablelamp;

import java.util.List;

public interface TablelampService {


    List<Tablelamp> findall();

    Tablelamp findbyid(int id);//改接口文档，查台灯主键查询

    int deleteByPrimaryKey(Integer tablelampid);

    int insert(Tablelamp record);

    int insertSelective(Tablelamp record);



    Tablelamp selectByPrimaryKey(Integer tablelampid);

    int updateByPrimaryKeySelective(Tablelamp record);

    int updateByPrimaryKey(Tablelamp record);

}
