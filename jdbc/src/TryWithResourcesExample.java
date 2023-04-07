import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryWithResourcesExample {
    public static void main(String[] args) {

        String url = "jdbc:mariadb://localhost:3306/mydatabase";
        String user = "root";
        String password = "playdata";

        //MariaDB 연결
        try(Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to MariaDB!");
        } catch (SQLException e) {
            System.out.println("MariaDB JDBC Driver 클래스를 찾을 수 없습니다." + e.getMessage());
        } ;
    }
}
