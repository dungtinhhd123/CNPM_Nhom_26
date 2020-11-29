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
public class LichSuDung {
    private String roomName;
    private Date startTime;
    private Date finishTime;
    private String eventName;

    public LichSuDung() {
    }

    public LichSuDung(String roomName, Date startTime, Date finishTime, String eventName) {
        this.roomName = roomName;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.eventName = eventName;
    }

    public String getRoomName() {
        return roomName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public String getEventName() {
        return eventName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    
    
}
