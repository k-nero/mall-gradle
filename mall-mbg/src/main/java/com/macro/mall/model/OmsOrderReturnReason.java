package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class OmsOrderReturnReason implements Serializable {
    private Long id;

    @Schema(description = "退货类型")
    private String name;

    private Integer sort;

    @Schema(description = "状态：0->不启用；1->启用")
    private Integer status;

    @Schema(description = "添加时间")
    private Date createTime;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", name=" + name +
                ", sort=" + sort +
                ", status=" + status +
                ", createTime=" + createTime +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}