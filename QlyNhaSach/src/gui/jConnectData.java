/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author pdc
 */
public class jConnectData extends javax.swing.JFrame {

    /**
     * Creates new form jConnectData
     */
    public jConnectData() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("/mnt/DATA/BTL_CSDL/Qly Nha Sach/src/Image/connectdata.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxTenMayChu = new javax.swing.JComboBox();
        jComboBoxPort = new javax.swing.JComboBox();
        jComboBoxTenCSDL = new javax.swing.JComboBox();
        jComboBoxTenDangNhap = new javax.swing.JComboBox();
        jPasswordFieldMatKhau = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButtonDangNhap = new javax.swing.JButton();
        jButtonThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 47, 0));
        jLabel1.setText("DataBase Connect");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/login1.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Droid Serif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Tên máy chủ :");

        jLabel7.setFont(new java.awt.Font("Droid Serif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Cơ sở dữ liệu:");

        jLabel5.setFont(new java.awt.Font("Droid Serif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("UserName :");

        jLabel6.setFont(new java.awt.Font("Droid Serif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("PassWord :");

        jComboBoxTenMayChu.setEditable(true);
        jComboBoxTenMayChu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "localhost" }));
        jComboBoxTenMayChu.setToolTipText("");

        jComboBoxPort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3306" }));

        jComboBoxTenCSDL.setEditable(true);
        jComboBoxTenCSDL.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "qly_nhasach" }));

        jComboBoxTenDangNhap.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "root" }));

        jPasswordFieldMatKhau.setText("uyen14895");
        jPasswordFieldMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldMatKhauKeyPressed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Port");

        jButtonDangNhap.setFont(new java.awt.Font("Droid Serif", 0, 14)); // NOI18N
        jButtonDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/refresh.png"))); // NOI18N
        jButtonDangNhap.setText("Kết nối");
        jButtonDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDangNhapActionPerformed(evt);
            }
        });

        jButtonThoat.setFont(new java.awt.Font("Droid Serif", 0, 14)); // NOI18N
        jButtonThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close2.png"))); // NOI18N
        jButtonThoat.setText("Thoát");
        jButtonThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldMatKhau)
                            .addComponent(jComboBoxTenCSDL, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxTenMayChu, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jComboBoxTenDangNhap, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jButtonThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(159, 159, 159))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTenMayChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTenCSDL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordFieldMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonThoat)
                    .addComponent(jButtonDangNhap))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldMatKhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldMatKhauKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonDangNhap.requestFocus();
            if (ketnoi.DAO.Open(jComboBoxTenMayChu.getSelectedItem().toString(), jComboBoxTenDangNhap.getSelectedItem().toString(), jPasswordFieldMatKhau.getText(), jComboBoxTenCSDL.getSelectedItem().toString(), Integer.parseInt(jComboBoxPort.getSelectedItem().toString()))) //JOptionPane.showMessageDialog(Login.this, "Kết nối thành công đến CSDL.", "Connect successfuly", JOptionPane.INFORMATION_MESSAGE);
            {
                //JOptionPane.showConfirmDialog(null, "Kết nối thành công đến CSDL.", "Connect successfuly", JOptionPane.YES_NO_OPTION);
                JOptionPane.showMessageDialog(null, "Kết nối thành công đến CSDL.");
                new jLogin().show();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi đăng nhập CSDL", "Lỗi đăng nhập", JOptionPane.ERROR_MESSAGE);
                jPasswordFieldMatKhau.requestFocus();
            }
        }
    }//GEN-LAST:event_jPasswordFieldMatKhauKeyPressed

    private void jButtonDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDangNhapActionPerformed
        // TODO add your handling code here:
        if (ketnoi.DAO.Open(jComboBoxTenMayChu.getSelectedItem().toString(), jComboBoxTenDangNhap.getSelectedItem().toString(), jPasswordFieldMatKhau.getText(), jComboBoxTenCSDL.getSelectedItem().toString(), Integer.parseInt(jComboBoxPort.getSelectedItem().toString()))) //JOptionPane.showMessageDialog(Login.this, "Kết nối thành công đến CSDL.", "Connect successfuly", JOptionPane.INFORMATION_MESSAGE);
        {
            //JOptionPane.showConfirmDialog(null, "Kết nối thành công đến CSDL.", "Connect successfuly", JOptionPane.YES_NO_OPTION);
            JOptionPane.showMessageDialog(null, "Kết nối thành công đến CSDL.");
            new jLogin().show();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Lỗi đăng nhập CSDL", "Lỗi đăng nhập", JOptionPane.ERROR_MESSAGE);
            jPasswordFieldMatKhau.requestFocus();
        }
    }//GEN-LAST:event_jButtonDangNhapActionPerformed

    private void jButtonThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonThoatActionPerformed

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
            java.util.logging.Logger.getLogger(jConnectData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new jConnectData().setVisible(true);
                jPasswordFieldMatKhau.requestFocus();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButtonDangNhap;
    private javax.swing.JButton jButtonThoat;
    public static javax.swing.JComboBox jComboBoxPort;
    public static javax.swing.JComboBox jComboBoxTenCSDL;
    public static javax.swing.JComboBox jComboBoxTenDangNhap;
    public static javax.swing.JComboBox jComboBoxTenMayChu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPasswordField jPasswordFieldMatKhau;
    // End of variables declaration//GEN-END:variables
}
