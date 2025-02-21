package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class UmsMemberTask implements Serializable {
    private Long id;

    private String name;

    @Schema(description = "赠送成长值")
    private Integer growth;

    @Schema(description = "赠送积分")
    private Integer intergration;

    @Schema(description = "任务类型：0->新手任务；1->日常任务")
    private Integer type;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", name=" + name +
                ", growth=" + growth +
                ", intergration=" + intergration +
                ", type=" + type +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}