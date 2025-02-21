package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class SmsFlashPromotionLog implements Serializable {
    private Integer id;

    private Integer memberId;

    private Long productId;

    private String memberPhone;

    private String productName;

    @Schema(description = "会员订阅时间")
    private Date subscribeTime;

    private Date sendTime;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", memberId=" + memberId +
                ", productId=" + productId +
                ", memberPhone=" + memberPhone +
                ", productName=" + productName +
                ", subscribeTime=" + subscribeTime +
                ", sendTime=" + sendTime +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}