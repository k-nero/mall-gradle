package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class UmsMenu implements Serializable {
    private Long id;

    @Schema(description = "父级ID")
    private Long parentId;

    @Schema(description = "创建时间")
    private Date createTime;

    @Schema(description = "菜单名称")
    private String title;

    @Schema(description = "菜单级数")
    private Integer level;

    @Schema(description = "菜单排序")
    private Integer sort;

    @Schema(description = "前端名称")
    private String name;

    @Schema(description = "前端图标")
    private String icon;

    @Schema(description = "前端隐藏")
    private Integer hidden;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", parentId=" + parentId +
                ", createTime=" + createTime +
                ", title=" + title +
                ", level=" + level +
                ", sort=" + sort +
                ", name=" + name +
                ", icon=" + icon +
                ", hidden=" + hidden +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}