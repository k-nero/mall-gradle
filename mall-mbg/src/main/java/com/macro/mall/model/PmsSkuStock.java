package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
public class PmsSkuStock implements Serializable {
    private Long id;

    private Long productId;

    @Schema(description = "sku编码")
    private String skuCode;

    private BigDecimal price;

    @Schema(description = "库存")
    private Integer stock;

    @Schema(description = "预警库存")
    private Integer lowStock;

    @Schema(description = "展示图片")
    private String pic;

    @Schema(description = "销量")
    private Integer sale;

    @Schema(description = "单品促销价格")
    private BigDecimal promotionPrice;

    @Schema(description = "锁定库存")
    private Integer lockStock;

    @Schema(description = "商品销售属性，json格式")
    private String spData;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", productId=" + productId +
                ", skuCode=" + skuCode +
                ", price=" + price +
                ", stock=" + stock +
                ", lowStock=" + lowStock +
                ", pic=" + pic +
                ", sale=" + sale +
                ", promotionPrice=" + promotionPrice +
                ", lockStock=" + lockStock +
                ", spData=" + spData +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}