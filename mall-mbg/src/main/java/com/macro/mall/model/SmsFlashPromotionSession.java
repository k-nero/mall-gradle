package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class SmsFlashPromotionSession implements Serializable {
    @Schema(description = "编号")
    private Long id;

    @Schema(description = "场次名称")
    private String name;

    @Schema(description = "每日开始时间")
    private Date startTime;

    @Schema(description = "每日结束时间")
    private Date endTime;

    @Schema(description = "启用状态：0->不启用；1->启用")
    private Integer status;

    @Schema(description = "创建时间")
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
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", status=" + status +
                ", createTime=" + createTime +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}