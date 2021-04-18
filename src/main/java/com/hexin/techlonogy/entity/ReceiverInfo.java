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
@Table(name = "receiver_info")
public class ReceiverInfo implements Serializable {
    /**
     * 标识
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 收货人名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 手机号
     */
    @Column(name = "phone")
    private String phone;

    /**
     * 收货地址
     */
    @Column(name = "address")
    private String address;

    /**
     * 详细地址
     */
    @Column(name = "mark")
    private String mark;

    /**
     * 1->默认 0->不是 8->删除
     */
    @Column(name = "`status`")
    private Short status;

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
    public Integer getId() {
        return id;
    }

    /**
     * 设置标识
     *
     * @param id 标识
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取收货人名称
     *
     * @return name - 收货人名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置收货人名称
     *
     * @param name 收货人名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取收货地址
     *
     * @return address - 收货地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置收货地址
     *
     * @param address 收货地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取详细地址
     *
     * @return mark - 详细地址
     */
    public String getMark() {
        return mark;
    }

    /**
     * 设置详细地址
     *
     * @param mark 详细地址
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * 获取1->默认 0->不是 8->删除
     *
     * @return status - 1->默认 0->不是 8->删除
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置1->默认 0->不是 8->删除
     *
     * @param status 1->默认 0->不是 8->删除
     */
    public void setStatus(Short status) {
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