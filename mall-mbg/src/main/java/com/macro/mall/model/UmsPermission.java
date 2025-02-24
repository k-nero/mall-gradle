package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class UmsPermission implements Serializable {
    private Long id;

    @Schema(description = "父级权限id")
    private Long pid;

    @Schema(description = "名称")
    private String name;

    @Schema(description = "权限值")
    private String value;

    @Schema(description = "图标")
    private String icon;

    @Schema(description = "权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）")
    private Integer type;

    @Schema(description = "前端资源路径")
    private String uri;

    @Schema(description = "启用状态；0->禁用；1->启用")
    private Integer status;

    @Schema(description = "创建时间")
    private Date createTime;

    @Schema(description = "排序")
    private Integer sort;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", pid=" + pid +
                ", name=" + name +
                ", value=" + value +
                ", icon=" + icon +
                ", type=" + type +
                ", uri=" + uri +
                ", status=" + status +
                ", createTime=" + createTime +
                ", sort=" + sort +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}