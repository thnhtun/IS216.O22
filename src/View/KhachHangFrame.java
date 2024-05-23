
package View;

import DAO.KhachHangDAO;
import DAO.TrangChuDAO;
import Model.KhachHangModel;
import Model.NhanVienModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class KhachHangFrame extends javax.swing.JFrame {
    
    private static NhanVienModel currentUser;
    
    private DefaultTableModel defaultTableModel = new DefaultTableModel(){
            public boolean isCellEdittable(int row, int column){
                return false;
            }
        };
    
    int maKH;
    ArrayList<KhachHangModel> DS_KH;
    int current = 0;

    public KhachHangFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
     
        addSVG(); // Thêm ảnh SVG vào Frame
        khoiTaoBang(); // Gọi phương thức khởi tạo bảng
        inDanhSach(); // Gọi phương thức in danh sách ban đầu nếu cần thiết
    }

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
    
    public void khoiTaoBang() {
        defaultTableModel = new DefaultTableModel();
    
        defaultTableModel.addColumn("Mã KH");
        defaultTableModel.addColumn("Họ tên");
        defaultTableModel.addColumn("CCCD");
        defaultTableModel.addColumn("Ngày sinh");
        defaultTableModel.addColumn("Giới tính");
        defaultTableModel.addColumn("Địa chỉ");
        defaultTableModel.addColumn("SĐT");
        defaultTableModel.addColumn("SHĐ");
    
        danhSachKHTable.setModel(defaultTableModel);
    }


    public void inDanhSach() {
        // Tạo đối tượng danh sách khách hàng
        ArrayList<KhachHangModel> DS_KH = KhachHangDAO.getDSKhachHang();

        // Xóa tất cả các hàng hiện có trong bảng
        defaultTableModel.setRowCount(0);

        // Thêm dữ liệu vào bảng
        for (KhachHangModel khachHang : DS_KH) {
            defaultTableModel.addRow(new Object[]{
                khachHang.getMaKH(), khachHang.getTenKH(), khachHang.getCCCD(),
                khachHang.getNgaySinh(), khachHang.getGioiTinh(), khachHang.getDiaChi(),
                khachHang.getSDT(), khachHang.getSoHopDong()
            });
        }
    }

    
    public void TraCuuKH() {
        // Lấy tùy chọn tìm kiếm và đầu vào từ người dùng
        String option = (String) this.timTheoComboBox.getSelectedItem();
        String input = this.nhapjTextField.getText().toLowerCase();

        // Xóa tất cả các hàng trong bảng
        defaultTableModel.setRowCount(0);

        // Tạo danh sách khách hàng để chứa kết quả tìm kiếm
        ArrayList<KhachHangModel> DS_KH = KhachHangDAO.TimKH(option, input);

        // Thêm kết quả tìm kiếm vào bảng
        for (KhachHangModel khachHang : DS_KH) {
            defaultTableModel.addRow(new Object[]{
                khachHang.getMaKH(), khachHang.getTenKH(), khachHang.getCCCD(),
                khachHang.getNgaySinh(), khachHang.getGioiTinh(), khachHang.getDiaChi(),
                khachHang.getSDT(), khachHang.getSoHopDong()
            });
        }

        // Hiển thị thông báo nếu không tìm thấy kết quả
        if (DS_KH.size() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Thông tin không tồn tại. Vui lòng thử lại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        danhSachKHTable = new javax.swing.JTable();
        timTheoComboBox = new javax.swing.JComboBox<>();
        TieudeTK = new javax.swing.JLabel();
        nhapjTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        traCuujButton = new javax.swing.JButton();
        suajButton = new javax.swing.JButton();
        xoajButton = new javax.swing.JButton();
        themjButton = new javax.swing.JButton();
        MenuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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

        danhSachKHTable.setBackground(new java.awt.Color(255, 255, 255));
        danhSachKHTable.setForeground(new java.awt.Color(0, 0, 0));
        danhSachKHTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Họ tên", "CCCD", "Ngày sinh", "Giới tính", "Địa chỉ", "SĐT", "Số HĐ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(danhSachKHTable);

        timTheoComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        timTheoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã KH", "Họ tên", "CCCD", "SĐT", " " }));
        timTheoComboBox.setPreferredSize(new java.awt.Dimension(100, 40));

        TieudeTK.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TieudeTK.setForeground(new java.awt.Color(0, 0, 0));
        TieudeTK.setText("Tìm kiếm theo");

        nhapjTextField.setBackground(new java.awt.Color(255, 255, 255));
        nhapjTextField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nhập thông tin");

        traCuujButton.setBackground(new java.awt.Color(24, 24, 68));
        traCuujButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        traCuujButton.setForeground(new java.awt.Color(255, 255, 255));
        traCuujButton.setText("Tra cứu");
        traCuujButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traCuujButtonActionPerformed(evt);
            }
        });

        suajButton.setBackground(new java.awt.Color(24, 24, 68));
        suajButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        suajButton.setForeground(new java.awt.Color(255, 255, 255));
        suajButton.setText("Sửa");
        suajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suajButtonActionPerformed(evt);
            }
        });

        xoajButton.setBackground(new java.awt.Color(24, 24, 68));
        xoajButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        xoajButton.setForeground(new java.awt.Color(255, 255, 255));
        xoajButton.setText("Xóa");
        xoajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoajButtonActionPerformed(evt);
            }
        });

        themjButton.setBackground(new java.awt.Color(24, 24, 68));
        themjButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        themjButton.setForeground(new java.awt.Color(255, 255, 255));
        themjButton.setText("Thêm");
        themjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themjButtonActionPerformed(evt);
            }
        });

        MenuPanel.setBackground(new java.awt.Color(24, 24, 68));
        MenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(220, 220, 46));
        jLabel1.setText("BRIGHT STAR");
        MenuPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 120, -1, -1));

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
                .addGap(0, 0, 0)
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(246, 246, 246))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(themjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(xoajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(suajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TieudeTK)
                                        .addComponent(timTheoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(32, 32, 32)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(nhapjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(traCuujButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(51, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TieudeTK)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timTheoComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nhapjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(traCuujButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xoajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(themjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void traCuujButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traCuujButtonActionPerformed
        // Lấy đầu vào từ người dùng
        String input = this.nhapjTextField.getText();

        // Kiểm tra đầu vào và gọi phương thức tương ứng
        if (input.equals("")) {
            inDanhSach();
        } else {
            TraCuuKH();
        }
    }//GEN-LAST:event_traCuujButtonActionPerformed

    private void themjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themjButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        ThemKhachHangFrame.main(currentUser);
    }//GEN-LAST:event_themjButtonActionPerformed

    private void xoajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoajButtonActionPerformed
        // TODO add your handling code here:
        int removeIndex = this.danhSachKHTable.getSelectedRow();
        try {
            if (removeIndex == -1) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn dữ liệu cần xoá!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } else if (this.danhSachKHTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Dữ liệu trống!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } else {
                Object maKHObject = this.danhSachKHTable.getValueAt(removeIndex, 0);
                maKH = (Integer) maKHObject;
                
                int choice = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn xóa không?", "Xác nhận xóa", JOptionPane.OK_CANCEL_OPTION);
                if (choice == JOptionPane.OK_OPTION) {
                    // Xử lý xóa ở đây
                    int row = KhachHangDAO.XoaKH(maKH);
                    if (row > 0) {
                        JOptionPane.showMessageDialog(rootPane, "Xoá thành công!", "Thông báo", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Xoá không thành công. Vui lòng thử lại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    // Người dùng hủy xóa
                    JOptionPane.showMessageDialog(rootPane, "Đã hủy xóa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }

                inDanhSach();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Error!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_xoajButtonActionPerformed

    private void suajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suajButtonActionPerformed
        int selectedIndex = this.danhSachKHTable.getSelectedRow();

        try {
            if (selectedIndex == -1) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn dữ liệu cần sửa!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } else if (this.danhSachKHTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Dữ liệu trống!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } else {
                Object maKHObject = this.danhSachKHTable.getValueAt(selectedIndex, 0);
                int maKH = (Integer) maKHObject;
                dispose();
                SuaKhachHangFrame.main(currentUser, maKH);

//                SuaKhachHangFrame suaKhachHangFrame = new SuaKhachHangFrame(maKH);
//                //suaKhachHangFrame.setCurrentUser(currentUser); // giả định rằng bạn có phương thức để đặt người dùng hiện tại
//                suaKhachHangFrame.setVisible(true);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Error!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_suajButtonActionPerformed

    private void KhachHangLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhachHangLbMouseClicked
        if (TrangChuDAO.KTLoaiNV(currentUser.getMaNV()) == 1 || TrangChuDAO.KTLoaiNV(currentUser.getMaNV()) == 3) {
            dispose();
            KhachHangFrame.main(currentUser);
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập vào chức năng này", "Thông báo", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_KhachHangLbMouseClicked

    private void NhanVienLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhanVienLbMouseClicked
        System.out.println(currentUser.toString());
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

    private void DangXuatLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangXuatLbMouseClicked
        int a = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?", "Đăng xuất", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            dispose();
            DangNhapFrame.main(null);
        }
    }//GEN-LAST:event_DangXuatLbMouseClicked


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
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new KhachHangFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel TieudeTK;
    private javax.swing.JLabel TrangBiLb;
    private Image.SVGImage TrangBiSvg;
    private javax.swing.JTable danhSachKHTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nhapjTextField;
    private javax.swing.JButton suajButton;
    private javax.swing.JButton themjButton;
    private javax.swing.JComboBox<String> timTheoComboBox;
    private javax.swing.JButton traCuujButton;
    private javax.swing.JButton xoajButton;
    // End of variables declaration//GEN-END:variables

}
