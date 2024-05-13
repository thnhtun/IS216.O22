/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;
import Dao.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mac
 */
public class ConnectionUtils {


    public static Connection getJDBCConnection() throws SQLException,
            ClassNotFoundException {
       
        final String connectionURL = "jdbc:oracle:thin:@localhost:1521:orcl";
        final String user="database_doan_NPNT";
        final String password;
        password = "password";
        try {
             Class.forName("oracle.jdbc.driver.OracleDriver");
             return DriverManager.getConnection(connectionURL,user,password);
        }
        catch (ClassNotFoundException e)
        {e.printStackTrace();
        }catch(SQLException e)
        {e.printStackTrace();}
             Connection con = DriverManager.getConnection(connectionURL, user, password);
       
        return con;}
    }
