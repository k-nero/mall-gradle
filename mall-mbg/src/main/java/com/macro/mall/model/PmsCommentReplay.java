package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class PmsCommentReplay implements Serializable {
    private Long id;

    private Long commentId;

    private String memberNickName;

    private String memberIcon;

    private String content;

    private Date createTime;

    @Schema(description = "评论人员类型；0->会员；1->管理员")
    private Integer type;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", commentId=" + commentId +
                ", memberNickName=" + memberNickName +
                ", memberIcon=" + memberIcon +
                ", content=" + content +
                ", createTime=" + createTime +
                ", type=" + type +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}