import com.hana.frame.ConnectionPool;

import java.sql.SQLException;

public class ConnectionPoolTest {
    public static void main(String[] args) {
        ConnectionPool connectionPool;
        try {
            connectionPool = ConnectionPool.create(); // ConnectionPool의 static 영역 실행된다
            System.out.println(connectionPool.getSize());
            connectionPool = ConnectionPool.create(); // static 영역은 최초 1번만 실행된다
            System.out.println(connectionPool.getSize());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}