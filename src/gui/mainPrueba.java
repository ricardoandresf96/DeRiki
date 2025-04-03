/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SetyV
 */
public class mainPrueba {
    
    
    private static final String URL = "jdbc:mariadb://localhost:3306/gestion_notas";
    private static final String USER = "root";
    private static final String PASSWORD = "alumno";
    
    private static String calcularMD5(char[] contrasena) throws NoSuchAlgorithmException {
    // Convertir char[] a String (necesario para MD5)
    String password = new String(contrasena);

    // Calcular MD5
    MessageDigest md = MessageDigest.getInstance("MD5");
    byte[] hashBytes = md.digest(password.getBytes());

    // Convertir bytes a hexadecimal (para almacenamiento)
    StringBuilder hexString = new StringBuilder();
    for (byte b : hashBytes) {
        hexString.append(String.format("%02x", b));
    }

    return hexString.toString();
}
    private static Connection getConnection() throws SQLException {
        return (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
    }
    private static String buscarSomeone() {
        // aqui coloca la tabla que quieres buscar 
        String tabla = "profesor";
        // aqui se debe colocar el nombre de la variable, usuario o etc
        String nombreUsuario = "usuario_p";
        String variable = "ricardo.prof";
        // checa que despues de Select contraseña se debe comprobar con tabla
        String sql = "SELECT contrasena_p FROM " + tabla + " where " + nombreUsuario + " = '" + variable + "'"; // Tu consulta real

        try (Connection conn = getConnection()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            // if acortado
            if (rs.next()) {
                System.out.println(rs.getString(1));// Si hay una fila disponible
                return rs.getString(1);    // Obtener el valor de la columna 1
            } else {
                return "Valor no encontrado"; // Mensaje alternativo
            }

        } catch (SQLException e) {
            return "Error en búsqueda: " + e.getMessage();
        }
    }
    public static int AlumnoIDConseguir() {
    String variable = "pepe.alumno";
    String sql = "SELECT id_alumno FROM alumno WHERE usuario_a = '"+variable+"'";
    
    try (Connection conn = getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
        pstmt.setString(1, variable);
        
        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                int id = rs.getInt("id_alumno"); // Better to use column name
                System.out.println("Found ID: " + id);
                return id;
            }
            System.out.println("No student found with username: " + variable);
            return 0;
        }
    } catch (SQLException e) {
        System.err.println("Database error: " + e.getMessage());
        return 0;
    }
}
    
    
    public static void main(String[] args) {
        char[] contraseña = "maldito".toCharArray() ;
        try {
            System.out.println(calcularMD5(contraseña));
            if(calcularMD5(contraseña).equals("484ac397cb407ab7aad776f0663f8c85")){
                System.out.println("Entraste");
            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(mainPrueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(buscarSomeone());
        System.out.println(AlumnoIDConseguir());
    }
}
