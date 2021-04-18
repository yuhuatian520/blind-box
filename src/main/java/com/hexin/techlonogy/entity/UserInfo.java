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
@Table(name = "user_info")
public class UserInfo implements Serializable {
    /**
     * 用户标识
     */
    @Id
    @Column(name = "open_id")
    private String openId;

    /**
     * 微信昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 头像
     */
    @Column(name = "avatar_url")
    private String avatarUrl;

    /**
     * 1,男 2,女 0 未知
     */
    @Column(name = "gender")
    private Integer gender;

    /**
     * 电话号码
     */
    @Column(name = "phone")
    private String phone;

    /**
     * 余额
     */
    @Column(name = "balance")
    private Double balance;

    /**
     * 1,正常 0,禁用
     */
    @Column(name = "`status`")
    private Short status;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户标识
     *
     * @return open_id - 用户标识
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置用户标识
     *
     * @param openId 用户标识
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 获取微信昵称
     *
     * @return nick_name - 微信昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置微信昵称
     *
     * @param nickName 微信昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取头像
     *
     * @return avatar_url - 头像
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * 设置头像
     *
     * @param avatarUrl 头像
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * 获取1,男 2,女 0 未知
     *
     * @return gender - 1,男 2,女 0 未知
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置1,男 2,女 0 未知
     *
     * @param gender 1,男 2,女 0 未知
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取电话号码
     *
     * @return phone - 电话号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话号码
     *
     * @param phone 电话号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取余额
     *
     * @return balance - 余额
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * 设置余额
     *
     * @param balance 余额
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * 获取1,正常 0,禁用
     *
     * @return status - 1,正常 0,禁用
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置1,正常 0,禁用
     *
     * @param status 1,正常 0,禁用
     */
    public void setStatus(Short status) {
        this.status = status;
    }
}