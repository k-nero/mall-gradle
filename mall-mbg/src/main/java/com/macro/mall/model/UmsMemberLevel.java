package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
public class UmsMemberLevel implements Serializable {
    private Long id;

    private String name;

    private Integer growthPoint;

    @Schema(description = "是否为默认等级：0->不是；1->是")
    private Integer defaultStatus;

    @Schema(description = "免运费标准")
    private BigDecimal freeFreightPoint;

    @Schema(description = "每次评价获取的成长值")
    private Integer commentGrowthPoint;

    @Schema(description = "是否有免邮特权")
    private Integer priviledgeFreeFreight;

    @Schema(description = "是否有签到特权")
    private Integer priviledgeSignIn;

    @Schema(description = "是否有评论获奖励特权")
    private Integer priviledgeComment;

    @Schema(description = "是否有专享活动特权")
    private Integer priviledgePromotion;

    @Schema(description = "是否有会员价格特权")
    private Integer priviledgeMemberPrice;

    @Schema(description = "是否有生日特权")
    private Integer priviledgeBirthday;

    private String note;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", name=" + name +
                ", growthPoint=" + growthPoint +
                ", defaultStatus=" + defaultStatus +
                ", freeFreightPoint=" + freeFreightPoint +
                ", commentGrowthPoint=" + commentGrowthPoint +
                ", priviledgeFreeFreight=" + priviledgeFreeFreight +
                ", priviledgeSignIn=" + priviledgeSignIn +
                ", priviledgeComment=" + priviledgeComment +
                ", priviledgePromotion=" + priviledgePromotion +
                ", priviledgeMemberPrice=" + priviledgeMemberPrice +
                ", priviledgeBirthday=" + priviledgeBirthday +
                ", note=" + note +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}