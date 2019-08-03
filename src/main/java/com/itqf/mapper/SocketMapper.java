package com.itqf.mapper;

import com.itqf.pojo.Socket;

public interface SocketMapper {
    int deleteByPrimaryKey(Integer socketid);

    int insert(Socket record);

    int insertSelective(Socket record);

    Socket selectByPrimaryKey(Integer socketid);

    int updateByPrimaryKeySelective(Socket record);

    int updateByPrimaryKey(Socket record);
}