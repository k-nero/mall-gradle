package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class OmsOrderOperateHistory implements Serializable {
    private Long id;

    @Schema(description = "订单id")
    private Long orderId;

    @Schema(description = "操作人：用户；系统；后台管理员")
    private String operateMan;

    @Schema(description = "操作时间")
    private Date createTime;

    @Schema(description = "订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
    private Integer orderStatus;

    @Schema(description = "备注")
    private String note;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", orderId=" + orderId +
                ", operateMan=" + operateMan +
                ", createTime=" + createTime +
                ", orderStatus=" + orderStatus +
                ", note=" + note +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}