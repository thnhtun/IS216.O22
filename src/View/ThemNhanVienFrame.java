package View;

import DAO.KhachHangDAO;
import DAO.NhanVienDAO;
import DAO.TrangChuDAO;
import Model.KhachHangModel;
import Model.NhanVienModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ThemNhanVienFrame extends javax.swing.JFrame {
    private static NhanVienModel currentUser;
    
    private static final Logger LOGGER = Logger.getLogger(ThemNhanVienFrame.class.getName());

    public ThemNhanVienFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hoTenjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CCCDjTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        gioiTinhjComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        diaChijTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        SDTjTextField = new javax.swing.JTextField();
        themjButton = new javax.swing.JButton();
        huyjButton = new javax.swing.JButton();
        ngaySinhjComboBox = new de.wannawork.jcalendar.JCalendarComboBox();
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
        jLabel10 = new javax.swing.JLabel();
        matKhauJTextField = new javax.swing.JTextField();
        luongCBJTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        thongBaojLabel = new javax.swing.JLabel();
        loaiNVjComboBox = new javax.swing.JComboBox<>();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(24, 24, 68));
        jLabel8.setText("NHÂN VIÊN");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nhập thông tin nhân viên cần thêm");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Họ và tên");

        hoTenjTextField.setBackground(new java.awt.Color(255, 255, 255));
        hoTenjTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hoTenjTextField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CCCD");

        CCCDjTextField.setBackground(new java.awt.Color(255, 255, 255));
        CCCDjTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CCCDjTextField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Giới tính");

        gioiTinhjComboBox.setBackground(new java.awt.Color(255, 255, 255));
        gioiTinhjComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gioiTinhjComboBox.setForeground(new java.awt.Color(0, 0, 0));
        gioiTinhjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ngày sinh");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Địa chỉ");

        diaChijTextField.setBackground(new java.awt.Color(255, 255, 255));
        diaChijTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        diaChijTextField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Số điện thoại");

        SDTjTextField.setBackground(new java.awt.Color(255, 255, 255));
        SDTjTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SDTjTextField.setForeground(new java.awt.Color(0, 0, 0));

        themjButton.setBackground(new java.awt.Color(24, 24, 68));
        themjButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        themjButton.setForeground(new java.awt.Color(255, 255, 255));
        themjButton.setText("Thêm");
        themjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themjButtonActionPerformed(evt);
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

        ngaySinhjComboBox.setBackground(new java.awt.Color(255, 255, 255));
        ngaySinhjComboBox.setForeground(new java.awt.Color(0, 0, 0));

        MenuPanel.setBackground(new java.awt.Color(24, 24, 68));
        MenuPanel.setPreferredSize(new java.awt.Dimension(200, 600));

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

        KhuyenMaiLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        KhuyenMaiLb.setForeground(new java.awt.Color(255, 255, 255));
        KhuyenMaiLb.setText("Khuyến mãi");

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

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(KhachHangLb))
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
                        .addComponent(ChamCongLb))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(DangXuatLb)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(KhachHangLb)
                .addGap(23, 23, 23)
                .addComponent(NhanVienLb)
                .addGap(23, 23, 23)
                .addComponent(HopDongLb)
                .addGap(23, 23, 23)
                .addComponent(KhuyenMaiLb)
                .addGap(23, 23, 23)
                .addComponent(TrangBiLb)
                .addGap(23, 23, 23)
                .addComponent(HoaDonLb)
                .addGap(23, 23, 23)
                .addComponent(ChamCongLb)
                .addGap(53, 53, 53)
                .addComponent(DangXuatLb))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Loại NV");

        matKhauJTextField.setBackground(new java.awt.Color(255, 255, 255));
        matKhauJTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        matKhauJTextField.setForeground(new java.awt.Color(0, 0, 0));

        luongCBJTextField.setBackground(new java.awt.Color(255, 255, 255));
        luongCBJTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        luongCBJTextField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Nhập mật khẩu ban đầu ");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Lương cơ bản");

        thongBaojLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        thongBaojLabel.setForeground(new java.awt.Color(0, 0, 0));

        loaiNVjComboBox.setBackground(new java.awt.Color(255, 255, 255));
        loaiNVjComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loaiNVjComboBox.setForeground(new java.awt.Color(0, 0, 0));
        loaiNVjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản lý", "Lễ tân", "Tạp Vụ" }));
        loaiNVjComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                loaiNVjComboBoxFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hoTenjTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ngaySinhjComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loaiNVjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(CCCDjTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(gioiTinhjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(themjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(huyjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(diaChijTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(70, 70, 70)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(119, 119, 119))
                                        .addComponent(SDTjTextField)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(luongCBJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addGap(112, 112, 112))))))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thongBaojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(matKhauJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(247, 247, 247))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hoTenjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CCCDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gioiTinhjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ngaySinhjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diaChijTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SDTjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matKhauJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(luongCBJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loaiNVjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thongBaojLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(huyjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void themjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themjButtonActionPerformed
        
        // Lầy dữ liệu từ các thanh JTextField
        String hoTen = this.hoTenjTextField.getText();
        
        
        String cccd = this.CCCDjTextField.getText();
        java.sql.Date sqldate = new java.sql.Date(this.ngaySinhjComboBox.getDate().getTime());
        String gioiTinh = (String) this.gioiTinhjComboBox.getSelectedItem();
        String diaChi = this.diaChijTextField.getText();
        String sdt = this.SDTjTextField.getText();
        String loainv = (String) this.loaiNVjComboBox.getSelectedItem();
        String matkhau = this.matKhauJTextField.getText();
        String lcb = this.luongCBJTextField.getText();
        
        long luongcb = Long.parseLong(lcb);

        
        NhanVienModel nv = new NhanVienModel(hoTen, cccd, sqldate.toLocalDate(), gioiTinh, diaChi, sdt, loainv, "", matkhau, luongcb);
        NhanVienDAO nvDAO = new NhanVienDAO();
        
        try {
            if (nvDAO.ThemNV(nv)) {
                JOptionPane.showMessageDialog(rootPane, "Thêm thành công!", "Thông báo", JOptionPane.PLAIN_MESSAGE);
                dispose();
                NhanVienFrame.main(currentUser);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Thêm không thành công. Vui lòng thử lại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
        this.hoTenjTextField.setText("");
        this.CCCDjTextField.setText("");
        this.diaChijTextField.setText("");
        this.SDTjTextField.setText("");
        this.ngaySinhjComboBox.setCalendar(null);
        this.matKhauJTextField.setText("");
        this.luongCBJTextField.setText("");
    }//GEN-LAST:event_themjButtonActionPerformed

    private void huyjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huyjButtonActionPerformed
        dispose();
        NhanVienFrame.main(currentUser);
    }//GEN-LAST:event_huyjButtonActionPerformed

    private void DangXuatLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangXuatLbMouseClicked
        int a = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?", "Đăng xuất", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            dispose();
            DangNhapFrame.main(null);
        }
    }//GEN-LAST:event_DangXuatLbMouseClicked

    private void KhachHangLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhachHangLbMouseClicked
        dispose();
        KhachHangFrame.main(currentUser);
    }//GEN-LAST:event_KhachHangLbMouseClicked

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

    private void loaiNVjComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loaiNVjComboBoxFocusLost
        // TODO add your handling code here:
        if ("Tạp Vụ".equals((String) this.loaiNVjComboBox.getSelectedItem())) {
            thongBaojLabel.setText("*Không cần nhập mật khẩu*");
        } else {
            thongBaojLabel.setText("");
        }
    }//GEN-LAST:event_loaiNVjComboBoxFocusLost


    public static void main(NhanVienModel args) {
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
            new ThemNhanVienFrame().setVisible(true);
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CCCDjTextField;
    private javax.swing.JLabel ChamCongLb;
    private javax.swing.JLabel DangXuatLb;
    private javax.swing.JLabel HoaDonLb;
    private javax.swing.JLabel HopDongLb;
    private javax.swing.JLabel KhachHangLb;
    private javax.swing.JLabel KhuyenMaiLb;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JLabel NhanVienLb;
    private javax.swing.JTextField SDTjTextField;
    private javax.swing.JLabel TrangBiLb;
    private javax.swing.JTextField diaChijTextField;
    private javax.swing.JComboBox<String> gioiTinhjComboBox;
    private javax.swing.JTextField hoTenjTextField;
    private javax.swing.JButton huyjButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> loaiNVjComboBox;
    private javax.swing.JTextField luongCBJTextField;
    private javax.swing.JTextField matKhauJTextField;
    private de.wannawork.jcalendar.JCalendarComboBox ngaySinhjComboBox;
    private javax.swing.JButton themjButton;
    private javax.swing.JLabel thongBaojLabel;
    // End of variables declaration//GEN-END:variables

}
