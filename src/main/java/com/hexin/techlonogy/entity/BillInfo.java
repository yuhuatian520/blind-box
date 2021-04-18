package com.hexin.techlonogy.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * @author 西南彭于晏
 *  @date 2021-4-14 21:51
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bill_info")
public class BillInfo implements Serializable {
    /**
     * 账单编号
     */
    @Id
    @Column(name = "id")
    private String id;

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

    /**
     * 1->付款;
     */
    @Column(name = "`status`")
    private Short status;

    /**
     * 价格
     */
    @Column(name = "price")
    private Double price;

    /**
     * 时间
     */
    @Column(name = "`time`")
    private String time;

    /**
     * 用户编号
     */
    @Column(name = "open_id")
    private String openId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取账单编号
     *
     * @return id - 账单编号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置账单编号
     *
     * @param id 账单编号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取图片
     *
     * @return img - 图片
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置图片
     *
     * @param img 图片
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 获取1->付款;
     *
     * @return status - 1->付款;
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置1->付款;
     *
     * @param status 1->付款;
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取时间
     *
     * @return time - 时间
     */
    public String getTime() {
        return time;
    }

    /**
     * 设置时间
     *
     * @param time 时间
     */
    public void setTime(String time) {
        this.time = time;
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