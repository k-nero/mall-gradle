package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class UmsIntegrationConsumeSetting implements Serializable {
    private Long id;

    @Schema(description = "每一元需要抵扣的积分数量")
    private Integer deductionPerAmount;

    @Schema(description = "每笔订单最高抵用百分比")
    private Integer maxPercentPerOrder;

    @Schema(description = "每次使用积分最小单位100")
    private Integer useUnit;

    @Schema(description = "是否可以和优惠券同用；0->不可以；1->可以")
    private Integer couponStatus;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", deductionPerAmount=" + deductionPerAmount +
                ", maxPercentPerOrder=" + maxPercentPerOrder +
                ", useUnit=" + useUnit +
                ", couponStatus=" + couponStatus +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}