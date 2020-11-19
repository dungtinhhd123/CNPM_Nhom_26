/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author keplegarry
 */
public class Signup {
    public static void signup(String user, String pass){
        try{
            Connection conn = DB.getConn();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from account");
            boolean check = false;
            while(rs.next()){
                if(rs.getString("username").equals(user))
                    check = true;
            }
            if(check){
                JOptionPane.showMessageDialog(null, "Ten dang nhap da ton tai");
            } else {
                PreparedStatement ps = conn.prepareStatement("INSERT INTO account(username, password) VALUES(?, ?)");
                ps.setString(1, user);
                ps.setString(2, pass);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "dang ki thanh cong");
            }
        } catch(SQLException e){
        }
        
    }
}
