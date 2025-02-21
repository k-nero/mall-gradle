package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class PmsProductAttributeCategory implements Serializable {
    private Long id;

    private String name;

    @Schema(description = "属性数量")
    private Integer attributeCount;

    @Schema(description = "参数数量")
    private Integer paramCount;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", name=" + name +
                ", attributeCount=" + attributeCount +
                ", paramCount=" + paramCount +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}