package com.macro.mall.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class PmsAlbum implements Serializable {
    private Long id;

    private String name;

    private String coverPic;

    private Integer picCount;

    private Integer sort;

    private String description;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", name=" + name +
                ", coverPic=" + coverPic +
                ", picCount=" + picCount +
                ", sort=" + sort +
                ", description=" + description +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}