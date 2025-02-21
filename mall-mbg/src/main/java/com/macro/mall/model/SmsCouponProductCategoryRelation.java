package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class SmsCouponProductCategoryRelation implements Serializable {
    private Long id;

    private Long couponId;

    private Long productCategoryId;

    @Schema(description = "产品分类名称")
    private String productCategoryName;

    @Schema(description = "父分类名称")
    private String parentCategoryName;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", couponId=" + couponId +
                ", productCategoryId=" + productCategoryId +
                ", productCategoryName=" + productCategoryName +
                ", parentCategoryName=" + parentCategoryName +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}