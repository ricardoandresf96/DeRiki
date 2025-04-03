package gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JPanel;

public class ProfeModificar extends javax.swing.JPanel {

    private int alumnoID;

    public void setAlumnoID(int alumnoID) {
        this.alumnoID = alumnoID;
        changeTheDestiny();
    }

    public void changeTheDestiny() {
        try (Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gestion_notas", "root", "alumno")) {
            System.out.println("¡Conexión exitosa!");

            Statement stmt = conn.createStatement();
            String query = "SELECT nombre, apellidos, edad, numero_alumno, id_ciclo, curso, fecha_matricula FROM alumno WHERE id_alumno = " + alumnoID;
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                tNombre.setText(rs.getString("nombre"));
                tApellidos.setText(rs.getString("apellidos"));
                tEdad.setText(String.valueOf(rs.getInt("edad"))); // Convertir int a String
                tNIA.setText(rs.getString("numero_alumno"));
                tCurso.setText(rs.getString("curso"));       // Intercambié estas dos etiquetas
                tCiclo.setText(String.valueOf(rs.getInt("id_ciclo"))); // Convertir int a String
                tFecha.setText(rs.getDate("fecha_matricula").toString()); // Formatear fecha
            } else {
                System.out.println("No se encontró alumno con ID: " + alumnoID);
            }
        } catch (SQLException e) {
            System.err.println("Error de conexión SQL: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void insertarNotaSimple() {
        String nota1 = tNota1.getText();
        String nota2 = tNota2.getText();
        String nota3 = tNota3.getText();
        String notaf = tNota4.getText();
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/gestion_notas", "root", "alumno"); Statement stmt = conn.createStatement()) {

            String sql = "INSERT INTO notas (id_alumno, id_modulo, nota_1ev, nota_2ev, nota_3ev, nota_final) "
                    + "VALUES (" + this.alumnoID + ", " + tModuli.getText() + ", "
                    + (nota1 != null ? nota1 : "NULL") + ", "
                    + (nota2 != null ? nota2 : "NULL") + ", "
                    + (nota3 != null ? nota3 : "NULL") + ", "
                    + (notaf != null ? notaf : "NULL") + ")";

            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ProfeModificar() {
        initComponents();
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
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        botonModData = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        botonModNotas = new javax.swing.JButton();
        tNombre = new javax.swing.JTextField();
        tEdad = new javax.swing.JTextField();
        tNIA = new javax.swing.JTextField();
        tCurso = new javax.swing.JTextField();
        tApellidos = new javax.swing.JTextField();
        tFecha = new javax.swing.JTextField();
        tContrseña = new javax.swing.JTextField();
        tCiclo = new javax.swing.JTextField();
        tNota4 = new javax.swing.JTextField();
        tModuli = new javax.swing.JTextField();
        tNota1 = new javax.swing.JTextField();
        tNota2 = new javax.swing.JTextField();
        tNota3 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();

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

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(30, 30, 30));
        jLabel17.setText("Modulo");

        jLabel19.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(30, 30, 30));
        jLabel19.setText("Nota 1ª EV");

        jLabel21.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(30, 30, 30));
        jLabel21.setText("Nota 2");

        jLabel23.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(30, 30, 30));
        jLabel23.setText("Nota 3");

        botonModData.setText("Modif");
        botonModData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModDataActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Notas");

        jLabel25.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(30, 30, 30));
        jLabel25.setText("Nota Final:");

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(30, 30, 30));
        jLabel18.setText("Contaseña");

        botonModNotas.setText("Modif");
        botonModNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModNotasActionPerformed(evt);
            }
        });

        tNombre.setText("jTextField1");
        tNombre.setEnabled(false);

        tEdad.setText("jTextField1");
        tEdad.setEnabled(false);

        tNIA.setText("jTextField1");
        tNIA.setEnabled(false);

        tCurso.setText("jTextField1");
        tCurso.setEnabled(false);

        tApellidos.setText("jTextField1");
        tApellidos.setEnabled(false);

        tFecha.setText("jTextField1");
        tFecha.setEnabled(false);

        tContrseña.setText("jTextField1");
        tContrseña.setEnabled(false);

        tCiclo.setText("jTextField1");
        tCiclo.setEnabled(false);

        tNota4.setText("jTextField1");

        tModuli.setText("jTextField1");

        tNota1.setText("jTextField1");

        tNota2.setText("jTextField1");

        tNota3.setText("jTextField1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(32, 32, 32)
                        .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(195, 195, 195))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(tCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(30, 30, 30)
                                .addComponent(tApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(botonModData))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tNIA, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonModNotas)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(tModuli, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(tNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel23)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tNota4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(tFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tContrseña, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(731, Short.MAX_VALUE)
                    .addComponent(tNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(54, 54, 54)))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(685, Short.MAX_VALUE)
                    .addComponent(tNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(100, 100, 100)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(tModuli, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(tNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(tNota4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tNIA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(tCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(tFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tContrseña, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(122, 122, 122)
                    .addComponent(tNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(386, Short.MAX_VALUE)))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(224, 224, 224)
                    .addComponent(tNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(284, Short.MAX_VALUE)))
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 540));

        jButton10.setText("VALIDAR");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 900, 80));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        insertarNotaSimple();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void botonModDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModDataActionPerformed
        tApellidos.setEnabled(true);
        tNombre.setEnabled(true);
        tCiclo.setEnabled(true);
        tCurso.setEnabled(true);
        tEdad.setEnabled(true);
        tNIA.setEnabled(true);
        tFecha.setEnabled(true);

// TODO add your handling code here:
    }//GEN-LAST:event_botonModDataActionPerformed

    private void botonModNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModNotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonModNotasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonModData;
    private javax.swing.JButton botonModNotas;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField tApellidos;
    private javax.swing.JTextField tCiclo;
    private javax.swing.JTextField tContrseña;
    private javax.swing.JTextField tCurso;
    private javax.swing.JTextField tEdad;
    private javax.swing.JTextField tFecha;
    private javax.swing.JTextField tModuli;
    private javax.swing.JTextField tNIA;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tNota1;
    private javax.swing.JTextField tNota2;
    private javax.swing.JTextField tNota3;
    private javax.swing.JTextField tNota4;
    // End of variables declaration//GEN-END:variables
}
