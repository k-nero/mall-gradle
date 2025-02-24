package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class CmsPrefrenceArea implements Serializable {
    private Long id;

    private String name;

    private String subTitle;

    private Integer sort;

    private Integer showStatus;

    @Schema(description = "展示图片")
    private byte[] pic;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", name=" + name +
                ", subTitle=" + subTitle +
                ", sort=" + sort +
                ", showStatus=" + showStatus +
                ", pic=" + String.valueOf(pic) +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}