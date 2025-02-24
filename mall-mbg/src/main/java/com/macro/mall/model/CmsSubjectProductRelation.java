package com.macro.mall.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class CmsSubjectProductRelation implements Serializable {
    private Long id;

    private Long subjectId;

    private Long productId;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", subjectId=" + subjectId +
                ", productId=" + productId +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}