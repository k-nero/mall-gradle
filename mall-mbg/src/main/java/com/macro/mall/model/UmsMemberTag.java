package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
public class UmsMemberTag implements Serializable {
    private Long id;

    private String name;

    @Schema(description = "自动打标签完成订单数量")
    private Integer finishOrderCount;

    @Schema(description = "自动打标签完成订单金额")
    private BigDecimal finishOrderAmount;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", name=" + name +
                ", finishOrderCount=" + finishOrderCount +
                ", finishOrderAmount=" + finishOrderAmount +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}