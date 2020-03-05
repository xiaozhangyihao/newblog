package com.baidu.mapper;

import com.baidu.pojo.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AccountMapper {

    @Select("select * from account where uname = #{uname} and pwd = #{pwd}")
    public Account queryAccount(Account account);

    @Insert("insert into account values(#{id},#{uname},#{pwd},#{tel})")
    public void addAccount(Account account);
}
