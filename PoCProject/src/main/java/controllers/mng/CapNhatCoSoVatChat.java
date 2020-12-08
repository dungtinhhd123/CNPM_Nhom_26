/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.mng;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import models.ThongTinCoSoVatChat;
import services.MysqlConnection;

/**
 *
 * @author keplegarry
 */
public class CapNhatCoSoVatChat {
    public static ThongTinCoSoVatChat thongTinCoSoVatChat(String name, String room) {
        try{
            Connection conn = MysqlConnection.getMysqlConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from ThongTinCoSoVatChat");
            while(rs.next()){
                if(rs.getString("itemName").equals(name) && rs.getString("roomName").equals(room)){
                    return new ThongTinCoSoVatChat(name, rs.getString("roomName"), rs.getString("itemDescriptions"), rs.getInt("amount"), rs.getString("lastTimeUpDate"));
                }
                }
            } catch(SQLException e){
                }
            catch(ClassNotFoundException e){       
            } 
        return null;
    }
    
    public static void capNhatCSVC(String name, String room, String date, String description, int amount){
        try{
            Connection conn = MysqlConnection.getMysqlConnection();
            Statement st = conn.createStatement();
            PreparedStatement ps = conn.prepareStatement("update ThongTinCoSoVatChat "
                    + "set itemName=?, itemDescriptions=?, amount=?, roomName=?, lastTimeUpDate=?" 
                    + "where itemName='" + name + "' and roomName='" + room +"'");
            ps.setString(1, name);
            ps.setString(2, description);
            ps.setInt(3, amount);
            ps.setString(4, room);
            ps.setString(5, date);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cập nhật thành công");

            } catch(SQLException e){
                }
            catch(ClassNotFoundException e){       
            }
    }
    
    public static void themCSVC(String name, String room, String date, String description, int amount){
        try{
            Connection conn = MysqlConnection.getMysqlConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from ThongTinCoSoVatChat");
            while(rs.next()){
                if(rs.getString("itemName").equals(name) && rs.getString("roomName").equals(room)){
                    JOptionPane.showMessageDialog(null, "Tên vật phẩm đã tồn tại", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            PreparedStatement ps = conn.prepareStatement("INSERT INTO ThongTinCoSoVatChat(itemName, itemDescriptions, amount, roomName, lastTimeUpDate) VALUES(?, ?, ?, ?, ?)");
            ps.setString(1, name);
            ps.setString(2, description);
            ps.setInt(3, amount);
            ps.setString(4, room);
            ps.setString(5, date);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cập nhật thành công");
        } catch(SQLException e){
                }
            catch(ClassNotFoundException e){       
            }
    }
}
