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
    public DataView findbyid(int id) {
        //int i= tablelampService.updateByPrimaryKeySelective(tablelamp);

        Tablelamp tablelamp = tablelampService.findbyid(id);

        DataView<Tablelamp> dataView = new DataView<Tablelamp>();
        dataView.setMsg("成功");

        List<Tablelamp> t = new ArrayList();
        t.add(tablelamp);
        dataView.setData(t);

        return dataView;
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

    //状态修改
    @RequestMapping(method = RequestMethod.GET, value = "/equipment/lamp/insert")
    public DataView insert(Tablelamp tablelamp) {
        int i = tablelampService.insertSelective(tablelamp);


        DataView<Tablelamp> dataView = new DataView<Tablelamp>();
        dataView.setCode(0);
        dataView.setMsg("成功1");

        List<Tablelamp> t = new ArrayList();
        t.add(tablelamp);
        dataView.setData(t);

        return dataView;

    }


}
