/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bpm.eon.sickdays;

import java.text.SimpleDateFormat;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author tzy41
 */
@ManagedBean
public class Form {

    private String name, startDate, endDate, comment, status;
    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

    public Form() {
        this.name = "";
        this.startDate = "";
        this.endDate = "";
        this.comment = "";
        this.status = "Pending";
    }

    public Form(String name, String startDate, String endDate, String comment, String status) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.comment = comment;
        this.status = status == null || status.isEmpty() ? "Pending" : status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null || status.isEmpty() ? "Pending" : status;
    }

    @Override
    public String toString() {
        return "[userName=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", comment=" + comment + ", status=" + status + "]";
    }
}
