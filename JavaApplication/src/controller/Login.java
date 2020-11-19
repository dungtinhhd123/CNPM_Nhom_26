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
public class Login {
    private static boolean check = false;
    
    public Login(){
    }
    
    public static boolean getCheck(){
        return check;
    }
    public static void login(String user, String pass){
            try {
                try (Connection conn = DB.getConn()) {
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery("select * from account");
                    
                    while(rs.next()){
                        if(rs.getString("username").equals(user) && rs.getString("password").equals(pass))
                            check = true;
                    }
                    if(check){
                        JOptionPane.showMessageDialog(null, "Dang nhap thanh cong");
                    } else {
                        JOptionPane.showMessageDialog(null, "Tai khoan khong ton tai", "Warning", JOptionPane.WARNING_MESSAGE);
                    }   }
        } catch(SQLException e){
        }
    }
}
