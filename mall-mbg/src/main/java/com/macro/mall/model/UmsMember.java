package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class UmsMember implements Serializable {
    private Long id;

    private Long memberLevelId;

    @Schema(description = "用户名")
    private String username;

    @Schema(description = "密码")
    private String password;

    @Schema(description = "昵称")
    private String nickname;

    @Schema(description = "手机号码")
    private String phone;

    @Schema(description = "帐号启用状态:0->禁用；1->启用")
    private Integer status;

    @Schema(description = "注册时间")
    private Date createTime;

    @Schema(description = "头像")
    private String icon;

    @Schema(description = "性别：0->未知；1->男；2->女")
    private Integer gender;

    @Schema(description = "生日")
    private Date birthday;

    @Schema(description = "所做城市")
    private String city;

    @Schema(description = "职业")
    private String job;

    @Schema(description = "个性签名")
    private String personalizedSignature;

    @Schema(description = "用户来源")
    private Integer sourceType;

    @Schema(description = "积分")
    private Integer integration;

    @Schema(description = "成长值")
    private Integer growth;

    @Schema(description = "剩余抽奖次数")
    private Integer luckeyCount;

    @Schema(description = "历史积分数量")
    private Integer historyIntegration;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", memberLevelId=" + memberLevelId +
                ", username=" + username +
                ", password=" + password +
                ", nickname=" + nickname +
                ", phone=" + phone +
                ", status=" + status +
                ", createTime=" + createTime +
                ", icon=" + icon +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", city=" + city +
                ", job=" + job +
                ", personalizedSignature=" + personalizedSignature +
                ", sourceType=" + sourceType +
                ", integration=" + integration +
                ", growth=" + growth +
                ", luckeyCount=" + luckeyCount +
                ", historyIntegration=" + historyIntegration +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}