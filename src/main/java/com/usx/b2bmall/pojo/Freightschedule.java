package com.usx.b2bmall.pojo;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Panshenshen
 * @since 2021-10-13
 */
public class Freightschedule implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String orderID;

    private String descript;

    private LocalDateTime freightDate;

    private String inputer;

    private LocalDateTime inputDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public LocalDateTime getFreightDate() {
        return freightDate;
    }

    public void setFreightDate(LocalDateTime freightDate) {
        this.freightDate = freightDate;
    }

    public String getInputer() {
        return inputer;
    }

    public void setInputer(String inputer) {
        this.inputer = inputer;
    }

    public LocalDateTime getInputDate() {
        return inputDate;
    }

    public void setInputDate(LocalDateTime inputDate) {
        this.inputDate = inputDate;
    }

    @Override
    public String toString() {
        return "Freightschedule{" +
        "id=" + id +
        ", orderID=" + orderID +
        ", descript=" + descript +
        ", freightDate=" + freightDate +
        ", inputer=" + inputer +
        ", inputDate=" + inputDate +
        "}";
    }
}
