package com.baidu.service;

import com.baidu.mapper.AccountMapper;
import com.baidu.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

/**
 * 登录界面的查询
 */
@Service
public class AccountService {
    @Autowired
    DataSource dataSource;
    @Autowired
    AccountMapper accountMapper;

    /**
     *
     * @param account  用户
     * @return ture 代表有这个用户,登录成功,false失败
     */
    public boolean toLogin(Account account){

        Account account1 = accountMapper.queryAccount(account);
        if(account1!=null){
            return true;
        }else {
            return false;
        }
    }
}
