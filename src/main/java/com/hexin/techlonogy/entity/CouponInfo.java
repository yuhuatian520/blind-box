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
@Table(name = "coupon_info")
public class CouponInfo implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "icon")
    private String icon;

    /**
     * 10店铺优惠券 11新人店铺券  20商品优惠券  30类目优惠券  60平台优惠券 61新人平台券
     */
    @Column(name = "used")
    private Short used;

    /**
     * 1满减券 2叠加满减券 3无门槛券（需要限制大小）
     */
    @Column(name = "`type`")
    private Short type;

    /**
     * 1可用于特价商品 2不能  默认不能(商品优惠卷除外)
     */
    @Column(name = "with_special")
    private Short withSpecial;

    /**
     * 店铺或商品流水号
     */
    @Column(name = "with_sn")
    private String withSn;

    /**
     * 满多少金额
     */
    @Column(name = "with_amount")
    private Long withAmount;

    /**
     * 用券金额
     */
    @Column(name = "used_amount")
    private Long usedAmount;

    /**
     * '配额：发券数量
     */
    @Column(name = "quota")
    private Integer quota;

    /**
     * 已领取的优惠券数量
     */
    @Column(name = "take_count")
    private Integer takeCount;

    /**
     * 已使用的优惠券数量
     */
    @Column(name = "used_count")
    private Integer usedCount;

    /**
     * 发放开始时间
     */
    @Column(name = "start_time")
    private String startTime;

    /**
     * 发放结束时间
     */
    @Column(name = "end_time")
    private String endTime;

    /**
     * 时效:1绝对时效（领取后XXX-XXX时间段有效）  2相对时效（领取后N天有效）
     */
    @Column(name = "valid_type")
    private Short validType;

    /**
     * 使用开始时间
     */
    @Column(name = "valid_start_time")
    private String validStartTime;

    /**
     * 使用结束时间
     */
    @Column(name = "valid_end_time")
    private String validEndTime;

    /**
     * 自领取之日起有效天数
     */
    @Column(name = "valid_days")
    private Integer validDays;

    /**
     * 1生效 2强制失效（之前已领取的自动作废） 3已结束
     */
    @Column(name = "`status`")
    private Short status;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private String createUser;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private String createTime;

    /**
     * 更新人
     */
    @Column(name = "update_user")
    private String updateUser;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private String updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取10店铺优惠券 11新人店铺券  20商品优惠券  30类目优惠券  60平台优惠券 61新人平台券
     *
     * @return used - 10店铺优惠券 11新人店铺券  20商品优惠券  30类目优惠券  60平台优惠券 61新人平台券
     */
    public Short getUsed() {
        return used;
    }

    /**
     * 设置10店铺优惠券 11新人店铺券  20商品优惠券  30类目优惠券  60平台优惠券 61新人平台券
     *
     * @param used 10店铺优惠券 11新人店铺券  20商品优惠券  30类目优惠券  60平台优惠券 61新人平台券
     */
    public void setUsed(Short used) {
        this.used = used;
    }

    /**
     * 获取1满减券 2叠加满减券 3无门槛券（需要限制大小）
     *
     * @return type - 1满减券 2叠加满减券 3无门槛券（需要限制大小）
     */
    public Short getType() {
        return type;
    }

    /**
     * 设置1满减券 2叠加满减券 3无门槛券（需要限制大小）
     *
     * @param type 1满减券 2叠加满减券 3无门槛券（需要限制大小）
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * 获取1可用于特价商品 2不能  默认不能(商品优惠卷除外)
     *
     * @return with_special - 1可用于特价商品 2不能  默认不能(商品优惠卷除外)
     */
    public Short getWithSpecial() {
        return withSpecial;
    }

    /**
     * 设置1可用于特价商品 2不能  默认不能(商品优惠卷除外)
     *
     * @param withSpecial 1可用于特价商品 2不能  默认不能(商品优惠卷除外)
     */
    public void setWithSpecial(Short withSpecial) {
        this.withSpecial = withSpecial;
    }

    /**
     * 获取店铺或商品流水号
     *
     * @return with_sn - 店铺或商品流水号
     */
    public String getWithSn() {
        return withSn;
    }

    /**
     * 设置店铺或商品流水号
     *
     * @param withSn 店铺或商品流水号
     */
    public void setWithSn(String withSn) {
        this.withSn = withSn;
    }

    /**
     * 获取满多少金额
     *
     * @return with_amount - 满多少金额
     */
    public Long getWithAmount() {
        return withAmount;
    }

    /**
     * 设置满多少金额
     *
     * @param withAmount 满多少金额
     */
    public void setWithAmount(Long withAmount) {
        this.withAmount = withAmount;
    }

    /**
     * 获取用券金额
     *
     * @return used_amount - 用券金额
     */
    public Long getUsedAmount() {
        return usedAmount;
    }

    /**
     * 设置用券金额
     *
     * @param usedAmount 用券金额
     */
    public void setUsedAmount(Long usedAmount) {
        this.usedAmount = usedAmount;
    }

    /**
     * 获取'配额：发券数量
     *
     * @return quota - '配额：发券数量
     */
    public Integer getQuota() {
        return quota;
    }

    /**
     * 设置'配额：发券数量
     *
     * @param quota '配额：发券数量
     */
    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    /**
     * 获取已领取的优惠券数量
     *
     * @return take_count - 已领取的优惠券数量
     */
    public Integer getTakeCount() {
        return takeCount;
    }

    /**
     * 设置已领取的优惠券数量
     *
     * @param takeCount 已领取的优惠券数量
     */
    public void setTakeCount(Integer takeCount) {
        this.takeCount = takeCount;
    }

    /**
     * 获取已使用的优惠券数量
     *
     * @return used_count - 已使用的优惠券数量
     */
    public Integer getUsedCount() {
        return usedCount;
    }

    /**
     * 设置已使用的优惠券数量
     *
     * @param usedCount 已使用的优惠券数量
     */
    public void setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
    }

    /**
     * 获取发放开始时间
     *
     * @return start_time - 发放开始时间
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * 设置发放开始时间
     *
     * @param startTime 发放开始时间
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取发放结束时间
     *
     * @return end_time - 发放结束时间
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 设置发放结束时间
     *
     * @param endTime 发放结束时间
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取时效:1绝对时效（领取后XXX-XXX时间段有效）  2相对时效（领取后N天有效）
     *
     * @return valid_type - 时效:1绝对时效（领取后XXX-XXX时间段有效）  2相对时效（领取后N天有效）
     */
    public Short getValidType() {
        return validType;
    }

    /**
     * 设置时效:1绝对时效（领取后XXX-XXX时间段有效）  2相对时效（领取后N天有效）
     *
     * @param validType 时效:1绝对时效（领取后XXX-XXX时间段有效）  2相对时效（领取后N天有效）
     */
    public void setValidType(Short validType) {
        this.validType = validType;
    }

    /**
     * 获取使用开始时间
     *
     * @return valid_start_time - 使用开始时间
     */
    public String getValidStartTime() {
        return validStartTime;
    }

    /**
     * 设置使用开始时间
     *
     * @param validStartTime 使用开始时间
     */
    public void setValidStartTime(String validStartTime) {
        this.validStartTime = validStartTime;
    }

    /**
     * 获取使用结束时间
     *
     * @return valid_end_time - 使用结束时间
     */
    public String getValidEndTime() {
        return validEndTime;
    }

    /**
     * 设置使用结束时间
     *
     * @param validEndTime 使用结束时间
     */
    public void setValidEndTime(String validEndTime) {
        this.validEndTime = validEndTime;
    }

    /**
     * 获取自领取之日起有效天数
     *
     * @return valid_days - 自领取之日起有效天数
     */
    public Integer getValidDays() {
        return validDays;
    }

    /**
     * 设置自领取之日起有效天数
     *
     * @param validDays 自领取之日起有效天数
     */
    public void setValidDays(Integer validDays) {
        this.validDays = validDays;
    }

    /**
     * 获取1生效 2强制失效（之前已领取的自动作废） 3已结束
     *
     * @return status - 1生效 2强制失效（之前已领取的自动作废） 3已结束
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置1生效 2强制失效（之前已领取的自动作废） 3已结束
     *
     * @param status 1生效 2强制失效（之前已领取的自动作废） 3已结束
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新人
     *
     * @return update_user - 更新人
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置更新人
     *
     * @param updateUser 更新人
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}