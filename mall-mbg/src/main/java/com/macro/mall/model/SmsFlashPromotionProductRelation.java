package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
public class SmsFlashPromotionProductRelation implements Serializable {
    @Schema(description = "编号")
    private Long id;

    private Long flashPromotionId;

    @Schema(description = "编号")
    private Long flashPromotionSessionId;

    private Long productId;

    @Schema(description = "限时购价格")
    private BigDecimal flashPromotionPrice;

    @Schema(description = "限时购数量")
    private Integer flashPromotionCount;

    @Schema(description = "每人限购数量")
    private Integer flashPromotionLimit;

    @Schema(description = "排序")
    private Integer sort;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", flashPromotionId=" + flashPromotionId +
                ", flashPromotionSessionId=" + flashPromotionSessionId +
                ", productId=" + productId +
                ", flashPromotionPrice=" + flashPromotionPrice +
                ", flashPromotionCount=" + flashPromotionCount +
                ", flashPromotionLimit=" + flashPromotionLimit +
                ", sort=" + sort +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}