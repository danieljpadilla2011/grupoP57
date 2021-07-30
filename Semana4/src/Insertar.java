import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insertar {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:\\db57\\hr.db";
        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            String sql = "insert into departments (department_name, location_id) values('Auxiliares',1700)";
            int rows = stmt.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("Nuevo departamento creado. Se insertó " + rows + " registro(s)");
            }
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Se ha presentado el error: " + e.getMessage());
            e.printStackTrace();
        }

    }

}
