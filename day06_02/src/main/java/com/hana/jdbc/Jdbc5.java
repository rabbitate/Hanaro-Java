package com.hana.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Delete
public class Jdbc5 {
    public static void main(String[] args) {
        // 1. Driver Loading
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("OK ...");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Not Found ...");
        }

        // 2. Connection
        String url = "jdbc:mysql://localhost:3306/shopdb";
        String id = "user01";
        String pwd = "111111";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, id, pwd);
        } catch (SQLException e) {
            System.out.println("접속 실패");
        }

        // 3. SQL 구문 생성
        String deletetSql = "DELETE FROM db_cust WHERE id = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(deletetSql);
            preparedStatement.setString(1, "id03");

            // 4. 전송
            int result = preparedStatement.executeUpdate(); // 삭제가 되지 않는다면 0, 삭제가 되었다면 1
            System.out.println("deleted Data ... " + result);
        } catch (SQLException e) {
            System.out.println("SQL Error");
        } finally {
            if(preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
