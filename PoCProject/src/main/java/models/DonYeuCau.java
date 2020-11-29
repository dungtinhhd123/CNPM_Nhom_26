/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.util.Date;
/**
 *
 * @author dungtinhhd123
 */
public class DonYeuCau {
    private String userUsername;
    private String userFullName;
    private Date dateOfBirth;
    private String phone;
    private String address;
    private String requestRoom;
    private Date startTime;
    private Date finishTime;

    public DonYeuCau() {
    }

    public DonYeuCau(String userUsername, String userFullName, Date dateOfBirth, String phone, String address, String requestRoom, Date startTime, Date finishTime) {
        this.userUsername = userUsername;
        this.userFullName = userFullName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.address = address;
        this.requestRoom = requestRoom;
        this.startTime = startTime;
        this.finishTime = finishTime;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getRequestRoom() {
        return requestRoom;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRequestRoom(String requestRoom) {
        this.requestRoom = requestRoom;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }
    
    
}
