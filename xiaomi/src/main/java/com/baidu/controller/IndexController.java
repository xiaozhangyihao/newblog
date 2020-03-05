package com.baidu.controller;

import com.baidu.pojo.Account;
import com.baidu.pojo.Commodity;
import com.baidu.service.AccountService;
import com.baidu.service.CommodityService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("index")
@Controller
public class IndexController {
    @Autowired
    AccountService accountService;


    @RequestMapping("/sign") //登录请求
    public String toIndex(String username, String password, Model model, HttpSession session){
        Account account = new Account();
        session.setAttribute("username",username);
        account.setUname(username);
        account.setPwd(password);
        account.setTel("17737996380");
        boolean b = accountService.toLogin(account);
        if(b){
            return "redirect:/index";
        }else{
            model.addAttribute("msg","信息错误");
            return "login";
        }

    }
}
