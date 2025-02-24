package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class PmsProductAttributeValue implements Serializable {
    private Long id;

    private Long productId;

    private Long productAttributeId;

    @Schema(description = "手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开")
    private String value;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", productId=" + productId +
                ", productAttributeId=" + productAttributeId +
                ", value=" + value +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}