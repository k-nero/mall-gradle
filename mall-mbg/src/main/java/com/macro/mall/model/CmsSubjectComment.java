package com.macro.mall.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class CmsSubjectComment implements Serializable {
    private Long id;

    private Long subjectId;

    private String memberNickName;

    private String memberIcon;

    private String content;

    private Date createTime;

    private Integer showStatus;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", subjectId=" + subjectId +
                ", memberNickName=" + memberNickName +
                ", memberIcon=" + memberIcon +
                ", content=" + content +
                ", createTime=" + createTime +
                ", showStatus=" + showStatus +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}