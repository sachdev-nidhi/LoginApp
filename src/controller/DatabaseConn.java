/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dea
 */
public class DatabaseConn {
    
    private static Connection conn;
    
    public static Connection dbConnect(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:login.db");
         
        }catch(Exception e){
            
            System.err.println(e.getMessage());
        }
        
        return conn;
    }
    
    public static void dbClose(){
        try {
            conn.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    
    
    
}
