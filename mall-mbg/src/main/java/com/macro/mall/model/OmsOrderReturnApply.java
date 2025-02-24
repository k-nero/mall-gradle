package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
public class OmsOrderReturnApply implements Serializable {
    private Long id;

    @Schema(description = "订单id")
    private Long orderId;

    @Schema(description = "收货地址表id")
    private Long companyAddressId;

    @Schema(description = "退货商品id")
    private Long productId;

    @Schema(description = "订单编号")
    private String orderSn;

    @Schema(description = "申请时间")
    private Date createTime;

    @Schema(description = "会员用户名")
    private String memberUsername;

    @Schema(description = "退款金额")
    private BigDecimal returnAmount;

    @Schema(description = "退货人姓名")
    private String returnName;

    @Schema(description = "退货人电话")
    private String returnPhone;

    @Schema(description = "申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝")
    private Integer status;

    @Schema(description = "处理时间")
    private Date handleTime;

    @Schema(description = "商品图片")
    private String productPic;

    @Schema(description = "商品名称")
    private String productName;

    @Schema(description = "商品品牌")
    private String productBrand;

    @Schema(description = "商品销售属性：颜色：红色；尺码：xl;")
    private String productAttr;

    @Schema(description = "退货数量")
    private Integer productCount;

    @Schema(description = "商品单价")
    private BigDecimal productPrice;

    @Schema(description = "商品实际支付单价")
    private BigDecimal productRealPrice;

    @Schema(description = "原因")
    private String reason;

    @Schema(description = "描述")
    private String description;

    @Schema(description = "凭证图片，以逗号隔开")
    private String proofPics;

    @Schema(description = "处理备注")
    private String handleNote;

    @Schema(description = "处理人员")
    private String handleMan;

    @Schema(description = "收货人")
    private String receiveMan;

    @Schema(description = "收货时间")
    private Date receiveTime;

    @Schema(description = "收货备注")
    private String receiveNote;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", orderId=" + orderId +
                ", companyAddressId=" + companyAddressId +
                ", productId=" + productId +
                ", orderSn=" + orderSn +
                ", createTime=" + createTime +
                ", memberUsername=" + memberUsername +
                ", returnAmount=" + returnAmount +
                ", returnName=" + returnName +
                ", returnPhone=" + returnPhone +
                ", status=" + status +
                ", handleTime=" + handleTime +
                ", productPic=" + productPic +
                ", productName=" + productName +
                ", productBrand=" + productBrand +
                ", productAttr=" + productAttr +
                ", productCount=" + productCount +
                ", productPrice=" + productPrice +
                ", productRealPrice=" + productRealPrice +
                ", reason=" + reason +
                ", description=" + description +
                ", proofPics=" + proofPics +
                ", handleNote=" + handleNote +
                ", handleMan=" + handleMan +
                ", receiveMan=" + receiveMan +
                ", receiveTime=" + receiveTime +
                ", receiveNote=" + receiveNote +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}