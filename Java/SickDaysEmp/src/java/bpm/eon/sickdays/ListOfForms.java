/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bpm.eon.sickdays;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author tzy41
 */
@ManagedBean
public class ListOfForms {

    private ArrayList<Form> forms;

    public ListOfForms(ArrayList<Form> forms) {
        this.forms = forms;
    }

    public ListOfForms() {
        this.forms = new ArrayList<>();
    }

    public ArrayList<Form> getForms() {
        return forms;
    }

    public void setForms(ArrayList<Form> forms) {
        this.forms = forms;
    }
}
