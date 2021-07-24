package com.demo.controller;

import com.demo.mode.User;
import org.junit.Test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

public class QueryAll {

    @Test
    public void testQueryAll(){
        Connection conn= null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //1.Registration driver
            Class.forName("com.mysql.jdbc.Driver");
            //2.Get connection
            String url ="jdbc:mysql://localhost:3306/mybase";
            String username="root";
            String password="xuyiqing";
            conn = DriverManager.getConnection(url,username,password);
            //3.Get execution sql Statement object
            stmt = conn.createStatement();
            //4.To write sql Sentence
            String sql = "select * from user";
            //5.implement sql Sentence
            rs = stmt.executeQuery(sql);
            //6.Process result set
            while(rs.next()){
                System.out.println("user name:"+rs.getString(2)+" password:"+rs.getString("upassword"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(rs!=null)
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if(stmt!=null)
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if(conn!=null)
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }
}
