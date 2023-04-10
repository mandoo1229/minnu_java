import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBDeleteTest {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/mydatabase";
        String user = "root";
        String password = "password";
        String sql = "DELETE FROM employees where emp_no = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql);) {
            stmt.setInt(1, 10006);

            int result = stmt.executeUpdate();
            System.out.println(result + "개의 행이 삭제되었습니다.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
