package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class UmsMemberReceiveAddress implements Serializable {
    private Long id;

    private Long memberId;

    @Schema(description = "收货人名称")
    private String name;

    private String phoneNumber;

    @Schema(description = "是否为默认")
    private Integer defaultStatus;

    @Schema(description = "邮政编码")
    private String postCode;

    @Schema(description = "省份/直辖市")
    private String province;

    @Schema(description = "城市")
    private String city;

    @Schema(description = "区")
    private String region;

    @Schema(description = "详细地址(街道)")
    private String detailAddress;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", memberId=" + memberId +
                ", name=" + name +
                ", phoneNumber=" + phoneNumber +
                ", defaultStatus=" + defaultStatus +
                ", postCode=" + postCode +
                ", province=" + province +
                ", city=" + city +
                ", region=" + region +
                ", detailAddress=" + detailAddress +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}