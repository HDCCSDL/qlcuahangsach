package ketnoi;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectDB {

    static Connection conn = null;
    static String conString = "jdbc:mysql://" + GUI.jframeConnectData.jComboBoxTenMayChu.getSelectedItem().toString() +":" + Integer.parseInt(GUI.jframeConnectData.jComboBoxPort.getSelectedItem().toString()) + "/" + GUI.jframeConnectData.jComboBoxTenCSDL.getSelectedItem().toString();
    static String driver = "com.mysql.jdbc.Driver";
    static String password = GUI.jframeConnectData.jPasswordFieldMatKhau.getText();
    static String userName = GUI.jframeConnectData.jComboBoxTenDangNhap.getSelectedItem().toString();

    public static Connection getConnection() {
        try {

            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(conString, userName, password);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Không thể kết nối với CSDL");
        }
        return conn;
    }
}
