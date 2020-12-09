/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.mng;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.LenLichSuKien;
import services.MysqlConnection;
/**
 *
 * @author keplegarry
 */
public class LenLichSuKienController {
    public static void lenLich(LenLichSuKien lich){
        try{
            Connection conn = MysqlConnection.getMysqlConnection();
            PreparedStatement ps = conn.prepareStatement("insert into event(Room, StartTime, FinishTime, Name, Descriptions, Fee, Note) values(?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, lich.getRoomName());
            ps.setString(2, lich.getStartTime());
            ps.setString(3, lich.getFinishTime());
            ps.setString(4, lich.getEventName());
            ps.setString(5, lich.getEventDescriptions());
            ps.setInt(6, lich.getFee());
            ps.setInt(7, lich.getNote());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Thêm thành công");
        } catch(SQLException e){
            
        } catch(ClassNotFoundException e){
            
        }
    }
}
