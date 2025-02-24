package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class PmsBrand implements Serializable {
    private Long id;

    private String name;

    @Schema(description = "首字母")
    private String firstLetter;

    private Integer sort;

    @Schema(description = "是否为品牌制造商：0->不是；1->是")
    private Integer factoryStatus;

    private Integer showStatus;

    @Schema(description = "产品数量")
    private Integer productCount;

    @Schema(description = "产品评论数量")
    private Integer productCommentCount;

    @Schema(description = "品牌logo")
    private String logo;

    @Schema(description = "专区大图")
    private String bigPic;

    @Schema(description = "品牌故事")
    private String brandStory;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", name=" + name +
                ", firstLetter=" + firstLetter +
                ", sort=" + sort +
                ", factoryStatus=" + factoryStatus +
                ", showStatus=" + showStatus +
                ", productCount=" + productCount +
                ", productCommentCount=" + productCommentCount +
                ", logo=" + logo +
                ", bigPic=" + bigPic +
                ", brandStory=" + brandStory +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}