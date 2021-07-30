import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PrepaInsertar {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:\\db57\\hr.db";
        Scanner sc = new Scanner(System.in);
        try {
            Connection conn = DriverManager.getConnection(url);
            String sql = "insert into departments (department_name, location_id) values(?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            System.out.println("Introduzca el nombre del departamento");
            String depName = sc.nextLine();
            System.out.println("Introduzca el Id de la ubicación");
            Integer locId = sc.nextInt();
            pstmt.setString(1, depName);
            pstmt.setInt(2, locId);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Se ha insertado un nuevo registro");
            }
            pstmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Se ha presentado el error: " + e.getMessage());
            e.printStackTrace();
        }
        sc.close();
    }

}
