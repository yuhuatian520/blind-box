package com.hexin.techlonogy.vo.noticeinfovo.articleinfovo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleInfoVo {
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
     * 图片
     */
    @Column(name = "img")
    private String img;


}
