package com.baidu.controller;

import com.baidu.pojo.Commodity;
import com.baidu.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ToIndexController {

    @Autowired
    CommodityService commodityService;
    @RequestMapping({"/index","/"})//进入index界面请求
    public String tIndex(Model model){
        List<Commodity> mxsp =  commodityService.queryCommodity(1,"5");
        List<Commodity> pj1 =  commodityService.queryCommodity(2,"1,4");
        List<Commodity> pj2 =  commodityService.queryCommodity(2,"6,3");
        model.addAttribute("mxsp",mxsp);
        model.addAttribute("pj1",pj1);
        model.addAttribute("pj2",pj2);
        return "index";
    }


}
