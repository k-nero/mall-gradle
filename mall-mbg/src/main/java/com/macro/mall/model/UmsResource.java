package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class UmsResource implements Serializable {
    private Long id;

    @Schema(description = "创建时间")
    private Date createTime;

    @Schema(description = "资源名称")
    private String name;

    @Schema(description = "资源URL")
    private String url;

    @Schema(description = "描述")
    private String description;

    @Schema(description = "资源分类ID")
    private Long categoryId;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", createTime=" + createTime +
                ", name=" + name +
                ", url=" + url +
                ", description=" + description +
                ", categoryId=" + categoryId +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}