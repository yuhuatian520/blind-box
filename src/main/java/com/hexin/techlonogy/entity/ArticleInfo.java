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
@Table(name = "article_info")
public class ArticleInfo implements Serializable {
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
     * 1,显示:0,不显示
     */
    @Column(name = "`status`")
    private Short status;

    /**
     * 图片
     */
    @Column(name = "img")
    private String img;

    /**
     * 排序
     */
    @Column(name = "sort")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}