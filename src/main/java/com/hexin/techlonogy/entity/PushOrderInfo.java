package com.hexin.techlonogy.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * @author 西南彭于晏
 *  @date 2021-4-14 21:53
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "push_order_info")
public class PushOrderInfo implements Serializable {
    /**
     * 标识
     */
    @Id
    @Column(name = "id")
    private String id;

    /**
     * 礼品编号
     */
    @Column(name = "blind_id")
    private String blindId;

    /**
     * 运费
     */
    @Column(name = "freight")
    private Double freight;

    /**
     * 描述
     */
    @Column(name = "`desc`")
    private String desc;

    /**
     * 状态,1 已汇款,2->发货中 3,已完成
     */
    @Column(name = "`status`")
    private Integer status;

    /**
     * 用户编号
     */
    @Column(name = "open_id")
    private String openId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取标识
     *
     * @return id - 标识
     */
    public String getId() {
        return id;
    }

    /**
     * 设置标识
     *
     * @param id 标识
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取礼品编号
     *
     * @return blind_id - 礼品编号
     */
    public String getBlindId() {
        return blindId;
    }

    /**
     * 设置礼品编号
     *
     * @param blindId 礼品编号
     */
    public void setBlindId(String blindId) {
        this.blindId = blindId;
    }

    /**
     * 获取运费
     *
     * @return freight - 运费
     */
    public Double getFreight() {
        return freight;
    }

    /**
     * 设置运费
     *
     * @param freight 运费
     */
    public void setFreight(Double freight) {
        this.freight = freight;
    }

    /**
     * 获取描述
     *
     * @return desc - 描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置描述
     *
     * @param desc 描述
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 获取状态,1 已汇款,2->发货中 3,已完成
     *
     * @return status - 状态,1 已汇款,2->发货中 3,已完成
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态,1 已汇款,2->发货中 3,已完成
     *
     * @param status 状态,1 已汇款,2->发货中 3,已完成
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取用户编号
     *
     * @return open_id - 用户编号
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置用户编号
     *
     * @param openId 用户编号
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }
}