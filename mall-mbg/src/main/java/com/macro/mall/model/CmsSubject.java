package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class CmsSubject implements Serializable {
    private Long id;

    private Long categoryId;

    private String title;

    @Schema(description = "专题主图")
    private String pic;

    @Schema(description = "关联产品数量")
    private Integer productCount;

    private Integer recommendStatus;

    private Date createTime;

    private Integer collectCount;

    private Integer readCount;

    private Integer commentCount;

    @Schema(description = "画册图片用逗号分割")
    private String albumPics;

    private String description;

    @Schema(description = "显示状态：0->不显示；1->显示")
    private Integer showStatus;

    @Schema(description = "转发数")
    private Integer forwardCount;

    @Schema(description = "专题分类名称")
    private String categoryName;

    private String content;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", categoryId=" + categoryId +
                ", title=" + title +
                ", pic=" + pic +
                ", productCount=" + productCount +
                ", recommendStatus=" + recommendStatus +
                ", createTime=" + createTime +
                ", collectCount=" + collectCount +
                ", readCount=" + readCount +
                ", commentCount=" + commentCount +
                ", albumPics=" + albumPics +
                ", description=" + description +
                ", showStatus=" + showStatus +
                ", forwardCount=" + forwardCount +
                ", categoryName=" + categoryName +
                ", content=" + content +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}