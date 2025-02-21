package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class CmsTopic implements Serializable {
    private Long id;

    private Long categoryId;

    private String name;

    private Date createTime;

    private Date startTime;

    private Date endTime;

    @Schema(description = "参与人数")
    private Integer attendCount;

    @Schema(description = "关注人数")
    private Integer attentionCount;

    private Integer readCount;

    @Schema(description = "奖品名称")
    private String awardName;

    @Schema(description = "参与方式")
    private String attendType;

    @Schema(description = "话题内容")
    private String content;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", categoryId=" + categoryId +
                ", name=" + name +
                ", createTime=" + createTime +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", attendCount=" + attendCount +
                ", attentionCount=" + attentionCount +
                ", readCount=" + readCount +
                ", awardName=" + awardName +
                ", attendType=" + attendType +
                ", content=" + content +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}