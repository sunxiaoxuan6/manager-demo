package com.niit.managerdemo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 创建订单的实体类
 **/

//@Entity：和数据库进行绑定
@Entity
@Data
public class Message {
    @Id
//    主键自增
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
//    商品名
    private String Brand;
//    价格
    private Integer Price;
//    数量
    private Integer Num;

}
