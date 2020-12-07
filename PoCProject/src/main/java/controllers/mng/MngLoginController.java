/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.mng;

import services.MysqlConnection;
import java.sql.*;

/**
 *
 * @author macbookpro
 */
public class MngLoginController {
    private static boolean check = false;
    
    public static boolean getCheck(){
        return check;
    }

    public boolean mngLogin(String mngUsername, String mngPassword) {
        try {
                    Connection conn = DB.getConn();
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
                    }   
            } catch(SQLException e){
        }       
    }
    
}
