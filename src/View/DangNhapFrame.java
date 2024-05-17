/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;
import DAO.NhanVienDAO;
import javax.swing.JOptionPane;
import Model.NhanVienModel;
import java.awt.event.KeyEvent;

/**
 *
 * @author phuch
 */
public class DangNhapFrame extends javax.swing.JDialog {
         NhanVienModel user;
    /**
     * Creates new form Login
     * @param parent
     * @param modal
     */
    public DangNhapFrame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    DangNhapFrame() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EnterAccount_JTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        KhachButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 102, 255));
        jLabel2.setText("Đăng nhập");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Tài khoản ");

        EnterAccount_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterAccount_JTextFieldActionPerformed(evt);
            }
        });
        EnterAccount_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EnterAccount_JTextFieldKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel4.setText("Mật Khẩu");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        LoginButton.setBackground(new java.awt.Color(204, 204, 255));
        LoginButton.setForeground(new java.awt.Color(0, 0, 0));
        LoginButton.setText("Đăng nhập");
        LoginButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        KhachButton.setBackground(new java.awt.Color(204, 204, 255));
        KhachButton.setForeground(new java.awt.Color(0, 0, 0));
        KhachButton.setText("Tiếp tục với tư cách khách hàng");
        KhachButton.setToolTipText("");
        KhachButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KhachButtonMouseClicked(evt);
            }
        });
        KhachButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KhachButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterAccount_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KhachButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EnterAccount_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(KhachButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 424, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        if (EnterAccount_JTextField.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập không được để trống", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else if (jPasswordField1.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không được để trống", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }else {

            user = NhanVienDAO.getUser(EnterAccount_JTextField.getText(), jPasswordField1.getText());

            if (user != null) {
                //JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
                JOptionPane.showMessageDialog(this, "Đăng nhập thành công", "Thông báo", JOptionPane.PLAIN_MESSAGE);
                hide();

                HomePageEmpFrame.main(user);
            } else {
                JOptionPane.showMessageDialog(this, "Sai tên đăng nhập hoặc mật khẩu", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void KhachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KhachButtonActionPerformed

    }//GEN-LAST:event_KhachButtonActionPerformed
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            DangNhapFrame dialog =new DangNhapFrame(null,true);
            dialog.setTitle("Đăng nhập hệ thống ");
            dialog.setResizable(false);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        });
    }

    private void EnterAccount_JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterAccount_JTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            jPasswordField1.requestFocus();
    }//GEN-LAST:event_EnterAccount_JTextFieldKeyPressed

    private void EnterAccount_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterAccount_JTextFieldActionPerformed
      
    }//GEN-LAST:event_EnterAccount_JTextFieldActionPerformed
    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {                                           
      
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            LoginButton.doClick();
    }
    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
 
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
        if (EnterAccount_JTextField.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập không được để trống", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else if (jPasswordField1.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không được để trống", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } // Duyet tai khoan
        else {

            user = NhanVienDAO.getUser(EnterAccount_JTextField.getText(), jPasswordField1.getText());

            if (user != null) {
                //JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
                JOptionPane.showMessageDialog(this, "Đăng nhập thành công", "Thông báo", JOptionPane.PLAIN_MESSAGE);
                hide();

                HomePageEmpFrame.main(user);
            } else {
                JOptionPane.showMessageDialog(this, "Sai tên đăng nhập hoặc mật khẩu", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_LoginButtonMouseClicked

    private void KhachButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhachButtonMouseClicked
            dispose();
            HomePageCusFrame.main();
    }//GEN-LAST:event_KhachButtonMouseClicked

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EnterAccount_JTextField;
    private javax.swing.JButton KhachButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
