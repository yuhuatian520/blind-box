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
@Table(name = "content_info")
public class ContentInfo implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "content")
    private String content;

    /**
     * 1->显：0，不显示 8->删除
     */
    @Column(name = "`status`")
    private Short status;

    /**
     * 标题编号
     */
    @Column(name = "n_id")
    private Integer nId;

    /**
     * 1，商品，2，内容
     */
    @Column(name = "`type`")
    private Short type;

    private static final long serialVersionUID = 1L;
}