package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class PmsComment implements Serializable {
    private Long id;

    private Long productId;

    private String memberNickName;

    private String productName;

    @Schema(description = "评价星数：0->5")
    private Integer star;

    @Schema(description = "评价的ip")
    private String memberIp;

    private Date createTime;

    private Integer showStatus;

    @Schema(description = "购买时的商品属性")
    private String productAttribute;

    private Integer collectCouont;

    private Integer readCount;

    @Schema(description = "上传图片地址，以逗号隔开")
    private String pics;

    @Schema(description = "评论用户头像")
    private String memberIcon;

    private Integer replayCount;

    private String content;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", productId=" + productId +
                ", memberNickName=" + memberNickName +
                ", productName=" + productName +
                ", star=" + star +
                ", memberIp=" + memberIp +
                ", createTime=" + createTime +
                ", showStatus=" + showStatus +
                ", productAttribute=" + productAttribute +
                ", collectCouont=" + collectCouont +
                ", readCount=" + readCount +
                ", pics=" + pics +
                ", memberIcon=" + memberIcon +
                ", replayCount=" + replayCount +
                ", content=" + content +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}