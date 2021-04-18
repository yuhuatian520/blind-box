package com.hexin.techlonogy.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * @author 西南彭于晏
 *  @date 2021-4-14 21:52
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "blind_order_info")
public class BlindOrderInfo implements Serializable {
    /**
     * 标识
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
     * 封面
     */
    @Column(name = "img")
    private String img;

    /**
     * 小图
     */
    @Column(name = "ico")
    private String ico;

    /**
     * 数量
     */
    @Column(name = "`count`")
    private Integer count;

    /**
     * 描述
     */
    @Column(name = "`desc`")
    private String desc;

    /**
     * 抽奖码
     */
    @Column(name = "`number`")
    private String number;

    /**
     * 开始时间
     */
    @Column(name = "start_time")
    private String startTime;

    /**
     * 用户编号
     */
    @Column(name = "open_id")
    private String openId;

    /**
     * 号码编号
     */
    @Column(name = "num_id")
    private String numId;

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
     * 获取封面
     *
     * @return img - 封面
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置封面
     *
     * @param img 封面
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 获取小图
     *
     * @return ico - 小图
     */
    public String getIco() {
        return ico;
    }

    /**
     * 设置小图
     *
     * @param ico 小图
     */
    public void setIco(String ico) {
        this.ico = ico;
    }

    /**
     * 获取数量
     *
     * @return count - 数量
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置数量
     *
     * @param count 数量
     */
    public void setCount(Integer count) {
        this.count = count;
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
     * 获取抽奖码
     *
     * @return number - 抽奖码
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置抽奖码
     *
     * @param number 抽奖码
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 获取开始时间
     *
     * @return start_time - 开始时间
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * 设置开始时间
     *
     * @param startTime 开始时间
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
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

    /**
     * 获取号码编号
     *
     * @return num_id - 号码编号
     */
    public String getNumId() {
        return numId;
    }

    /**
     * 设置号码编号
     *
     * @param numId 号码编号
     */
    public void setNumId(String numId) {
        this.numId = numId;
    }
}