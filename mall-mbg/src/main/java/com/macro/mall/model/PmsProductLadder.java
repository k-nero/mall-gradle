package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
public class PmsProductLadder implements Serializable {
    private Long id;

    private Long productId;

    @Schema(description = "满足的商品数量")
    private Integer count;

    @Schema(description = "折扣")
    private BigDecimal discount;

    @Schema(description = "折后价格")
    private BigDecimal price;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", productId=" + productId +
                ", count=" + count +
                ", discount=" + discount +
                ", price=" + price +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}