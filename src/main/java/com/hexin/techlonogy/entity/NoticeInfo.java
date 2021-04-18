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
@Table(name = "notice_info")
public class NoticeInfo implements Serializable {
    /**
     * 标识
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 图片地址
     */
    @Column(name = "img_address")
    private String imgAddress;

    /**
     * 0.不显示 1,显示 ,8 删除
     */
    @Column(name = "`status`")
    private Short status;

    /**
     * 1，商品 2，商品导航
     */
    @Column(name = "`type`")
    private Short type;

    /**
     * 排序
     */
    @Column(name = "sort")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}