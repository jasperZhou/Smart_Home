package com.itqf.service;

import com.itqf.mapper.Pm25Mapper;
import com.itqf.pojo.Pm25;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;





@Service
public class Pm25ServiceImpl implements Pm25Service {

    @Resource
    private Pm25Mapper pm25Mapper;





    @Override
    public int deleteByPrimaryKey(Integer pmid) {
        return 0;
    }

    @Override
    public int insert(Pm25 record) {
        return 0;
    }

    @Override
    public int insertSelective(Pm25 record) {
        return 0;
    }

    @Override
    public Pm25 selectByPrimaryKey(Integer pmid) {
        return pm25Mapper.selectByPrimaryKey(pmid);
    }

    @Override
    public int updateByPrimaryKeySelective(Pm25 record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Pm25 record) {
        return 0;
    }
}
