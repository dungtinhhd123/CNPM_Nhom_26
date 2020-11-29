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
public class CapNhatCoSoVatChat {
    private String itemName;
    private String itemColor;
    private String roomName;
    private String itemDescriptions;

    public CapNhatCoSoVatChat() {
    }

    public CapNhatCoSoVatChat(String itemName, String itemColor, String roomName, String itemDescriptions) {
        this.itemName = itemName;
        this.itemColor = itemColor;
        this.roomName = roomName;
        this.itemDescriptions = itemDescriptions;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemColor() {
        return itemColor;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getItemDescriptions() {
        return itemDescriptions;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemColor(String itemColor) {
        this.itemColor = itemColor;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setItemDescriptions(String itemDescriptions) {
        this.itemDescriptions = itemDescriptions;
    }
       
}
