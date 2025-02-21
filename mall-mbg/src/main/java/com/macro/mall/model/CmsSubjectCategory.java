package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class CmsSubjectCategory implements Serializable {
    private Long id;

    private String name;

    @Schema(description = "分类图标")
    private String icon;

    @Schema(description = "专题数量")
    private Integer subjectCount;

    private Integer showStatus;

    private Integer sort;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", name=" + name +
                ", icon=" + icon +
                ", subjectCount=" + subjectCount +
                ", showStatus=" + showStatus +
                ", sort=" + sort +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}