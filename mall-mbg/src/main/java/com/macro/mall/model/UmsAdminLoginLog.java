package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class UmsAdminLoginLog implements Serializable {
    private Long id;

    private Long adminId;

    private Date createTime;

    private String ip;

    private String address;

    @Schema(description = "浏览器登录类型")
    private String userAgent;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", adminId=" + adminId +
                ", createTime=" + createTime +
                ", ip=" + ip +
                ", address=" + address +
                ", userAgent=" + userAgent +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}