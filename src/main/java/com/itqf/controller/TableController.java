package com.itqf.controller;

import com.itqf.pojo.Tablelamp;
import com.itqf.service.TablelampService;
import com.itqf.util.DataView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class TableController {


    @Resource
    private TablelampService tablelampService;


    //全查展示
    @RequestMapping(method = RequestMethod.GET, value = "/firstpage/equipment/socket")
    public Map findall() {
        List findall = tablelampService.findall();

        Map map = new HashMap();

        map.put("data", findall);

        return map;
    }


    //主键查看
    @RequestMapping(method = RequestMethod.GET, value = "/equipment/lamp/show")
    public Map findbyid(int id) {
        Tablelamp tablelamp = tablelampService.findbyid(id);



        Map m = new HashMap();
        m.put("temperature", tablelamp.getUrl());
        m.put("state", tablelamp.getTablelampid());
        m.put("lightness", tablelamp.getName());

        Map map = new HashMap();
        map.put("data", m);

        return map;
    }


    //状态修改
    @RequestMapping(method = RequestMethod.GET, value = "/equipment/lamp/update")
    public DataView update(Tablelamp tablelamp) {
        int i = tablelampService.updateByPrimaryKeySelective(tablelamp);


        DataView<Tablelamp> dataView = new DataView<Tablelamp>();
        dataView.setMsg("成功");

        List<Tablelamp> t = new ArrayList();
        t.add(tablelamp);
        dataView.setData(t);

        return dataView;

    }




}
