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
@Table(name = "invitation_info")
public class InvitationInfo implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 用户编号
     */
    @Column(name = "open_id")
    private String openId;

    /**
     * 邀请时间
     */
    @Column(name = "inv_time")
    private String invTime;

    /**
     * 被邀请用户编号
     */
    @Column(name = "inv_id")
    private String invId;

    /**
     * 奖励编号
     */
    @Column(name = "reward_id")
    private Integer rewardId;

    /**
     * 状态  1 成功 0 不
     */
    @Column(name = "`status`")
    private Short status;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 获取邀请时间
     *
     * @return inv_time - 邀请时间
     */
    public String getInvTime() {
        return invTime;
    }

    /**
     * 设置邀请时间
     *
     * @param invTime 邀请时间
     */
    public void setInvTime(String invTime) {
        this.invTime = invTime;
    }

    /**
     * 获取被邀请用户编号
     *
     * @return inv_id - 被邀请用户编号
     */
    public String getInvId() {
        return invId;
    }

    /**
     * 设置被邀请用户编号
     *
     * @param invId 被邀请用户编号
     */
    public void setInvId(String invId) {
        this.invId = invId;
    }

    /**
     * 获取奖励编号
     *
     * @return reward_id - 奖励编号
     */
    public Integer getRewardId() {
        return rewardId;
    }

    /**
     * 设置奖励编号
     *
     * @param rewardId 奖励编号
     */
    public void setRewardId(Integer rewardId) {
        this.rewardId = rewardId;
    }

    /**
     * 获取状态  1 成功 0 不
     *
     * @return status - 状态  1 成功 0 不
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置状态  1 成功 0 不
     *
     * @param status 状态  1 成功 0 不
     */
    public void setStatus(Short status) {
        this.status = status;
    }
}