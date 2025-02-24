package com.macro.mall.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class UmsMemberProductCategoryRelation implements Serializable {
    private Long id;

    private Long memberId;

    private Long productCategoryId;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", memberId=" + memberId +
                ", productCategoryId=" + productCategoryId +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}