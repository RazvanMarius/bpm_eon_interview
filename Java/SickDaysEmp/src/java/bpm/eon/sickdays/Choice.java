/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bpm.eon.sickdays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author tzy41
 */
@ManagedBean
@RequestScoped
public class Choice {

    private String type;

    public Choice() {
        this.type = "";
    }

    public String loadPage() {
        if (type != null && type.equalsIgnoreCase("employee")) {
            return "formUser";
        } else {
            return "nameHr";
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
