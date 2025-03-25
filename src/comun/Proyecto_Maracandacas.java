package comun;
import java.sql.*;
import javax.swing.*;
        
public class Proyecto_Maracandacas {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Proyecto Maracandacas");
        
        Login_Comun menu1 = new Login_Comun();
    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        
        frame.add(menu1);
        
        frame.setVisible(true);
        
    }
}

 // {
        /*
           
        String url = "jdbc:mariadb://localhost:3307/vuelta";
        String usuario = "root";
        String contraseña = "alumno";

        try (Connection conn = DriverManager.getConnection(url, usuario, contraseña);) {

            
            System.out.println("¡Conexión exitosa!");
            
            System.out.println("-----***-----");
                
                Statement stmt = conn.createStatement( );
                String query = "";
                
                ResultSet rs = stmt.executeQuery(query);
                
                System.out.println("-----***-----");
                
                while (rs.next()) {
                    System.out.print(rs.getInt("*******") + " "); //Resultado de la consulta
                    System.out.println();
                    
                }

            }catch (SQLException e) {
            System.err.println("Error de conexión SQL");
            e.printStackTrace();
        }
        }
    
        */
        //Dropdown Base de datos
        
