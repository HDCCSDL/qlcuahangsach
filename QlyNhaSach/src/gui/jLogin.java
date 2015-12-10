/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author pdc
 */
public class jLogin extends javax.swing.JFrame {

    /**
     * Creates new form jLogin
     */
    public jLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("/mnt/DATA/BTL_CSDL/Qly Nha Sach/src/Image/bg.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("HVD Bodedo", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 148, 254));
        jLabel1.setIcon(new javax.swing.ImageIcon("/mnt/DATA/BTL_CSDL/Qly Nha Sach/src/Image/login5.png")); // NOI18N
        jLabel1.setText(" USER LOGIN");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Tài Khoản ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 250, 250));
        jLabel4.setText("Mật Khẩu");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(167, 254, 239));
        jButton1.setIcon(new javax.swing.ImageIcon("/mnt/DATA/BTL_CSDL/Qly Nha Sach/src/Image/refresh.png")); // NOI18N
        jButton1.setText("Đăng Nhập");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(167, 254, 239));
        jButton2.setIcon(new javax.swing.ImageIcon("/mnt/DATA/BTL_CSDL/Qly Nha Sach/src/Image/close2.png")); // NOI18N
        jButton2.setText("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)))
                        .addGap(26, 26, 26)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jPasswordField1.requestFocus();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jTextField1.getText().equals("")) {
            if (new String(jPasswordField1.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Bạn chưa nhập tên đăng nhập và mật khẩu", "Invalid", JOptionPane.ERROR_MESSAGE);
                jTextField1.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Bạn chưa nhập tên đăng nhập", "Invalid", JOptionPane.ERROR_MESSAGE);
                jPasswordField1.requestFocus();
            }
        } else if (new String(jPasswordField1.getPassword()).equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mật khẩu", "Invalid", JOptionPane.ERROR_MESSAGE);
            jPasswordField1.requestFocus();
        } else {
            try {

                Statement statement = ketnoi.ConnectDB.getConnection().createStatement();
                String sql = String.format("SELECT USERNAME,PASSWORD,CHUCVU FROM TAIKHOAN WHERE USERNAME = '%s' AND PASSWORD = '%s'", jTextField1.getText(), new String(jPasswordField1.getPassword()));
                ResultSet rs = statement.executeQuery(sql);

                if (rs != null) {
                    if (rs.next()) {
                        if (jTextField1.getText().equals(rs.getString("USERNAME")) && jPasswordField1.getPassword().equals(rs.getString("PASSWORD")));
                        {
                            JOptionPane.showMessageDialog(null, "Đăng nhập thành công", "Login successfuly", JOptionPane.INFORMATION_MESSAGE);
                            jframeMain menu = new jframeMain();
                            if (null != rs.getString("CHUCVU")) {
                                switch (rs.getString("CHUCVU")) {
                                    case "Quản Lý":
                                        menu.setTenUser(rs.getString("CHUCVU"));
                                        menu.setVisible(true);
                                        jframeMain.jButtonTainguyen.setEnabled(false);
                                        jframeMain.jButtonThongtin.setEnabled(false);
                                        jframeMain.jButtonCongcu.setEnabled(false);
                                        jframeMain.jButtonBanHang.setEnabled(false);
                                        dispose();
                                        break;
                                    case "Thủ Kho":
                                        menu.setTenUser(rs.getString("CHUCVU"));
                                        menu.setVisible(true);
                                        jframeMain.jButtonBanHang.setEnabled(false);
                                        jframeMain.jButtonKhuyenmai.setEnabled(false);
                                        //jframeMain.jButtonHeThong.setEnabled(false);
                                        jframeMain.jButtonBaoCao.setEnabled(false);
                                        dispose();
                                        break;
                                    default:
                                        menu.setTenUser(rs.getString("CHUCVU"));
                                        menu.setVisible(true);
                                        jframeMain.jButtonTainguyen.setEnabled(false);
                                        jframeMain.jButtonThongtin.setEnabled(false);
                                        jframeMain.jButtonKhuyenmai.setEnabled(false);
                                        jframeMain.jButtonHeThong.setEnabled(false);
                                        jframeMain.jButtonBaoCao.setEnabled(false);
                                        dispose();
                                        break;
                                }
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc mật khẩu không đúng", "Login failed", JOptionPane.ERROR_MESSAGE);
                        jTextField1.requestFocus();
                    }
                }

            } catch (SQLException | HeadlessException e) {
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton1.requestFocus();
            if (jTextField1.getText().equals("")) {
                if (new String(jPasswordField1.getPassword()).equals("")) {
                    JOptionPane.showMessageDialog(null, "Bạn chưa nhập tên đăng nhập và mật khẩu", "Invalid", JOptionPane.ERROR_MESSAGE);
                    jTextField1.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Bạn chưa nhập tên đăng nhập", "Invalid", JOptionPane.ERROR_MESSAGE);
                    jPasswordField1.requestFocus();
                }
            } else if (new String(jPasswordField1.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Bạn chưa nhập mật khẩu", "Invalid", JOptionPane.ERROR_MESSAGE);
                jPasswordField1.requestFocus();
            } else {
                try {

                    Statement statement = ketnoi.ConnectDB.getConnection().createStatement();
                    String sql = String.format("SELECT USERNAME,PASSWORD,CHUCVU FROM TAIKHOAN WHERE USERNAME = '%s' AND PASSWORD = '%s'", jTextField1.getText(), new String(jPasswordField1.getPassword()));
                    ResultSet rs = statement.executeQuery(sql);

                    if (rs != null) {
                        if (rs.next()) {
                            if (jTextField1.getText().equals(rs.getString("USERNAME")) && jPasswordField1.getPassword().equals(rs.getString("PASSWORD")));
                            {
                                JOptionPane.showMessageDialog(null, "Đăng nhập thành công", "Login successfuly", JOptionPane.INFORMATION_MESSAGE);
                                jframeMain menu = new jframeMain();
                                if (null != rs.getString("CHUCVU")) {
                                    switch (rs.getString("CHUCVU")) {
                                        case "Quản Lý":
                                            menu.setTenUser(rs.getString("CHUCVU"));
                                            menu.setVisible(true);
                                            jframeMain.jButtonTainguyen.setEnabled(false);
                                            jframeMain.jButtonThongtin.setEnabled(false);
                                            jframeMain.jButtonCongcu.setEnabled(false);
                                            jframeMain.jButtonBanHang.setEnabled(false);
                                            dispose();
                                            break;
                                        case "Thủ Kho":
                                            menu.setTenUser(rs.getString("CHUCVU"));
                                            menu.setVisible(true);
                                            jframeMain.jButtonBanHang.setEnabled(false);
                                            jframeMain.jButtonKhuyenmai.setEnabled(false);
                                            jframeMain.jButtonHeThong.setEnabled(false);
                                            jframeMain.jButtonBaoCao.setEnabled(false);
                                            dispose();
                                            break;
                                        default:
                                            menu.setTenUser(rs.getString("CHUCVU"));
                                            menu.setVisible(true);
                                            jframeMain.jButtonTainguyen.setEnabled(false);
                                            jframeMain.jButtonThongtin.setEnabled(false);
                                            jframeMain.jButtonKhuyenmai.setEnabled(false);
                                            jframeMain.jButtonHeThong.setEnabled(false);
                                            jframeMain.jButtonBaoCao.setEnabled(false);
                                            dispose();
                                            break;
                                    }
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc mật khẩu không đúng", "Login failed", JOptionPane.ERROR_MESSAGE);
                            jTextField1.requestFocus();
                        }
                    }

                } catch (SQLException | HeadlessException e) {
                }
            }
        }

    }//GEN-LAST:event_jPasswordField1KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new jLogin().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}