package com.baidu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
    @RequestMapping("/toCart")
    public String toCart(){
        return "cart";
    }



}
