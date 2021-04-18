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
@Table(name = "user_profit_log")
public class UserProfitLog implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 收益金额
     */
    @Column(name = "money")
    private Double money;

    /**
     * 用户编号
     */
    @Column(name = "open_id")
    private String openId;

    /**
     * 时间
     */
    @Column(name = "`time`")
    private String time;

    /**
     * 产生的用户
     */
    @Column(name = "user_id")
    private String userId;

    private static final long serialVersionUID = 1L;
}