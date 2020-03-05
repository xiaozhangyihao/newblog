package com.baidu.controller;

import com.baidu.mapper.AccountMapper;
import com.baidu.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class RegisterController {
    @Autowired
    AccountMapper accountMapper;
    @RequestMapping("/register")    //注册请求
    public String register(String username, String password, String repassword, String tel, String yanzhengma, Model model){
        Account account = new Account();
        if(!password.equals(repassword)){
            model.addAttribute("mima","两次密码不一致");
            return "register";
        }
        account.setUname(username);
        account.setPwd(password);
        account.setTel(tel);
        accountMapper.addAccount(account);
        return "login";
    }
}
