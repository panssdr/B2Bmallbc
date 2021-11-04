package com.usx.b2bmall.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ToString
public class CustomerRigster {
    private Integer id;
    private String type; //手机号
    private String specifications;//姓名
    private String priceAndAmount; //公司名称
    private String amount; //公司地址
    private String passWord;  //密码
    private String wechatNum; //微信
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private LocalDateTime registerDate; //注册日期
    private String registerType; //注册类型
    private String status; //审核状态
    private String isIndividual; //客户类型  个人或非个人
    private Integer auditorID; //审核人ID
    private String coTelephone; //公司电话
    private String email; //邮箱
    private String telephone;//座机
    private String qq; //qq号
    private String contactAddress;//联系地址
}
