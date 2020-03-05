package com.baidu.mapper;

import com.baidu.pojo.Commodity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CommodityMapper {

//    @Select({"<script> SELECT * FROM user WHERE " +
//            "<if  test= "mobile != null and mobile != ''"> mobile = #{mobile} </if>" +
//            "<if  test= "star != null and star != ''">  AND star=#{star} </if>" +
//            "<if test ='startTime != null '>  AND UNIX_TIMESTAMP(update_time) >= #{startTime} </if>" +
//            "<if test ='endTime != null '>   AND UNIX_TIMESTAMP(update_time) &lt;= #{endTime} </if>" +
//            "<if test="count > 0">  LIMIT #{offset}, #{count} </if> </script>"})
////参数是对象,携带多参数进行模糊分页查询
//    List<User> getUserList(Request request);

    @Select("select * from commodity where category = #{category} limit ${size} ")
    public List<Commodity> queryCommodity(Integer category,String size);

}
