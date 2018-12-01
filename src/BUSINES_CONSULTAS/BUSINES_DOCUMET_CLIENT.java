/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BUSINES_CONSULTAS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static pe.main.INIT.con_mysql;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class BUSINES_DOCUMET_CLIENT {
    public  static Connection conectar() throws ClassNotFoundException, SQLException{
            String databaseURL = "jdbc:mysql://localhost/unicenta";  
            Class.forName("com.mysql.jdbc.Driver");  
            con_mysql = DriverManager.getConnection(databaseURL, "root", ""); 
        return con_mysql;
    }
    public  static ResultSet DATA_DOCUMENT_CLIENTE(String _doc) throws ClassNotFoundException, SQLException{
        ResultSet rs = null;
        Connection conn =conectar();
        Statement statement = conn.createStatement();
        rs = statement. executeQuery("call PF_DOCUMENTO('"+_doc+"');");        
        return rs;
    }
    
      public  static ResultSet DATA_ITEMS(int _id) throws ClassNotFoundException, SQLException{
        ResultSet rs = null;
        Connection conn =conectar();
        Statement statement = conn.createStatement();
        rs = statement. executeQuery("call PF_ITEMS("+_id+")");      
        return rs;
    }
       public  static ResultSet DATA_EMISOR(int _id) throws ClassNotFoundException, SQLException{
        ResultSet rs = null;
        Connection conn =conectar();
        Statement statement = conn.createStatement();
        rs = statement. executeQuery("call PF_EMISOR("+_id+")");      
        return rs;
    }
    
    
    

}
