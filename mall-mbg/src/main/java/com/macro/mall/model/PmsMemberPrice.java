package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
public class PmsMemberPrice implements Serializable {
    private Long id;

    private Long productId;

    private Long memberLevelId;

    @Schema(description = "会员价格")
    private BigDecimal memberPrice;

    private String memberLevelName;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", productId=" + productId +
                ", memberLevelId=" + memberLevelId +
                ", memberPrice=" + memberPrice +
                ", memberLevelName=" + memberLevelName +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}