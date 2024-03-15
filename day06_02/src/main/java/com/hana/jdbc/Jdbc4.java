package com.hana.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Update
public class Jdbc4 {
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
        String insertSql = "UPDATE db_cust SET pwd = ?, name = ? WHERE id = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(insertSql);
            preparedStatement.setString(1, "pwd03");
            preparedStatement.setString(2, "이말숙");
//            preparedStatement.setString(3, "id03");
            preparedStatement.setString(3, "id05"); // 없는 사람 Update

            // 4. 전송
            int result = preparedStatement.executeUpdate();
            System.out.println("Updated Data ... " + result); // Update가 되지 않더라도 에러가 발생하지 않으므로 result를 통해 알아야 한다
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
