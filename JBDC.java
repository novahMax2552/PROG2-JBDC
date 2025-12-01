import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JBDC {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/java-base";
        String user = "postgres";
        String password = "Novah Anusha";
