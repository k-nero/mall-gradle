package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class UmsGrowthChangeHistory implements Serializable {
    private Long id;

    private Long memberId;

    private Date createTime;

    @Schema(description = "改变类型：0->增加；1->减少")
    private Integer changeType;

    @Schema(description = "积分改变数量")
    private Integer changeCount;

    @Schema(description = "操作人员")
    private String operateMan;

    @Schema(description = "操作备注")
    private String operateNote;

    @Schema(description = "积分来源：0->购物；1->管理员修改")
    private Integer sourceType;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", memberId=" + memberId +
                ", createTime=" + createTime +
                ", changeType=" + changeType +
                ", changeCount=" + changeCount +
                ", operateMan=" + operateMan +
                ", operateNote=" + operateNote +
                ", sourceType=" + sourceType +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}