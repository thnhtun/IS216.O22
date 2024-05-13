/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author buihu
 */
public class testJDBCUtil {
    public static void main(String[] args) throws SQLException {
        Connection con = JDBCUtil.getConnection();
        
        JDBCUtil.printInfo(con);
        
        JDBCUtil.closeConnection(con);

    }
}
