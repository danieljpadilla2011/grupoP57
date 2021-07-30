import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:sqlite:C:\\db57\\hr.db";
        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stm = conn.createStatement();
            String sql = "select * from departments";
            ResultSet resultado = stm.executeQuery(sql);
            while (resultado.next()) {
                Integer idDept = resultado.getInt("department_id");
                String nomDept = resultado.getString("department_name");
                Integer idLoc = resultado.getInt("location_id");
                System.out.println(idDept + " " + nomDept + " " + idLoc);

            }
        } catch (Exception e) {
            System.out.println("Se ha presentado el error: " + e.getMessage());
        }

    }
}
