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
public class ProductCatesVo {
    /**
     * 标识
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;


    /**
     * 标签标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 小图
     */
    @Column(name = "icon")
    private String icon;
}
