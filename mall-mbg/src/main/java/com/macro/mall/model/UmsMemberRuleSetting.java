package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
public class UmsMemberRuleSetting implements Serializable {
    private Long id;

    @Schema(description = "连续签到天数")
    private Integer continueSignDay;

    @Schema(description = "连续签到赠送数量")
    private Integer continueSignPoint;

    @Schema(description = "每消费多少元获取1个点")
    private BigDecimal consumePerPoint;

    @Schema(description = "最低获取点数的订单金额")
    private BigDecimal lowOrderAmount;

    @Schema(description = "每笔订单最高获取点数")
    private Integer maxPointPerOrder;

    @Schema(description = "类型：0->积分规则；1->成长值规则")
    private Integer type;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", continueSignDay=" + continueSignDay +
                ", continueSignPoint=" + continueSignPoint +
                ", consumePerPoint=" + consumePerPoint +
                ", lowOrderAmount=" + lowOrderAmount +
                ", maxPointPerOrder=" + maxPointPerOrder +
                ", type=" + type +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}