
package View;

import DAO.KhachHangDAO;
import DAO.NhanVienDAO;
import DAO.TrangChuDAO;
import Model.KhachHangModel;
import Model.NhanVienModel;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SuaNhanVienFrame extends javax.swing.JFrame {
    private static NhanVienModel currentUser;
    private int maNV; // Biến cục bộ để lưu trữ giá trị maNV
    private NhanVienModel nv; // Biến để lưu trữ thông tin nhân viên đó

    // Constructor nhận giá trị maNV
    public SuaNhanVienFrame(int maNV) {
        
        this.setLocationRelativeTo(null);
        
        this.maNV = maNV; // Lưu giá trị maNV vào biến cục bộ
        
        // Gọi phương thức khởi tạo giao diện
        initComponents();

        // Lấy thông tin nhân viên từ cơ sở dữ liệu
        try {
            nv = NhanVienDAO.getNVtheoMaNV(maNV);
            // Sử dụng thông tin nv để cập nhật giao diện
            if (nv != null) {
                hoTenjLable.setText("Tên NV: " + nv.getTenNV());
                CCCDjLabel.setText("CCCD: " + nv.getCCCD());
                // chuyển đổi sang định dạng ngày tháng năm
                ngaySinhjLabel.setText(("Ngày sinh: " + nv.getNgaySinh().toString()).formatted(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                gioiTinhjLabel.setText("Giới tính" + nv.getGioiTinh());
                diaChijLabel.setText("Địa chỉ: " + nv.getDiaChi());
                sdtjLabel.setText("SĐT" + nv.getSDT());
                matKhaujLabel.setText("Mật khẩu: " + nv.getMatKhau());
                luongCBjLabel.setText("Lương CB: " + nv.getLuongCB());
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin nhân viên!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi lấy thông tin nhân viên!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private DefaultTableModel defaultTableModel = new DefaultTableModel(){
            public boolean isCellEdittable(int row, int column){
                return false;
            }
        };
    
    private static final Logger LOGGER = Logger.getLogger(SuaNhanVienFrame.class.getName());
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
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
        matKhauJTextField = new javax.swing.JTextField();
        matKhaujLabel = new javax.swing.JLabel();
        luongCBjLabel = new javax.swing.JLabel();
        luongCBJTextField = new javax.swing.JTextField();

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
        jLabel1.setText("Nhập thông tin cần sửa");

        hoTenjLable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hoTenjLable.setForeground(new java.awt.Color(0, 0, 0));
        hoTenjLable.setText("Họ và tên");

        hoTenjTextField.setBackground(new java.awt.Color(255, 255, 255));
        hoTenjTextField.setForeground(new java.awt.Color(0, 0, 0));

        CCCDjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CCCDjLabel.setForeground(new java.awt.Color(0, 0, 0));
        CCCDjLabel.setText("CCCD");

        CCCDjTextField.setBackground(new java.awt.Color(255, 255, 255));
        CCCDjTextField.setForeground(new java.awt.Color(0, 0, 0));

        gioiTinhjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gioiTinhjLabel.setForeground(new java.awt.Color(0, 0, 0));
        gioiTinhjLabel.setText("Giới tính");

        gioiTinhjComboBox.setBackground(new java.awt.Color(255, 255, 255));
        gioiTinhjComboBox.setForeground(new java.awt.Color(0, 0, 0));
        gioiTinhjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        ngaySinhjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ngaySinhjLabel.setForeground(new java.awt.Color(0, 0, 0));
        ngaySinhjLabel.setText("Ngày sinh");

        diaChijLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        diaChijLabel.setForeground(new java.awt.Color(0, 0, 0));
        diaChijLabel.setText("Địa chỉ");

        diaChijTextField.setBackground(new java.awt.Color(255, 255, 255));
        diaChijTextField.setForeground(new java.awt.Color(0, 0, 0));

        sdtjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sdtjLabel.setForeground(new java.awt.Color(0, 0, 0));
        sdtjLabel.setText("Số điện thoại");

        SDTjTextField.setBackground(new java.awt.Color(255, 255, 255));
        SDTjTextField.setForeground(new java.awt.Color(0, 0, 0));

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

        ngaySinhjComboBox.setBackground(new java.awt.Color(255, 255, 255));
        ngaySinhjComboBox.setForeground(new java.awt.Color(0, 0, 0));

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

        matKhauJTextField.setBackground(new java.awt.Color(255, 255, 255));
        matKhauJTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        matKhauJTextField.setForeground(new java.awt.Color(0, 0, 0));

        matKhaujLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        matKhaujLabel.setForeground(new java.awt.Color(0, 0, 0));
        matKhaujLabel.setText("Mật khẩu");

        luongCBjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        luongCBjLabel.setForeground(new java.awt.Color(0, 0, 0));
        luongCBjLabel.setText("Lương CB");

        luongCBJTextField.setBackground(new java.awt.Color(255, 255, 255));
        luongCBJTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        luongCBJTextField.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hoTenjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(hoTenjLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CCCDjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(CCCDjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(gioiTinhjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gioiTinhjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(435, 435, 435))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(suajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(huyjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ngaySinhjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(matKhaujLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(matKhauJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                .addComponent(ngaySinhjComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(diaChijTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(diaChijLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(19, 19, 19)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(SDTjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(sdtjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(luongCBJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(luongCBjLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))))
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hoTenjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CCCDjLabel)
                            .addComponent(hoTenjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gioiTinhjLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CCCDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gioiTinhjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ngaySinhjLabel)
                    .addComponent(diaChijLabel)
                    .addComponent(sdtjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ngaySinhjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(diaChijTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SDTjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matKhaujLabel)
                    .addComponent(luongCBjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matKhauJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(luongCBJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        String hoTen = this.hoTenjTextField.getText();
        String cccd = this.CCCDjTextField.getText();
        java.sql.Date sqldate = new java.sql.Date(this.ngaySinhjComboBox.getDate().getTime());
        String gioiTinh = (String) this.gioiTinhjComboBox.getSelectedItem();
        String diaChi = this.diaChijTextField.getText();
        String sdt = this.SDTjTextField.getText();
        String matkhau = this.matKhauJTextField.getText();
        String lcb = this.luongCBJTextField.getText();
        
        try {
            // Lấy thông tin cũ của nhân viên từ cơ sở dữ liệu
            NhanVienModel nvCu = NhanVienDAO.getNVtheoMaNV(maNV);

            // Kiểm tra và cập nhật thông tin mới
            if (!hoTen.isEmpty()) {
                nvCu.setTenNV(hoTen);
            }
            if (!cccd.isEmpty()) {
                nvCu.setCCCD(cccd);
            }
            if (sqldate != null) {
                nvCu.setNgaySinh(sqldate.toLocalDate());
            }
            if (!gioiTinh.isEmpty()) {
                nvCu.setGioiTinh(gioiTinh);
            }
            if (!diaChi.isEmpty()) {
                nvCu.setDiaChi(diaChi);
            }
            if (!sdt.isEmpty()) {
                nvCu.setSDT(sdt);
            }
            if (!matkhau.isEmpty()) {
                nvCu.setMatKhau(matkhau);
            }
            if (!lcb.isEmpty()) {
                long luongcb = Long.parseLong(lcb);
                nvCu.setLuongCB(luongcb);
            }

            // Thực hiện cập nhật trong cơ sở dữ liệu
            if (NhanVienDAO.CapNhatNV(maNV, nvCu)) {
                JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công!", "Thông báo", JOptionPane.PLAIN_MESSAGE);
//                this.maKHjTextField.setText("");
                this.hoTenjTextField.setText("");
                this.diaChijTextField.setText("");
                this.CCCDjTextField.setText("");
                this.SDTjTextField.setText("");
                this.ngaySinhjComboBox.setCalendar(null);
                this.matKhauJTextField.setText("");  
                this.luongCBJTextField.setText("");
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
        dispose();
        NhanVienFrame.main(currentUser);
    }//GEN-LAST:event_suajButtonActionPerformed

    private void huyjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huyjButtonActionPerformed
        dispose();
        NhanVienFrame.main(currentUser);
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

    public static void main(NhanVienModel args, int maNV) {
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
            SuaNhanVienFrame suaKhachHangFrame = new SuaNhanVienFrame(maNV);
            suaKhachHangFrame.setLocationRelativeTo(null); // Đặt frame ở trung tâm màn hình desktop
            suaKhachHangFrame.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CCCDjLabel;
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
    private javax.swing.JLabel diaChijLabel;
    private javax.swing.JTextField diaChijTextField;
    private javax.swing.JComboBox<String> gioiTinhjComboBox;
    private javax.swing.JLabel gioiTinhjLabel;
    private javax.swing.JLabel hoTenjLable;
    private javax.swing.JTextField hoTenjTextField;
    private javax.swing.JButton huyjButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField luongCBJTextField;
    private javax.swing.JLabel luongCBjLabel;
    private javax.swing.JTextField matKhauJTextField;
    private javax.swing.JLabel matKhaujLabel;
    private de.wannawork.jcalendar.JCalendarComboBox ngaySinhjComboBox;
    private javax.swing.JLabel ngaySinhjLabel;
    private javax.swing.JLabel sdtjLabel;
    private javax.swing.JButton suajButton;
    // End of variables declaration//GEN-END:variables

}
