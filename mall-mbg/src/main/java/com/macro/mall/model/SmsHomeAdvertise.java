package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class SmsHomeAdvertise implements Serializable {
    private Long id;

    private String name;

    @Schema(description = "轮播位置：0->PC首页轮播；1->app首页轮播")
    private Integer type;

    private String pic;

    private Date startTime;

    private Date endTime;

    @Schema(description = "上下线状态：0->下线；1->上线")
    private Integer status;

    @Schema(description = "点击数")
    private Integer clickCount;

    @Schema(description = "下单数")
    private Integer orderCount;

    @Schema(description = "链接地址")
    private String url;

    @Schema(description = "备注")
    private String note;

    @Schema(description = "排序")
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
                ", type=" + type +
                ", pic=" + pic +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", status=" + status +
                ", clickCount=" + clickCount +
                ", orderCount=" + orderCount +
                ", url=" + url +
                ", note=" + note +
                ", sort=" + sort +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}