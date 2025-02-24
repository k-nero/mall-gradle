package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class PmsProductVertifyRecord implements Serializable {
    private Long id;

    private Long productId;

    private Date createTime;

    @Schema(description = "审核人")
    private String vertifyMan;

    private Integer status;

    @Schema(description = "反馈详情")
    private String detail;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", productId=" + productId +
                ", createTime=" + createTime +
                ", vertifyMan=" + vertifyMan +
                ", status=" + status +
                ", detail=" + detail +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}