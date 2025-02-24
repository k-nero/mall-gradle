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
public class UmsMemberStatisticsInfo implements Serializable {
    private Long id;

    private Long memberId;

    @Schema(description = "累计消费金额")
    private BigDecimal consumeAmount;

    @Schema(description = "订单数量")
    private Integer orderCount;

    @Schema(description = "优惠券数量")
    private Integer couponCount;

    @Schema(description = "评价数")
    private Integer commentCount;

    @Schema(description = "退货数量")
    private Integer returnOrderCount;

    @Schema(description = "登录次数")
    private Integer loginCount;

    @Schema(description = "关注数量")
    private Integer attendCount;

    @Schema(description = "粉丝数量")
    private Integer fansCount;

    private Integer collectProductCount;

    private Integer collectSubjectCount;

    private Integer collectTopicCount;

    private Integer collectCommentCount;

    private Integer inviteFriendCount;

    @Schema(description = "最后一次下订单时间")
    private Date recentOrderTime;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        String sb = getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", memberId=" + memberId +
                ", consumeAmount=" + consumeAmount +
                ", orderCount=" + orderCount +
                ", couponCount=" + couponCount +
                ", commentCount=" + commentCount +
                ", returnOrderCount=" + returnOrderCount +
                ", loginCount=" + loginCount +
                ", attendCount=" + attendCount +
                ", fansCount=" + fansCount +
                ", collectProductCount=" + collectProductCount +
                ", collectSubjectCount=" + collectSubjectCount +
                ", collectTopicCount=" + collectTopicCount +
                ", collectCommentCount=" + collectCommentCount +
                ", inviteFriendCount=" + inviteFriendCount +
                ", recentOrderTime=" + recentOrderTime +
                ", serialVersionUID=" + serialVersionUID +
                "]";
        return sb;
    }
}