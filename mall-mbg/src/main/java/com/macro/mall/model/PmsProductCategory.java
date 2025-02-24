package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class PmsProductCategory implements Serializable {
    private Long id;

    @Schema(description = "上机分类的编号：0表示一级分类")
    private Long parentId;

    private String name;

    @Schema(description = "分类级别：0->1级；1->2级")
    private Integer level;

    private Integer productCount;

    private String productUnit;

    @Schema(description = "是否显示在导航栏：0->不显示；1->显示")
    private Integer navStatus;

    @Schema(description = "显示状态：0->不显示；1->显示")
    private Integer showStatus;

    private Integer sort;

    @Schema(description = "图标")
    private String icon;

    private String keywords;

    @Schema(description = "描述")
    private String description;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", parentId=" + parentId +
                ", name=" + name +
                ", level=" + level +
                ", productCount=" + productCount +
                ", productUnit=" + productUnit +
                ", navStatus=" + navStatus +
                ", showStatus=" + showStatus +
                ", sort=" + sort +
                ", icon=" + icon +
                ", keywords=" + keywords +
                ", description=" + description +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}