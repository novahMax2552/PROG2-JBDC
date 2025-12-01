import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JBDC {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/java-base";
        String user = "postgres";
        String password = "Novah Anusha";
try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connexion réussie !");

            Statement stmt = con.createStatement();


            ResultSet rs = stmt.executeQuery("SELECT id, nom FROM etudiants");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                System.out.println(id + " - " + nom);
            }
            con.close();
            System.out.println("Connexion fermée.");

        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
