/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bpm.eon.sickdays;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author tzy41
 */
@ManagedBean
public class HrName {

    String name;

    public HrName() {
        this.name = "";
    }

    public HrName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
