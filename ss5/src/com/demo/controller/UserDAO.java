package com.demo.controller;

import com.demo.mode.User;
import org.junit.Test;

import java.sql.*;

public class UserDAO {

    @Test
    public void testLogin() {
        try {
            login("zhangsan' or 'zhangsan", "666");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void login(String username, String password) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mybase";
        String usern = "root";
        String pwd = "xuyiqing";
        Connection conn = DriverManager.getConnection(url, usern, pwd);
        String sql = "select * from users where username=? and upassword=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            System.out.println("Login successful");
            System.out.println(sql);
        } else {
            System.out.println("Wrong account or password!");
        }
        if (rs != null) {
            rs.close();
        }
        if (pstmt != null) {
            pstmt.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
}
