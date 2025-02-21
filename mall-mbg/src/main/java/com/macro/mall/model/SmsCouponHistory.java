package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class SmsCouponHistory implements Serializable {
    private Long id;

    private Long couponId;

    private Long memberId;

    private String couponCode;

    @Schema(description = "领取人昵称")
    private String memberNickname;

    @Schema(description = "获取类型：0->后台赠送；1->主动获取")
    private Integer getType;

    private Date createTime;

    @Schema(description = "使用状态：0->未使用；1->已使用；2->已过期")
    private Integer useStatus;

    @Schema(description = "使用时间")
    private Date useTime;

    @Schema(description = "订单编号")
    private Long orderId;

    @Schema(description = "订单号码")
    private String orderSn;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", couponId=" + couponId +
                ", memberId=" + memberId +
                ", couponCode=" + couponCode +
                ", memberNickname=" + memberNickname +
                ", getType=" + getType +
                ", createTime=" + createTime +
                ", useStatus=" + useStatus +
                ", useTime=" + useTime +
                ", orderId=" + orderId +
                ", orderSn=" + orderSn +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}