package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class OmsCompanyAddress implements Serializable {
    private Long id;

    @Schema(description = "地址名称")
    private String addressName;

    @Schema(description = "默认发货地址：0->否；1->是")
    private Integer sendStatus;

    @Schema(description = "是否默认收货地址：0->否；1->是")
    private Integer receiveStatus;

    @Schema(description = "收发货人姓名")
    private String name;

    @Schema(description = "收货人电话")
    private String phone;

    @Schema(description = "省/直辖市")
    private String province;

    @Schema(description = "市")
    private String city;

    @Schema(description = "区")
    private String region;

    @Schema(description = "详细地址")
    private String detailAddress;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", addressName=" + addressName +
                ", sendStatus=" + sendStatus +
                ", receiveStatus=" + receiveStatus +
                ", name=" + name +
                ", phone=" + phone +
                ", province=" + province +
                ", city=" + city +
                ", region=" + region +
                ", detailAddress=" + detailAddress +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}