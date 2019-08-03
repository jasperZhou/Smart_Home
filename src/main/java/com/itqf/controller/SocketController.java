package com.itqf.controller;


import com.itqf.pojo.Socket;
import com.itqf.service.SocketService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class SocketController {

    @Resource
    private SocketService socketService;


    //主键查看
    @RequestMapping(method = RequestMethod.GET, value = "/smarthome/socket/show")
    public Map findbyid(int id) {

        Socket socket = socketService.selectByPrimaryKey(id);



        Map m = new HashMap();
        m.put("socketid", socket.getSocketid());
        m.put("socketimg", socket.getSocketimg());
        m.put("status", socket.getStatus());




        Map map = new HashMap();
        //map.put("data", m);

        return map;
    }







}
