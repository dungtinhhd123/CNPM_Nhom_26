/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author dungtinhhd123
 */
public class TinhTrangYeuCau {
    private String state;
    private String note;

    public TinhTrangYeuCau() {
    }

    
    
    public TinhTrangYeuCau(String state, String note) {
        this.state = state;
        this.note = note;
    }

    public String getState() {
        return state;
    }

    public String getNote() {
        return note;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
}
