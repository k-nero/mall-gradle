package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class SmsCouponProductRelation implements Serializable {
    private Long id;

    private Long couponId;

    private Long productId;

    @Schema(description = "商品名称")
    private String productName;

    @Schema(description = "商品编码")
    private String productSn;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", couponId=" + couponId +
                ", productId=" + productId +
                ", productName=" + productName +
                ", productSn=" + productSn +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}