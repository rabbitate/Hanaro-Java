package com.hana.jdbc;

import java.sql.*;

// SELECT * FROM db_cust
public class Jdbc2 {
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
        String selectSQL = "SELECT * FROM db_cust";
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement(selectSQL);

            // 4. 전송
            resultSet = preparedStatement.executeQuery();

            // 5. 결과 출력
            while (resultSet.next()) {
                System.out.println(resultSet.next());
                String custId = resultSet.getString("id");
                String custIPwd = resultSet.getString("pwd");
                String custName = resultSet.getString("name");
                System.out.printf("%s %s %s \n", custId, custIPwd, custName);
            }
            System.out.println("데이터가 없습니다.");
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
