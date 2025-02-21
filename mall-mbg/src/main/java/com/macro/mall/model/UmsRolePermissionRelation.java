package com.macro.mall.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class UmsRolePermissionRelation implements Serializable {
    private Long id;

    private Long roleId;

    private Long permissionId;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", roleId=" + roleId +
                ", permissionId=" + permissionId +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}