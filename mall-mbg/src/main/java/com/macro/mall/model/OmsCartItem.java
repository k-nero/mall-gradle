package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
public class OmsCartItem implements Serializable {
    private Long id;

    private Long productId;

    private Long productSkuId;

    private Long memberId;

    @Schema(description = "购买数量")
    private Integer quantity;

    @Schema(description = "添加到购物车的价格")
    private BigDecimal price;

    @Schema(description = "商品主图")
    private String productPic;

    @Schema(description = "商品名称")
    private String productName;

    @Schema(description = "商品副标题（卖点）")
    private String productSubTitle;

    @Schema(description = "商品sku条码")
    private String productSkuCode;

    @Schema(description = "会员昵称")
    private String memberNickname;

    @Schema(description = "创建时间")
    private Date createDate;

    @Schema(description = "修改时间")
    private Date modifyDate;

    @Schema(description = "是否删除")
    private Integer deleteStatus;

    @Schema(description = "商品分类")
    private Long productCategoryId;

    private String productBrand;

    private String productSn;

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
                ", productId=" + productId +
                ", productSkuId=" + productSkuId +
                ", memberId=" + memberId +
                ", quantity=" + quantity +
                ", price=" + price +
                ", productPic=" + productPic +
                ", productName=" + productName +
                ", productSubTitle=" + productSubTitle +
                ", productSkuCode=" + productSkuCode +
                ", memberNickname=" + memberNickname +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", deleteStatus=" + deleteStatus +
                ", productCategoryId=" + productCategoryId +
                ", productBrand=" + productBrand +
                ", productSn=" + productSn +
                ", productAttr=" + productAttr +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}