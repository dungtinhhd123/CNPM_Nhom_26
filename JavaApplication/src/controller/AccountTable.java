/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author keplegarry
 */
public class AccountTable {
    public static void ShowTable(DefaultTableModel model){
        try{
            Connection conn =  DB.getConn();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from account");
            while(rs.next()){
               model.addRow(new Object[]{
                   rs.getString("username"), rs.getString("password")
               });
            }
        } catch(SQLException e){
        }
    }
}
