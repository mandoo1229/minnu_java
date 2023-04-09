import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteExample {
    public static void main(String[] args) {
        //DB 접속 정보
        final String url = "jdbc:mariadb://localhost:3306/mydatabase";
        final String user = "root";
        final String pwd = "playdata";

        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요:");
        String s = scanner.nextLine();
//        String sql = "insert into mytable (id, name) values (6, '" + s +"')";
        String sql = "delete from mytable where id = ?";
        try(
                Connection conn = DriverManager.getConnection(url, user, pwd);
                // SQl 인젝션 공격에 대해 대비 --> 보안성 향상
                // SQL 처리에 있어 오버헤드를 줄어서 성능향상에 도움을 준다.
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
        ) {
            preparedStatement.setInt(1, Integer.parseInt(s));
            int resultCount = preparedStatement.executeUpdate();
            System.out.println(resultCount + "개의 행이 삽입되었습니다.");
        } catch (SQLException e) {
            System.out.println("데이터베이스로부터 데이터를 가져오는데 실패했습니다." + e.getMessage());
        }
    }
}
