package com.itqf.service;

import com.itqf.pojo.Robot;

public interface RobotService {

    int deleteByPrimaryKey(Integer robotid);

    int insert(Robot record);

    int insertSelective(Robot record);

    Robot selectByPrimaryKey(Integer robotid);

    int updateByPrimaryKeySelective(Robot record);

    int updateByPrimaryKey(Robot record);
}
