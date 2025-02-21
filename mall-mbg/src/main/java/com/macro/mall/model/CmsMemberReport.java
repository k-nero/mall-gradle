package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class CmsMemberReport implements Serializable {
    private Long id;

    @Schema(description = "举报类型：0->商品评价；1->话题内容；2->用户评论")
    private Integer reportType;

    @Schema(description = "举报人")
    private String reportMemberName;

    private Date createTime;

    private String reportObject;

    @Schema(description = "举报状态：0->未处理；1->已处理")
    private Integer reportStatus;

    @Schema(description = "处理结果：0->无效；1->有效；2->恶意")
    private Integer handleStatus;

    private String note;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", reportType=" + reportType +
                ", reportMemberName=" + reportMemberName +
                ", createTime=" + createTime +
                ", reportObject=" + reportObject +
                ", reportStatus=" + reportStatus +
                ", handleStatus=" + handleStatus +
                ", note=" + note +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}