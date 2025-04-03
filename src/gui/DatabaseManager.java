/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
import java.sql.*;
import java.time.LocalDate;
import java.util.List;

public class DatabaseManager {
    private Connection connection;
    
    // Variables estáticas para ejemplo (deberían ser parámetros del método)
    private static String nombre = "Ana";
    private static String apellidos = "Gómez López";
    private static int edad = 22;
    private static String numeroAlumno = "ALU2023010";
    private static int idCiclo = 1; // Debe existir en la tabla Ciclo
    private static String curso = "1";
    private static LocalDate fechaMatricula = LocalDate.now();
    private static String usuario = "ana.alumno";
    private static String contrasena = "contraseña";
    
    // Datos de ejemplo para notas
    

    public void insertarAlumnoCompleto() {
        
        String nombre;
        String apellido;
        int edad;
        String numeroAlumno;
        int Ciclo;
        String curso;
        String fechaMatricula;
        String usuario;
        String contraseña;
        
        
        
        
        
        
        
        
        
        String sqlAlumno = "INSERT INTO Alumno (nombre, apellidos, edad, numero_alumno, "
                + "id_ciclo, curso, fecha_matricula, usuario_a, contrasena_a) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        String sqlNotas = "INSERT INTO Notas (id_alumno, id_modulo, nota_1ev, nota_2ev, nota_3ev, nota_final) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gestion_notas", "root", "alumno")) {
            conn.setAutoCommit(false); // Iniciar transacción

            // Validar campos obligatorios
            if (nombre == null || apellidos == null || numeroAlumno == null || 
                curso == null || fechaMatricula == null || usuario == null || contrasena == null) {
                throw new SQLException("Campos obligatorios faltantes");
            }

            try (PreparedStatement pstmtAlumno = conn.prepareStatement(sqlAlumno, Statement.RETURN_GENERATED_KEYS)) {
                // Insertar alumno
                pstmtAlumno.setString(1, nombre);
                pstmtAlumno.setString(2, apellidos);
                pstmtAlumno.setInt(3, edad);
                pstmtAlumno.setString(4, numeroAlumno);
                pstmtAlumno.setInt(5, idCiclo);
                pstmtAlumno.setString(6, curso);
                pstmtAlumno.setDate(7, Date.valueOf(fechaMatricula));
                pstmtAlumno.setString(8, usuario);
                pstmtAlumno.setString(9, contrasena);

                int affectedRows = pstmtAlumno.executeUpdate();
                
                if (affectedRows == 0) {
                    throw new SQLException("Error al insertar alumno");
                }

                // Obtener ID generado
                try (ResultSet generatedKeys = pstmtAlumno.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int idAlumno = generatedKeys.getInt(1);
                        
                        // Insertar notas
                        try (PreparedStatement pstmtNotas = conn.prepareStatement(sqlNotas)) {
                for (Object[] nota : notas) {
                    int idModulo = (int) nota[0];
                    Double nota1ev = (Double) nota[1];
                    Double nota2ev = (Double) nota[2];
                    Double nota3ev = (Double) nota[3];
                    Double notaFinal = (Double) nota[4];

                    pstmtNotas.setInt(1, idAlumno);
                    pstmtNotas.setInt(2, idModulo);
                    
                    // Manejo de notas (pueden ser null)
                    setDoubleOrNull(pstmtNotas, 3, nota1ev);
                    setDoubleOrNull(pstmtNotas, 4, nota2ev);
                    setDoubleOrNull(pstmtNotas, 5, nota3ev);
                    setDoubleOrNull(pstmtNotas, 6, notaFinal);
                    
                    pstmtNotas.executeUpdate();
                }
            }
                    }
                }
            }
            conn.commit(); // Confirmar transacción
            System.out.println("Datos insertados correctamente");
            
        } catch (SQLException e) {
            System.err.println("Error en la inserción: " + e.getMessage());
            try {
                if (connection != null) connection.rollback();
            } catch (SQLException ex) {
                System.err.println("Error en rollback: " + ex.getMessage());
            }
        }
    }
private static void setDoubleOrNull(PreparedStatement pstmt, int index, Double value) throws SQLException {
        if (value != null) {
            pstmt.setDouble(index, value);
        } else {
            pstmt.setNull(index, Types.DECIMAL);
        }
    }
    

    // Clase de registro para notas (Java 16+)
   
    public static void main(String[] args) {
        new DatabaseManager().insertarAlumnoCompleto();
    }
}
