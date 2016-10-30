/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author luan
 */
public class Conexao {

    final private static String user = "postgres";
    final private static String password = "postgres";
    final private static String driver = "org.postgresql.Driver";
    final private static String url = "jdbc:postgresql://localhost:5432/craof";
    static private Connection con;

    public static Connection getConnection() throws SQLException {
        if (con == null) {
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "não encontrado");
                System.out.println("Driver não encontrado!!");
                e.printStackTrace();
            }
            try {
                con = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                System.out.println("Não foi possivel conectar");
                e.printStackTrace();
            }
        }
        return con;
    }

    public static void setConnection() throws SQLException {
        if (con != null) {
            con.close();
            con = null;
        }

    }

}
