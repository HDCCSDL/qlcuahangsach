package ketnoi;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectDB {

    static Connection conn = null;
    //static String conString = "jdbc:mysql://" + GUI.jConnectData.jComboBoxTenMayChu.getSelectedItem().toString() +":" + Integer.parseInt(GUI.jConnectData.jComboBoxPort.getSelectedItem().toString()) + "/" + GUI.jConnectData.jComboBoxTenCSDL.getSelectedItem().toString() + "?useUnicode=true&characterEncoding=utf-8";
    static String driver = "com.mysql.jdbc.Driver";
    //static String password = GUI.jConnectData.jPasswordFieldMatKhau.getText();
    //static String userName = GUI.jConnectData.jComboBoxTenDangNhap.getSelectedItem().toString();

    public static Connection getConnection() {
        try {

            Class.forName(driver).newInstance();
            //conn = DriverManager.getConnection(conString, userName, password);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qly_nhasach","root","uyen14895");

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Không thể kết nối với CSDL");
        }
        return conn;
    }
}
