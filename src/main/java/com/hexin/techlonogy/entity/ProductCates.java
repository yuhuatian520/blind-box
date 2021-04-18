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
@Table(name = "product_cates")
public class ProductCates implements Serializable {
    /**
     * 标识
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 上级分类id
     */
    @Column(name = "pid")
    private Integer pid;

    /**
     * 排序
     */
    @Column(name = "sort")
    private Integer sort;

    /**
     * 标签标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 状态： 0 正常 1 禁用
     */
    @Column(name = "`status`")
    private Boolean status;

    /**
     * 添加时间
     */
    @Column(name = "add_time")
    private String addTime;

    /**
     * 小图
     */
    @Column(name = "icon")
    private String icon;

    private static final long serialVersionUID = 1L;
}