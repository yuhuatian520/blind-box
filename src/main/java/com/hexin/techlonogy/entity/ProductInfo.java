package com.hexin.techlonogy.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product_info")
public class ProductInfo implements Serializable {
    /**
     * 标识
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 分类编号
     */
    @Column(name = "cid")
    private Long cid;

    /**
     * 商品名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 商品编码
     */
    @Column(name = "pro_no")
    private String proNo;

    /**
     * 关键字
     */
    @Column(name = "keywords")
    private String keywords;

    /**
     * 商品大图
     */
    @Column(name = "img")
    private String img;

    /**
     * 价格
     */
    @Column(name = "price")
    private Double price;

    /**
     * 描述
     */
    @Column(name = "`desc`")
    private String desc;

    /**
     * 点击量
     */
    @Column(name = "pv")
    private Integer pv;

    /**
     * 1,上架:0,下架:8 删除
     */
    @Column(name = "`status`")
    private Short status;

    /**
     * 发布时间
     */
    @Column(name = "add_time")
    private String addTime;

    /**
     * 下架时间
     */
    @Column(name = "ind_time")
    private String indTime;

    /**
     * 删除时间
     */
    @Column(name = "del_time")
    private String delTime;

    /**
     * 排序
     */
    @Column(name = "sort")
    private Integer sort;

    /**
     * 商品最高价
     */
    @Column(name = "price_max")
    private Double priceMax;

    /**
     * 1,幸运,2火爆
     */
    @Column(name = "`type`")
    private Short type;

    private static final long serialVersionUID = 1L;
}