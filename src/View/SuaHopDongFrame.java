
package View;

import DAO.HopDongDAO;
import DAO.KhachHangDAO;
import DAO.TrangChuDAO;
import Model.HopDongModel;
import Model.KhachHangModel;
import Model.NhanVienModel;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SuaHopDongFrame extends javax.swing.JFrame {
    private static NhanVienModel currentUser;
    private int maHopDong; // Biến cục bộ để lưu trữ giá trị mã hợp đồng
    private HopDongModel hopDong; // Biến để lưu trữ thông tin hợp đồng đặt phòng

    // Constructor nhận giá trị maKH
    public SuaHopDongFrame(int maHopDong) {
        
        this.setLocationRelativeTo(null);
        
        this.maHopDong = maHopDong; // Lưu giá trị maKH vào biến cục bộ
        
        // Gọi phương thức khởi tạo giao diện
        initComponents();

        // Lấy thông tin khách hàng từ cơ sở dữ liệu
        try {
            hopDong = HopDongDAO.getHDtheoMaHopDong(maHopDong);
            // Sử dụng thông tin kh để cập nhật giao diện
            if (hopDong != null) {
                
                tinhTrangHDjComboBox.setSelectedItem(hopDong.getTinhTrangHD());
                slNguoiLonjTextField.setText(String.valueOf(hopDong.getSoLuongNguoiLon()));
                slTreEmjTextField.setText(String.valueOf(hopDong.getSoLuongTreEm()));
                

                // chuyển đổi sang định dạng LocalDateTime
                Date ngayLHD = convertToDate(hopDong.getNgayLapHopDong());
                //ngayLapHopDongjComboBox.setDate(ngayLHD);
                               
                //ngaySinhjLabel.setText(("Ngày sinh: " + kh.getNgaySinh().toString()).formatted(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                
                //triGiaHDjTextField.setText(String.valueOf(hopDong.getTriGiaHopDong()));
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
    
    private static final Logger LOGGER = Logger.getLogger(SuaHopDongFrame.class.getName());
 
    
    public static Date convertToDate(LocalDateTime localDateTime) {
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        Instant instant = zonedDateTime.toInstant();
        return Date.from(instant);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        hoTenjLable = new javax.swing.JLabel();
        slNguoiLonjTextField = new javax.swing.JTextField();
        CCCDjLabel = new javax.swing.JLabel();
        slTreEmjTextField = new javax.swing.JTextField();
        gioiTinhjLabel = new javax.swing.JLabel();
        tinhTrangHDjComboBox = new javax.swing.JComboBox<>();
        suajButton = new javax.swing.JButton();
        huyjButton = new javax.swing.JButton();
        MenuPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        KhachHangLb = new javax.swing.JLabel();
        NhanVienLb = new javax.swing.JLabel();
        HopDongLb = new javax.swing.JLabel();
        KhuyenMaiLb = new javax.swing.JLabel();
        TrangBiLb = new javax.swing.JLabel();
        HoaDonLb = new javax.swing.JLabel();
        ChamCongLb = new javax.swing.JLabel();
        DangXuatLb = new javax.swing.JLabel();
        luongLb = new javax.swing.JLabel();
        phongLb = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(24, 24, 68));
        jLabel8.setText("HỢP ĐỒNG");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nhập thông tin cần sửa");

        hoTenjLable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hoTenjLable.setForeground(new java.awt.Color(0, 0, 0));
        hoTenjLable.setText("Số lượng người lớn");

        slNguoiLonjTextField.setBackground(new java.awt.Color(255, 255, 255));
        slNguoiLonjTextField.setForeground(new java.awt.Color(0, 0, 0));
        slNguoiLonjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slNguoiLonjTextFieldActionPerformed(evt);
            }
        });

        CCCDjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CCCDjLabel.setForeground(new java.awt.Color(0, 0, 0));
        CCCDjLabel.setText("Số lượng trẻ em");

        slTreEmjTextField.setBackground(new java.awt.Color(255, 255, 255));
        slTreEmjTextField.setForeground(new java.awt.Color(0, 0, 0));

        gioiTinhjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gioiTinhjLabel.setForeground(new java.awt.Color(0, 0, 0));
        gioiTinhjLabel.setText("Tình trạng Hợp đồng");

        tinhTrangHDjComboBox.setBackground(new java.awt.Color(255, 255, 255));
        tinhTrangHDjComboBox.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tinhTrangHDjComboBox.setForeground(new java.awt.Color(0, 0, 0));
        tinhTrangHDjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đã xác nhận", "Chưa xác nhận" }));

        suajButton.setBackground(new java.awt.Color(24, 24, 68));
        suajButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        suajButton.setForeground(new java.awt.Color(255, 255, 255));
        suajButton.setText("Lưu");
        suajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suajButtonActionPerformed(evt);
            }
        });

        huyjButton.setBackground(new java.awt.Color(24, 24, 68));
        huyjButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        huyjButton.setForeground(new java.awt.Color(255, 255, 255));
        huyjButton.setText("Hủy");
        huyjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huyjButtonActionPerformed(evt);
            }
        });

        MenuPanel.setBackground(new java.awt.Color(24, 24, 68));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(220, 220, 46));
        jLabel2.setText("BRIGHT STAR");

        KhachHangLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        KhachHangLb.setForeground(new java.awt.Color(255, 255, 255));
        KhachHangLb.setText("Khách hàng");
        KhachHangLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KhachHangLbMouseClicked(evt);
            }
        });

        NhanVienLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        NhanVienLb.setForeground(new java.awt.Color(255, 255, 255));
        NhanVienLb.setText("Nhân viên");
        NhanVienLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhanVienLbMouseClicked(evt);
            }
        });

        HopDongLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        HopDongLb.setForeground(new java.awt.Color(255, 255, 255));
        HopDongLb.setText("Hợp đồng");
        HopDongLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HopDongLbMouseClicked(evt);
            }
        });

        KhuyenMaiLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        KhuyenMaiLb.setForeground(new java.awt.Color(255, 255, 255));
        KhuyenMaiLb.setText("Khuyến mãi");
        KhuyenMaiLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KhuyenMaiLbMouseClicked(evt);
            }
        });

        TrangBiLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        TrangBiLb.setForeground(new java.awt.Color(255, 255, 255));
        TrangBiLb.setText("Trang bị");

        HoaDonLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        HoaDonLb.setForeground(new java.awt.Color(255, 255, 255));
        HoaDonLb.setText("Hoá đơn");

        ChamCongLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        ChamCongLb.setForeground(new java.awt.Color(255, 255, 255));
        ChamCongLb.setText("Chấm công");
        ChamCongLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChamCongLbMouseClicked(evt);
            }
        });

        DangXuatLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        DangXuatLb.setForeground(new java.awt.Color(255, 255, 255));
        DangXuatLb.setText("Đăng xuất");
        DangXuatLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DangXuatLbMouseClicked(evt);
            }
        });

        luongLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        luongLb.setForeground(new java.awt.Color(255, 255, 255));
        luongLb.setText("Lương");
        luongLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                luongLbMouseClicked(evt);
            }
        });

        phongLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        phongLb.setForeground(new java.awt.Color(255, 255, 255));
        phongLb.setText("Phòng");
        phongLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phongLbMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(NhanVienLb))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(HopDongLb))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(KhuyenMaiLb))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(TrangBiLb))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(HoaDonLb))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(DangXuatLb))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(luongLb)
                            .addComponent(ChamCongLb)))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phongLb)
                            .addComponent(KhachHangLb))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(phongLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(KhachHangLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NhanVienLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HopDongLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(KhuyenMaiLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TrangBiLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HoaDonLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChamCongLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(luongLb)
                .addGap(30, 30, 30)
                .addComponent(DangXuatLb))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(gioiTinhjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                        .addComponent(tinhTrangHDjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(40, 40, 40)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(slNguoiLonjTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hoTenjLable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(40, 40, 40)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CCCDjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(slTreEmjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(suajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(huyjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CCCDjLabel)
                    .addComponent(hoTenjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gioiTinhjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tinhTrangHDjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slNguoiLonjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slTreEmjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(huyjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addSVG(){
         
    }
    
    private void suajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suajButtonActionPerformed
        // Lấy thông tin nhập liệu mới
        String slNL = this.slNguoiLonjTextField.getText();
        int slNguoiLon = Integer.parseInt(slNL);
        String slTE = this.slTreEmjTextField.getText();
        int slTreEm = Integer.parseInt(slTE);
        
        String tinhTrangHD = (String) this.tinhTrangHDjComboBox.getSelectedItem();

        

        try {
            // Lấy thông tin cũ của hợp đồng từ cơ sở dữ liệu
            HopDongModel hopDongCu = HopDongDAO.getHDtheoMaHopDong(maHopDong);

            hopDongCu.setSoLuongTreEm(slTreEm);
            hopDongCu.setTinhTrangHD(tinhTrangHD);
            hopDongCu.setSoLuongNguoiLon(slNguoiLon);
 

            // Thực hiện cập nhật trong cơ sở dữ liệu
            if (HopDongDAO.CapNhatHopDong(maHopDong, hopDongCu)) {
                JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công!", "Thông báo", JOptionPane.PLAIN_MESSAGE);
                this.slNguoiLonjTextField.setText("");
                this.slTreEmjTextField.setText("");
                dispose();
                HopDongFrame.main(currentUser);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Cập nhật không thành công. Vui lòng thử lại!",
                        "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // In ra thông tin lỗi chi tiết
            JOptionPane.showMessageDialog(rootPane, "Lỗi khi thực hiện truy vấn SQL!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Lỗi: Tham chiếu null!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Lỗi không xác định!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_suajButtonActionPerformed

    private void huyjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huyjButtonActionPerformed
        dispose();
        HopDongFrame.main(currentUser);
    }//GEN-LAST:event_huyjButtonActionPerformed

    private void KhachHangLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhachHangLbMouseClicked
        dispose();
        KhachHangFrame.main(currentUser);
    }//GEN-LAST:event_KhachHangLbMouseClicked

    private void DangXuatLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangXuatLbMouseClicked
        int a = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?", "Đăng xuất", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            dispose();
            DangNhapFrame.main(null);
        }
    }//GEN-LAST:event_DangXuatLbMouseClicked

    private void NhanVienLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhanVienLbMouseClicked
        if (TrangChuDAO.KTLoaiNV(currentUser.getMaNV()) == 1) {
            dispose();
            NhanVienFrame.main(currentUser);
        } else { 
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập vào chức năng này", "Thông báo", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_NhanVienLbMouseClicked

    private void ChamCongLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChamCongLbMouseClicked
        if (TrangChuDAO.KTLoaiNV(currentUser.getMaNV()) == 1) {
            dispose();
            ChamCongFrame.main(currentUser);
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập vào chức năng này", "Thông báo", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_ChamCongLbMouseClicked

    private void luongLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_luongLbMouseClicked
        // TODO add your handling code here:
        if (TrangChuDAO.KTLoaiNV(currentUser.getMaNV()) == 1) {
            dispose();
            LuongFrame.main(currentUser);
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập vào chức năng này", "Thông báo", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_luongLbMouseClicked

    private void phongLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phongLbMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_phongLbMouseClicked

    private void slNguoiLonjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slNguoiLonjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slNguoiLonjTextFieldActionPerformed

    private void HopDongLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HopDongLbMouseClicked
        // TODO add your handling code here:
        dispose();
        HopDongFrame.main(currentUser);
    }//GEN-LAST:event_HopDongLbMouseClicked

    private void KhuyenMaiLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhuyenMaiLbMouseClicked
        // TODO add your handling code here:
        if (TrangChuDAO.KTLoaiNV(currentUser.getMaNV()) == 1) {
            dispose();
            KhuyenMaiFrame.main(currentUser);
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập vào chức năng này", "Thông báo", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_KhuyenMaiLbMouseClicked

    public static void main(NhanVienModel args, int maHopDong) {
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
            SuaHopDongFrame suaKhachHangFrame = new SuaHopDongFrame(maHopDong);
            suaKhachHangFrame.setLocationRelativeTo(null); // Đặt frame ở trung tâm màn hình desktop
            suaKhachHangFrame.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CCCDjLabel;
    private javax.swing.JLabel ChamCongLb;
    private javax.swing.JLabel DangXuatLb;
    private javax.swing.JLabel HoaDonLb;
    private javax.swing.JLabel HopDongLb;
    private javax.swing.JLabel KhachHangLb;
    private javax.swing.JLabel KhuyenMaiLb;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JLabel NhanVienLb;
    private javax.swing.JLabel TrangBiLb;
    private javax.swing.JLabel gioiTinhjLabel;
    private javax.swing.JLabel hoTenjLable;
    private javax.swing.JButton huyjButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel luongLb;
    private javax.swing.JLabel phongLb;
    private javax.swing.JTextField slNguoiLonjTextField;
    private javax.swing.JTextField slTreEmjTextField;
    private javax.swing.JButton suajButton;
    private javax.swing.JComboBox<String> tinhTrangHDjComboBox;
    // End of variables declaration//GEN-END:variables

}
