package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
public class PmsProductOperateLog implements Serializable {
    private Long id;

    private Long productId;

    private BigDecimal priceOld;

    private BigDecimal priceNew;

    private BigDecimal salePriceOld;

    private BigDecimal salePriceNew;

    @Schema(description = "赠送的积分")
    private Integer giftPointOld;

    private Integer giftPointNew;

    private Integer usePointLimitOld;

    private Integer usePointLimitNew;

    @Schema(description = "操作人")
    private String operateMan;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", productId=" + productId +
                ", priceOld=" + priceOld +
                ", priceNew=" + priceNew +
                ", salePriceOld=" + salePriceOld +
                ", salePriceNew=" + salePriceNew +
                ", giftPointOld=" + giftPointOld +
                ", giftPointNew=" + giftPointNew +
                ", usePointLimitOld=" + usePointLimitOld +
                ", usePointLimitNew=" + usePointLimitNew +
                ", operateMan=" + operateMan +
                ", createTime=" + createTime +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}