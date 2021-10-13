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
public class News implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String title;

    private String content;

    private String images;

    private String keys;

    private Integer newsCategoryID;

    private Integer count;

    private LocalDateTime inputDate;

    private Integer inputerID;

    private LocalDateTime auditDate;

    private Integer auditorID;

    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public Integer getNewsCategoryID() {
        return newsCategoryID;
    }

    public void setNewsCategoryID(Integer newsCategoryID) {
        this.newsCategoryID = newsCategoryID;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public LocalDateTime getInputDate() {
        return inputDate;
    }

    public void setInputDate(LocalDateTime inputDate) {
        this.inputDate = inputDate;
    }

    public Integer getInputerID() {
        return inputerID;
    }

    public void setInputerID(Integer inputerID) {
        this.inputerID = inputerID;
    }

    public LocalDateTime getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(LocalDateTime auditDate) {
        this.auditDate = auditDate;
    }

    public Integer getAuditorID() {
        return auditorID;
    }

    public void setAuditorID(Integer auditorID) {
        this.auditorID = auditorID;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "News{" +
        "id=" + id +
        ", title=" + title +
        ", content=" + content +
        ", images=" + images +
        ", keys=" + keys +
        ", newsCategoryID=" + newsCategoryID +
        ", count=" + count +
        ", inputDate=" + inputDate +
        ", inputerID=" + inputerID +
        ", auditDate=" + auditDate +
        ", auditorID=" + auditorID +
        ", status=" + status +
        "}";
    }
}
