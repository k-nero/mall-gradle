package com.macro.mall.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class PmsAlbumPic implements Serializable {
    private Long id;

    private Long albumId;

    private String pic;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", albumId=" + albumId +
                ", pic=" + pic +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}