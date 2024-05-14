/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Connection.*;
import Model.NhanVienModel;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author phuch
 */
public class TrangChuDAO {
  public static int KTLoaiNV(String maUser) {
        System.out.println(maUser);
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "Select LoaiNV from NhanVien  where MaNV=? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, maUser);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getString("LoaiNV"));
                switch (rs.getString("LoaiNV")) {
                    case "Quản lý" -> {
                        return 1;
                    }
                    case "Tạp vụ" -> {
                        return 2;
                    }
                    case "Lễ Tân" -> {
                        return 3;
                    }
                    
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(TrangChuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}
