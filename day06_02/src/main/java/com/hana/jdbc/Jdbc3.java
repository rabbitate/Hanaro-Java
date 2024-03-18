package com.hana.jdbc;

import java.sql.*;

// SELECT * FROM db_cust WHERE id = ?
public class Jdbc3 {
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
            e.printStackTrace();
        }

        // 3. SQL 구문 생성
        PreparedStatement preparedStatement = null;
        String selectSQL = "SELECT * FROM db_cust WHERE id = ?"; // ? -> placeholder
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setString(1, "id02"); // PreparedStatement 객체에 문자열 파라미터를 설정, SQL 문의 placeholder에 대응하는 위치에 문자열 값을 설정

            // 4. 전송
            resultSet = preparedStatement.executeQuery();

            // 5. 결과 출력
            resultSet.next();
            String custId = resultSet.getString("id");
            String custIPwd = resultSet.getString("pwd");
            String custName = resultSet.getString("name");
            System.out.printf("%s %s %s \n", custId, custIPwd, custName);
        } catch (SQLException e) {
            System.out.println("SQL Error");
        } finally {
            if(resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

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
