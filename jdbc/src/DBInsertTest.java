import java.sql.*;

public class DBInsertTest {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/mydatabase";
        String user = "root";
        String password = "password";
        String sql = "INSERT INTO employees (emp_no, birth_date, first_name, last_name, gender, hire_date)VALUES(?,?,?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql);) {
            stmt.setInt(1, 10006);
            stmt.setDate(2, Date.valueOf("1965-08-08"));
            stmt.setString(3, "john");
            stmt.setString(4, "Doe");
            stmt.setString(5, "M");
            stmt.setDate(6, Date.valueOf("1990-01-01"));

            int result = stmt.executeUpdate();
            System.out.println(result + "개의 행이 삽입되었습니다.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
