package com.itqf.service;

import com.itqf.pojo.Pm25;

public interface Pm25Service {
    int deleteByPrimaryKey(Integer pmid);

    int insert(Pm25 record);

    int insertSelective(Pm25 record);

    Pm25 selectByPrimaryKey(Integer pmid);

    int updateByPrimaryKeySelective(Pm25 record);

    int updateByPrimaryKey(Pm25 record);

}
