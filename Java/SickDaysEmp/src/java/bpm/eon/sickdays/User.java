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
public class User {

    private int userId, teamId;
    private String name, userType;

    public User() {
        this.userId = new java.util.Random().nextInt(8999) + 1000;
        this.teamId = new java.util.Random().nextInt(8999) + 1000;
        this.name = "your user name";
        this.userType = "unknown";
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
