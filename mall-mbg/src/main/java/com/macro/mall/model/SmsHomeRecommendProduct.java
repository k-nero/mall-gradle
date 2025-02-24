package com.macro.mall.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class SmsHomeRecommendProduct implements Serializable {
    private Long id;

    private Long productId;

    private String productName;

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
                ", productId=" + productId +
                ", productName=" + productName +
                ", recommendStatus=" + recommendStatus +
                ", sort=" + sort +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}