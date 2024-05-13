package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testJDBCUtil {

    public static void main(String[] args) throws SQLException,
            ClassNotFoundException {
        Connection con = JDBCUtil.getConnection();

        JDBCUtil.printInfo(con);

        JDBCUtil.closeConnection(con);

    }

    public static Connection login(String userName, String password) throws SQLException,
            ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521/orcl";
        Connection con = DriverManager.getConnection(url, userName, password);
        return con;
    }
}
