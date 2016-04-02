/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Adil
 */
public class Connections {
        private ResultSet rs;
    private Connection con;
    private Statement st;
    public Connection Conn()
      {
     try{
          Class.forName("com.mysql.jdbc.Driver");
      con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Program","root","");
    st=con.createStatement();
    return con;
     }
     catch(Exception ex)
     {
     ex.printStackTrace();
     return null;
     }
}


}