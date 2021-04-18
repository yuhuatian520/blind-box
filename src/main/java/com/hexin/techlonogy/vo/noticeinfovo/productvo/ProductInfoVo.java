package com.hexin.techlonogy.vo.noticeinfovo.productvo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductInfoVo {
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
     * 商品大图
     */
    @Column(name = "img")
    private String img;
    /**
     * 价格
     */
    @Column(name = "price")
    private Double price;

}
