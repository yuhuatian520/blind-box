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
@Table(name = "product_img")
public class ProductImg implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 图片
     */
    @Column(name = "img")
    private String img;

    /**
     * 1>显示 0>不显示 8 删除
     */
    @Column(name = "`status`")
    private Short status;

    /**
     * 商品编号
     */
    @Column(name = "p_id")
    private Integer pId;

    private static final long serialVersionUID = 1L;
}