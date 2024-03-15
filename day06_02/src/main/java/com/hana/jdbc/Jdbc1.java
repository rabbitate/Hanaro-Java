package com.hana.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Insert
public class Jdbc1 {
    public static void main(String[] args) {
        // 1. Driver Loading
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // 메모리에 있던 JDBC 드라이버를 올린다
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
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO db_cust VALUES(?,?,?)");
//            preparedStatement.setString(1, "id02");
//            preparedStatement.setString(2, "pwd02");
//            preparedStatement.setString(3, "james02");
            preparedStatement.setString(1, "id03");
            preparedStatement.setString(2, "pwd03");
            preparedStatement.setString(3, "한글");

            // 4. 전송
            preparedStatement.executeUpdate();
            System.out.println("Inserted Data ...");
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
