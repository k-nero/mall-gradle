package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
public class PmsFeightTemplate implements Serializable {
    private Long id;

    private String name;

    @Schema(description = "计费类型:0->按重量；1->按件数")
    private Integer chargeType;

    @Schema(description = "首重kg")
    private BigDecimal firstWeight;

    @Schema(description = "首费（元）")
    private BigDecimal firstFee;

    private BigDecimal continueWeight;

    private BigDecimal continmeFee;

    @Schema(description = "目的地（省、市）")
    private String dest;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", name=" + name +
                ", chargeType=" + chargeType +
                ", firstWeight=" + firstWeight +
                ", firstFee=" + firstFee +
                ", continueWeight=" + continueWeight +
                ", continmeFee=" + continmeFee +
                ", dest=" + dest +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}