
package View;

import DAO.KhachHangDAO;
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


public class SuaKhachHangFrame extends javax.swing.JFrame {
    private static NhanVienModel currentUser;
    private int maKH; // Biến cục bộ để lưu trữ giá trị maKH
    private KhachHangModel kh; // Biến để lưu trữ thông tin khách hàng

    // Constructor nhận giá trị maKH
    public SuaKhachHangFrame(int maKH) {
        addSVG(); // Thêm ảnh SVG vào Frame 
        
        this.setLocationRelativeTo(null);
        
        this.maKH = maKH; // Lưu giá trị maKH vào biến cục bộ
        
        // Gọi phương thức khởi tạo giao diện
        initComponents();

        // Lấy thông tin khách hàng từ cơ sở dữ liệu
        try {
            kh = KhachHangDAO.getKHtheoMaKHK(maKH);
            // Sử dụng thông tin kh để cập nhật giao diện
            if (kh != null) {
                hoTenjLable.setText("Tên KH: " + kh.getTenKH());
                CCCDjLabel.setText("CCCD: " + kh.getCCCD());
                // chuyển đổi sang định dạng ngày tháng năm
                ngaySinhjLabel.setText(("Ngày sinh: " + kh.getNgaySinh().toString()).formatted(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                gioiTinhjLabel.setText("Giới tính" + kh.getGioiTinh());
                diaChijLabel.setText("Địa chỉ: " + kh.getDiaChi());
                sdtjLabel.setText("SĐT" + kh.getSDT());
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
        LogoSvg = new Image.SVGImage();
        KhachHangSvg = new Image.SVGImage();
        NhanVienSvg = new Image.SVGImage();
        HopDongSvg = new Image.SVGImage();
        KhuyenMaiSvg = new Image.SVGImage();
        TrangBiSvg = new Image.SVGImage();
        HoaDonSvg = new Image.SVGImage();
        ChamCongSvg = new Image.SVGImage();
        DangXuatSvg = new Image.SVGImage();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(24, 24, 68));
        jLabel8.setText("KHÁCH HÀNG");

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
        CCCDjLabel.setText("ID/CCCD");

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
        MenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(220, 220, 46));
        jLabel2.setText("BRIGHT STAR");
        MenuPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 120, -1, -1));

        KhachHangLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        KhachHangLb.setForeground(new java.awt.Color(255, 255, 255));
        KhachHangLb.setText("Khách hàng");
        KhachHangLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KhachHangLbMouseClicked(evt);
            }
        });
        MenuPanel.add(KhachHangLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        NhanVienLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        NhanVienLb.setForeground(new java.awt.Color(255, 255, 255));
        NhanVienLb.setText("Nhân viên");
        NhanVienLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhanVienLbMouseClicked(evt);
            }
        });
        MenuPanel.add(NhanVienLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        HopDongLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        HopDongLb.setForeground(new java.awt.Color(255, 255, 255));
        HopDongLb.setText("Hợp đồng");
        MenuPanel.add(HopDongLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        KhuyenMaiLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        KhuyenMaiLb.setForeground(new java.awt.Color(255, 255, 255));
        KhuyenMaiLb.setText("Khuyến mãi");
        MenuPanel.add(KhuyenMaiLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        TrangBiLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        TrangBiLb.setForeground(new java.awt.Color(255, 255, 255));
        TrangBiLb.setText("Trang bị");
        MenuPanel.add(TrangBiLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        HoaDonLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        HoaDonLb.setForeground(new java.awt.Color(255, 255, 255));
        HoaDonLb.setText("Hoá đơn");
        MenuPanel.add(HoaDonLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        ChamCongLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        ChamCongLb.setForeground(new java.awt.Color(255, 255, 255));
        ChamCongLb.setText("Chấm công");
        ChamCongLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChamCongLbMouseClicked(evt);
            }
        });
        MenuPanel.add(ChamCongLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        DangXuatLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        DangXuatLb.setForeground(new java.awt.Color(255, 255, 255));
        DangXuatLb.setText("Đăng xuất");
        DangXuatLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DangXuatLbMouseClicked(evt);
            }
        });
        MenuPanel.add(DangXuatLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));
        MenuPanel.add(LogoSvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 15, 90, 90));
        MenuPanel.add(KhachHangSvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 30, 30));
        MenuPanel.add(NhanVienSvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 30, 30));
        MenuPanel.add(HopDongSvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 30, 30));
        MenuPanel.add(KhuyenMaiSvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 30, 30));
        MenuPanel.add(TrangBiSvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 30, 30));
        MenuPanel.add(HoaDonSvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 30, 30));
        MenuPanel.add(ChamCongSvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 30, 30));
        MenuPanel.add(DangXuatSvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 30, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hoTenjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hoTenjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CCCDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CCCDjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gioiTinhjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gioiTinhjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(435, 435, 435))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(suajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(huyjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(ngaySinhjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ngaySinhjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(diaChijLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diaChijTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sdtjLabel)
                                    .addComponent(SDTjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hoTenjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(hoTenjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CCCDjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CCCDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(gioiTinhjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gioiTinhjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(huyjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addSVG(){
         LogoSvg.setSVGImage("image/logo.svg", 90, 90);
         KhachHangSvg.setSVGImage("image/khachhang.svg", 30, 30);
         NhanVienSvg.setSVGImage("image/nhanvien.svg", 30, 30);
         HopDongSvg.setSVGImage("image/hopdong.svg", 30, 30);
         KhuyenMaiSvg.setSVGImage("image/khuyenmai.svg", 30, 30);
         TrangBiSvg.setSVGImage("image/trangbi.svg", 30, 30);
         HoaDonSvg.setSVGImage("image/hoadon.svg", 30, 30);
         ChamCongSvg.setSVGImage("image/chamcong.svg", 30, 30);
         DangXuatSvg.setSVGImage("image/dangxuat.svg", 30, 30);
         
         KhachHangSvg.setWhiteColor();
         NhanVienSvg.setWhiteColor();
         HopDongSvg.setWhiteColor();
         KhuyenMaiSvg.setWhiteColor();
         TrangBiSvg.setWhiteColor();
         HoaDonSvg.setWhiteColor();
         ChamCongSvg.setWhiteColor();
         DangXuatSvg.setWhiteColor();
    }
    
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
        KhachHangFrame.main(currentUser);
    }//GEN-LAST:event_suajButtonActionPerformed

    private void huyjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huyjButtonActionPerformed
        dispose();
        KhachHangFrame.main(currentUser);
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

    public static void main(NhanVienModel args, int maKH) {
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
            SuaKhachHangFrame suaKhachHangFrame = new SuaKhachHangFrame(maKH);
            suaKhachHangFrame.setLocationRelativeTo(null); // Đặt frame ở trung tâm màn hình desktop
            suaKhachHangFrame.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CCCDjLabel;
    private javax.swing.JTextField CCCDjTextField;
    private javax.swing.JLabel ChamCongLb;
    private Image.SVGImage ChamCongSvg;
    private javax.swing.JLabel DangXuatLb;
    private Image.SVGImage DangXuatSvg;
    private javax.swing.JLabel HoaDonLb;
    private Image.SVGImage HoaDonSvg;
    private javax.swing.JLabel HopDongLb;
    private Image.SVGImage HopDongSvg;
    private javax.swing.JLabel KhachHangLb;
    private Image.SVGImage KhachHangSvg;
    private javax.swing.JLabel KhuyenMaiLb;
    private Image.SVGImage KhuyenMaiSvg;
    private Image.SVGImage LogoSvg;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JLabel NhanVienLb;
    private Image.SVGImage NhanVienSvg;
    private javax.swing.JTextField SDTjTextField;
    private javax.swing.JLabel TrangBiLb;
    private Image.SVGImage TrangBiSvg;
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
    private de.wannawork.jcalendar.JCalendarComboBox ngaySinhjComboBox;
    private javax.swing.JLabel ngaySinhjLabel;
    private javax.swing.JLabel sdtjLabel;
    private javax.swing.JButton suajButton;
    // End of variables declaration//GEN-END:variables

}
