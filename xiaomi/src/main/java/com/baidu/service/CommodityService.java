package com.baidu.service;


import com.baidu.mapper.CommodityMapper;
import com.baidu.pojo.Commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.sql.DataSource;
import java.util.List;

@Service
public class CommodityService {

    @Autowired
    DataSource dataSource;
    @Autowired
    CommodityMapper commodityMapper;

    public List<Commodity> queryCommodity(Integer category,String size){
        List<Commodity> commodityList = commodityMapper.queryCommodity(category,size);
        return commodityList;
    }

}
