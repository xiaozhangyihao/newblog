package com.baidu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commodity {
    private int id;
    private int category; //类别
    private String tname;
    private String color;
    private String price;//价格
    private String description;//描述
    private String imgadrr;//图片地址

}
