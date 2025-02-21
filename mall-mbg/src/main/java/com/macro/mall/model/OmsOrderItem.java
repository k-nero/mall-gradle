package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
public class OmsOrderItem implements Serializable {
    private Long id;

    @Schema(description = "订单id")
    private Long orderId;

    @Schema(description = "订单编号")
    private String orderSn;

    private Long productId;

    private String productPic;

    private String productName;

    private String productBrand;

    private String productSn;

    @Schema(description = "销售价格")
    private BigDecimal productPrice;

    @Schema(description = "购买数量")
    private Integer productQuantity;

    @Schema(description = "商品sku编号")
    private Long productSkuId;

    @Schema(description = "商品sku条码")
    private String productSkuCode;

    @Schema(description = "商品分类id")
    private Long productCategoryId;

    @Schema(description = "商品促销名称")
    private String promotionName;

    @Schema(description = "商品促销分解金额")
    private BigDecimal promotionAmount;

    @Schema(description = "优惠券优惠分解金额")
    private BigDecimal couponAmount;

    @Schema(description = "积分优惠分解金额")
    private BigDecimal integrationAmount;

    @Schema(description = "该商品经过优惠后的分解金额")
    private BigDecimal realAmount;

    private Integer giftIntegration;

    private Integer giftGrowth;

    @Schema(description = "商品销售属性:[{'key':'颜色','value':'颜色'},{'key':'容量','value':'4G'}]")
    private String productAttr;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", orderId=" + orderId +
                ", orderSn=" + orderSn +
                ", productId=" + productId +
                ", productPic=" + productPic +
                ", productName=" + productName +
                ", productBrand=" + productBrand +
                ", productSn=" + productSn +
                ", productPrice=" + productPrice +
                ", productQuantity=" + productQuantity +
                ", productSkuId=" + productSkuId +
                ", productSkuCode=" + productSkuCode +
                ", productCategoryId=" + productCategoryId +
                ", promotionName=" + promotionName +
                ", promotionAmount=" + promotionAmount +
                ", couponAmount=" + couponAmount +
                ", integrationAmount=" + integrationAmount +
                ", realAmount=" + realAmount +
                ", giftIntegration=" + giftIntegration +
                ", giftGrowth=" + giftGrowth +
                ", productAttr=" + productAttr +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}