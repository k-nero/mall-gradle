package com.macro.mall.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class PmsProductCategoryAttributeRelation implements Serializable {
    private Long id;

    private Long productCategoryId;

    private Long productAttributeId;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", productCategoryId=" + productCategoryId +
                ", productAttributeId=" + productAttributeId +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}