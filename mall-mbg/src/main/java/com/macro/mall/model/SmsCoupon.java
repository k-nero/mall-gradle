package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
public class SmsCoupon implements Serializable {
    private Long id;

    @Schema(description = "优惠券类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券")
    private Integer type;

    private String name;

    @Schema(description = "使用平台：0->全部；1->移动；2->PC")
    private Integer platform;

    @Schema(description = "数量")
    private Integer count;

    @Schema(description = "金额")
    private BigDecimal amount;

    @Schema(description = "每人限领张数")
    private Integer perLimit;

    @Schema(description = "使用门槛；0表示无门槛")
    private BigDecimal minPoint;

    private Date startTime;

    private Date endTime;

    @Schema(description = "使用类型：0->全场通用；1->指定分类；2->指定商品")
    private Integer useType;

    @Schema(description = "备注")
    private String note;

    @Schema(description = "发行数量")
    private Integer publishCount;

    @Schema(description = "已使用数量")
    private Integer useCount;

    @Schema(description = "领取数量")
    private Integer receiveCount;

    @Schema(description = "可以领取的日期")
    private Date enableTime;

    @Schema(description = "优惠码")
    private String code;

    @Schema(description = "可领取的会员类型：0->无限时")
    private Integer memberLevel;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", type=" + type +
                ", name=" + name +
                ", platform=" + platform +
                ", count=" + count +
                ", amount=" + amount +
                ", perLimit=" + perLimit +
                ", minPoint=" + minPoint +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", useType=" + useType +
                ", note=" + note +
                ", publishCount=" + publishCount +
                ", useCount=" + useCount +
                ", receiveCount=" + receiveCount +
                ", enableTime=" + enableTime +
                ", code=" + code +
                ", memberLevel=" + memberLevel +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}