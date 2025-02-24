package com.macro.mall.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class SmsHomeBrand implements Serializable {
    private Long id;

    private Long brandId;

    private String brandName;

    private Integer recommendStatus;

    private Integer sort;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", brandId=" + brandId +
                ", brandName=" + brandName +
                ", recommendStatus=" + recommendStatus +
                ", sort=" + sort +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}