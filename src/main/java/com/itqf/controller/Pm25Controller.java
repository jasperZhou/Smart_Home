package com.itqf.controller;


import com.itqf.pojo.Pm25;
import com.itqf.pojo.Tablelamp;
import com.itqf.service.Pm25Service;
import com.itqf.service.TablelampService;
import com.itqf.util.DataView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Pm25Controller {


    @Resource
    private Pm25Service pm25Service;


    //主键查看
    @RequestMapping(method = RequestMethod.GET, value = "/firstpage/equipment/pm25")
    public DataView findall(int id) {

        Pm25 pm25 = pm25Service.selectByPrimaryKey(id);

        DataView<Pm25> dataView = new DataView<Pm25>();


        List<Pm25> t = new ArrayList();
        t.add(pm25);
        dataView.setData(t);

        return dataView;
    }



}
