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
@Table(name = "reward_info")
public class RewardInfo implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 名称
     */
    @Column(name = "reward_name")
    private String rewardName;

    /**
     * 金额
     */
    @Column(name = "money")
    private Double money;

    /**
     * 0,不显示 1,存在
     */
    @Column(name = "`status`")
    private Short status;

    /**
     * 邀请人人数
     */
    @Column(name = "`count`")
    private Integer count;

    private static final long serialVersionUID = 1L;
}