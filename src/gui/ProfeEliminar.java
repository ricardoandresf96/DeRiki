package gui;

import java.sql.*;
import javax.swing.JPanel;

public class ProfeEliminar extends javax.swing.JPanel {

    private int alumnoID;

    public void setAlumnoID(int alumnoID) {
        this.alumnoID = alumnoID;
        changeTheDestiny();
    }

    public ProfeEliminar() {
        initComponents();

    }

    public void changeTheDestiny() {
        try (Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gestion_notas", "root", "alumno")) {
            System.out.println("¡Conexión exitosa!");

            Statement stmt = conn.createStatement();
            String query = "SELECT nombre, apellidos, edad, numero_alumno, id_ciclo, curso, fecha_matricula FROM alumno WHERE id_alumno = " + alumnoID;
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                labelNombre.setText(rs.getString("nombre"));
                labelApellidos.setText(rs.getString("apellidos"));
                labelEdad.setText(String.valueOf(rs.getInt("edad"))); // Convertir int a String
                labelNia.setText(rs.getString("numero_alumno"));
                labelCurso.setText(rs.getString("curso"));       // Intercambié estas dos etiquetas
                labelCiclos.setText(String.valueOf(rs.getInt("id_ciclo"))); // Convertir int a String
                labelFecha.setText(rs.getDate("fecha_matricula").toString()); // Formatear fecha
            } else {
                System.out.println("No se encontró alumno con ID: " + alumnoID);
            }
        } catch (SQLException e) {
            System.err.println("Error de conexión SQL: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        labelApellidos = new javax.swing.JLabel();
        labelNia = new javax.swing.JLabel();
        labelCiclos = new javax.swing.JLabel();
        labelCurso = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelEdad = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(900, 620));
        setMinimumSize(new java.awt.Dimension(900, 620));
        setPreferredSize(new java.awt.Dimension(900, 620));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(60, 170, 50));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(30, 30, 30));
        jLabel7.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(30, 30, 30));
        jLabel8.setText("Apellidos:");

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(30, 30, 30));
        jLabel9.setText("Edad:");

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(30, 30, 30));
        jLabel11.setText("NIA:");

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(30, 30, 30));
        jLabel13.setText("Ciclo:");

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(30, 30, 30));
        jLabel15.setText("Curso:");

        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(30, 30, 30));
        jLabel16.setText("Fecha Matricula:");

        labelApellidos.setText("jLabel1");

        labelNia.setText("jLabel1");

        labelCiclos.setText("jLabel1");

        labelCurso.setText("jLabel1");

        labelFecha.setText("jLabel1");

        labelNombre.setText("jLabel1");

        labelEdad.setText("jLabel1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 446, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(labelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(labelApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNia, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCiclos, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(labelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(12, 12, 12)
                        .addComponent(labelApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(labelEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelNia, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCiclos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        botonEliminar.setText("ELIMINAR DATOS");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 900, 80));
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/gestion_notas", "root", "alumno"); Statement stmt = conn.createStatement()) {
            stmt.executeUpdate("DELETE FROM notas WHERE id_alumno = " + this.alumnoID);
            stmt.executeUpdate("DELETE FROM alumno WHERE id_alumno = " + this.alumnoID);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_botonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelCiclos;
    private javax.swing.JLabel labelCurso;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelNia;
    private javax.swing.JLabel labelNombre;
    // End of variables declaration//GEN-END:variables
}
