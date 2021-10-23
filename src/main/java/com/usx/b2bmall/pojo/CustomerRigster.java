package com.usx.b2bmall.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ToString
public class CustomerRigster {
    private Integer id;
    private String type;
    private String specifications;
    private String priceAndAmount;
    private String amount;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private LocalDateTime registerDate;
    private String registerType;
    private String status;
    private String isIndividual;
    private Integer auditorID;
}
