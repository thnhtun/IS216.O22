package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {

    public static Connection getJDBCConnection() throws SQLException, ClassNotFoundException {

        // Thông số kết nối
        // dùng Oracle thin, port: 1521, SID: orcl
        final String connectionURL = "jdbc:oracle:thin:@localhost:1521:orcl";
        final String user = "database_doan_NPNT";
        final String password = "password";

        // Xử lý ngoại lệ
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            return DriverManager.getConnection(connectionURL, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Tạo kết nối 
        Connection con = DriverManager.getConnection(connectionURL, user, password);

        return con;
    }

    public static void closeConnection(Connection con) {
        
        // Đóng kết nối
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
