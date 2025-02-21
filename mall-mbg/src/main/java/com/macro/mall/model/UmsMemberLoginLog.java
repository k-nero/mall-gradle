package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class UmsMemberLoginLog implements Serializable {
    private Long id;

    private Long memberId;

    private Date createTime;

    private String ip;

    private String city;

    @Schema(description = "登录类型：0->PC；1->android;2->ios;3->小程序")
    private Integer loginType;

    private String province;

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
                ", ip=" + ip +
                ", city=" + city +
                ", loginType=" + loginType +
                ", province=" + province +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}