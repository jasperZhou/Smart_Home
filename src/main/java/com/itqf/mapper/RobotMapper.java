package com.itqf.mapper;


import com.itqf.pojo.Robot;

public interface RobotMapper {
    int deleteByPrimaryKey(Integer robotid);

    int insert(Robot record);

    int insertSelective(Robot record);

    Robot selectByPrimaryKey(Integer robotid);

    int updateByPrimaryKeySelective(Robot record);

    int updateByPrimaryKey(Robot record);
}