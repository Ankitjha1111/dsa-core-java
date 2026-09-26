import java.sql.Connection;
import java .sql.DriverManager;
import java .sql.SQLException;

public class CheckedEg4 {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost//test", "root", "password");

            System.out.println("Connected to database");
        } catch (SQLException e) {
            System.out.println("Database error :"+e.getMessage());
        }

    }
}
