
package View;

import DAO.KhachHangDAO;
import DAO.TrangChuDAO;
import Model.KhachHangModel;
import Model.NhanVienModel;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SuaKhachHangFrame extends javax.swing.JFrame {
    private static NhanVienModel currentUser;
    private String maKH; // Biến cục bộ để lưu trữ giá trị maKH
    private KhachHangModel kh; // Biến để lưu trữ thông tin khách hàng

    // Constructor nhận giá trị maKH
    public SuaKhachHangFrame(String maKH) {
        this.setLocationRelativeTo(null);
        
        this.maKH = maKH; // Lưu giá trị maKH vào biến cục bộ
        
        // Gọi phương thức khởi tạo giao diện
        initComponents();

        // Lấy thông tin khách hàng từ cơ sở dữ liệu
        try {
            kh = KhachHangDAO.getKHtheoMaKHK(maKH);
            // Sử dụng thông tin kh để cập nhật giao diện
            if (kh != null) {
                hoTenjLable.setText(kh.getTenKH());
                CCCDjLabel.setText(kh.getCCCD());
                ngaySinhjLabel.setText(kh.getNgaySinh().toString());
                gioiTinhjLabel.setText(kh.getGioiTinh());
                diaChijLabel.setText(kh.getDiaChi());
                sdtjLabel.setText(kh.getSDT());
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin khách hàng!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi lấy thông tin khách hàng!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private DefaultTableModel defaultTableModel = new DefaultTableModel(){
            public boolean isCellEdittable(int row, int column){
                return false;
            }
        };
    
    private static final Logger LOGGER = Logger.getLogger(SuaKhachHangFrame.class.getName());
    

    

    
   
   
   
   
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        MenuPanel = new javax.swing.JPanel();
        NhanVienButton = new javax.swing.JButton();
        KhachHangButton = new javax.swing.JButton();
        HopDongButton = new javax.swing.JButton();
        KhuyenMaiButton = new javax.swing.JButton();
        TrangBiButton = new javax.swing.JButton();
        HoaDonButton = new javax.swing.JButton();
        ChamCongButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        hoTenjLable = new javax.swing.JLabel();
        hoTenjTextField = new javax.swing.JTextField();
        CCCDjLabel = new javax.swing.JLabel();
        CCCDjTextField = new javax.swing.JTextField();
        gioiTinhjLabel = new javax.swing.JLabel();
        gioiTinhjComboBox = new javax.swing.JComboBox<>();
        ngaySinhjLabel = new javax.swing.JLabel();
        diaChijLabel = new javax.swing.JLabel();
        diaChijTextField = new javax.swing.JTextField();
        sdtjLabel = new javax.swing.JLabel();
        SDTjTextField = new javax.swing.JTextField();
        suajButton = new javax.swing.JButton();
        huyjButton = new javax.swing.JButton();
        luuYjLabel = new javax.swing.JLabel();
        ngaySinhjComboBox = new de.wannawork.jcalendar.JCalendarComboBox();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        MenuPanel.setBackground(new java.awt.Color(153, 153, 255));

        NhanVienButton.setText("Nhân Viên");
        NhanVienButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhanVienButtonMouseClicked(evt);
            }
        });

        KhachHangButton.setText("Khách Hàng");
        KhachHangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KhachHangButtonActionPerformed(evt);
            }
        });

        HopDongButton.setText("Hợp Đồng");
        HopDongButton.setPreferredSize(new java.awt.Dimension(75, 35));
        HopDongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HopDongButtonActionPerformed(evt);
            }
        });

        KhuyenMaiButton.setText("Khuyến Mãi");
        KhuyenMaiButton.setPreferredSize(new java.awt.Dimension(91, 35));
        KhuyenMaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KhuyenMaiButtonActionPerformed(evt);
            }
        });

        TrangBiButton.setText("Trang Bị");
        TrangBiButton.setPreferredSize(new java.awt.Dimension(73, 35));
        TrangBiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrangBiButtonActionPerformed(evt);
            }
        });

        HoaDonButton.setText("Hóa Đơn");
        HoaDonButton.setPreferredSize(new java.awt.Dimension(78, 35));
        HoaDonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoaDonButtonActionPerformed(evt);
            }
        });

        ChamCongButton.setText("Chấm Công");
        ChamCongButton.setPreferredSize(new java.awt.Dimension(93, 35));
        ChamCongButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChamCongButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ChamCongButton, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(HoaDonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TrangBiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HopDongButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KhachHangButton, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(NhanVienButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KhuyenMaiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(KhachHangButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NhanVienButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HopDongButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(KhuyenMaiButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(TrangBiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(HoaDonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ChamCongButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        getContentPane().add(MenuPanel);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Khách Hàng ");

        Logout.setBackground(new java.awt.Color(153, 153, 255));
        Logout.setText("Đăng xuất ");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Sửa Thông tin");

        hoTenjLable.setForeground(new java.awt.Color(0, 0, 0));
        hoTenjLable.setText("Họ tên: ");

        CCCDjLabel.setForeground(new java.awt.Color(0, 0, 0));
        CCCDjLabel.setText("CCCD:");

        gioiTinhjLabel.setForeground(new java.awt.Color(0, 0, 0));
        gioiTinhjLabel.setText("Giới tính: ");

        gioiTinhjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        ngaySinhjLabel.setForeground(new java.awt.Color(0, 0, 0));
        ngaySinhjLabel.setText("Ngày sinh: ");

        diaChijLabel.setForeground(new java.awt.Color(0, 0, 0));
        diaChijLabel.setText("Địa chỉ");

        sdtjLabel.setForeground(new java.awt.Color(0, 0, 0));
        sdtjLabel.setText("Số điện thoại: ");

        suajButton.setBackground(new java.awt.Color(153, 153, 255));
        suajButton.setText("Lưu");
        suajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suajButtonActionPerformed(evt);
            }
        });

        huyjButton.setBackground(new java.awt.Color(153, 153, 255));
        huyjButton.setText("Hủy");
        huyjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huyjButtonActionPerformed(evt);
            }
        });

        luuYjLabel.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Logout))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(106, 106, 106)
                                                .addComponent(luuYjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(223, 282, Short.MAX_VALUE)
                                        .addComponent(suajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(huyjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ngaySinhjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(diaChijLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(201, 201, 201)))
                                .addGap(0, 10, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(hoTenjLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(126, 126, 126))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(hoTenjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CCCDjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(CCCDjTextField))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(gioiTinhjComboBox, 0, 120, Short.MAX_VALUE)
                                    .addComponent(gioiTinhjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sdtjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(ngaySinhjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(diaChijTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(SDTjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logout)
                    .addComponent(jLabel8))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CCCDjLabel)
                            .addComponent(gioiTinhjLabel)))
                    .addComponent(hoTenjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoTenjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CCCDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gioiTinhjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(luuYjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ngaySinhjLabel)
                    .addComponent(diaChijLabel)
                    .addComponent(sdtjLabel))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(diaChijTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(suajButton)
                            .addComponent(huyjButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ngaySinhjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SDTjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(135, 135, 135))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        dispose();
        DangNhapFrame.main(null);
    }//GEN-LAST:event_LogoutActionPerformed

    private void HopDongButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HopDongButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HopDongButtonActionPerformed

    private void KhuyenMaiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KhuyenMaiButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KhuyenMaiButtonActionPerformed

    private void TrangBiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrangBiButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TrangBiButtonActionPerformed

    private void HoaDonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoaDonButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoaDonButtonActionPerformed

    private void ChamCongButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChamCongButtonMouseClicked
        if (TrangChuDAO.KTLoaiNV(currentUser.getMaNV()) == 1) {
            dispose();
            ChamCongFrame.main(currentUser);
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập vào chức năng này", "Thông báo", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_ChamCongButtonMouseClicked

    private void NhanVienButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhanVienButtonMouseClicked

        if (TrangChuDAO.KTLoaiNV(currentUser.getMaNV()) == 1) {
            dispose();
            NhanVienFrame.main(currentUser);
        } else { 
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập vào chức năng này", "Thông báo", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_NhanVienButtonMouseClicked

    private void suajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suajButtonActionPerformed
        // Lấy thông tin nhập liệu mới
        String hoTen = this.hoTenjTextField.getText();
        String cccd = this.CCCDjTextField.getText();
        java.sql.Date sqldate = new java.sql.Date(this.ngaySinhjComboBox.getDate().getTime());
        String gioiTinh = (String) this.gioiTinhjComboBox.getSelectedItem();
        String diaChi = this.diaChijTextField.getText();
        String sdt = this.SDTjTextField.getText();

        try {
            // Lấy thông tin cũ của khách hàng từ cơ sở dữ liệu
            KhachHangModel khCu = KhachHangDAO.getKHtheoMaKHK(maKH);

            // Kiểm tra và cập nhật thông tin mới
            if (!hoTen.isEmpty()) {
                khCu.setTenKH(hoTen);
            }
            if (!cccd.isEmpty()) {
                khCu.setCCCD(cccd);
            }
            if (sqldate != null) {
                khCu.setNgaySinh(sqldate.toLocalDate());
            }
            if (!gioiTinh.isEmpty()) {
                khCu.setGioiTinh(gioiTinh);
            }
            if (!diaChi.isEmpty()) {
                khCu.setDiaChi(diaChi);
            }
            if (!sdt.isEmpty()) {
                khCu.setSDT(sdt);
            }

            // Thực hiện cập nhật trong cơ sở dữ liệu
            if (KhachHangDAO.CapNhatKH(maKH, khCu)) {
                JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công!", "Thông báo", JOptionPane.PLAIN_MESSAGE);
//                this.maKHjTextField.setText("");
                this.hoTenjTextField.setText("");
                this.diaChijTextField.setText("");
                this.CCCDjTextField.setText("");
                this.SDTjTextField.setText("");
                this.ngaySinhjComboBox.setCalendar(null);                
            } else {
                JOptionPane.showMessageDialog(rootPane, "Cập nhật không thành công. Vui lòng thử lại!",
                        "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_suajButtonActionPerformed

    private void huyjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huyjButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        KhachHangFrame.main(currentUser);
    }//GEN-LAST:event_huyjButtonActionPerformed

    private void KhachHangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KhachHangButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        KhachHangFrame.main(currentUser);
    }//GEN-LAST:event_KhachHangButtonActionPerformed


    public static void main(NhanVienModel args, String maKH) {
        currentUser = args;
        
        currentUser.setMaNV(args.getMaNV());

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new SuaKhachHangFrame(maKH).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CCCDjLabel;
    private javax.swing.JTextField CCCDjTextField;
    private javax.swing.JButton ChamCongButton;
    private javax.swing.JButton HoaDonButton;
    private javax.swing.JButton HopDongButton;
    private javax.swing.JButton KhachHangButton;
    private javax.swing.JButton KhuyenMaiButton;
    private javax.swing.JButton Logout;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JButton NhanVienButton;
    private javax.swing.JTextField SDTjTextField;
    private javax.swing.JButton TrangBiButton;
    private javax.swing.JLabel diaChijLabel;
    private javax.swing.JTextField diaChijTextField;
    private javax.swing.JComboBox<String> gioiTinhjComboBox;
    private javax.swing.JLabel gioiTinhjLabel;
    private javax.swing.JLabel hoTenjLable;
    private javax.swing.JTextField hoTenjTextField;
    private javax.swing.JButton huyjButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel luuYjLabel;
    private de.wannawork.jcalendar.JCalendarComboBox ngaySinhjComboBox;
    private javax.swing.JLabel ngaySinhjLabel;
    private javax.swing.JLabel sdtjLabel;
    private javax.swing.JButton suajButton;
    // End of variables declaration//GEN-END:variables

}
