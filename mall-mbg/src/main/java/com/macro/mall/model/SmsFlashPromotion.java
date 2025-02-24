package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class SmsFlashPromotion implements Serializable {
    private Long id;

    @Schema(description = "秒杀时间段名称")
    private String title;

    @Schema(description = "开始日期")
    private Date startDate;

    @Schema(description = "结束日期")
    private Date endDate;

    @Schema(description = "上下线状态")
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
                ", title=" + title +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", status=" + status +
                ", createTime=" + createTime +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}