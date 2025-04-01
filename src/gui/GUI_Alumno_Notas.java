/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

/**
 *
 * @author Eliabe
 */
public class GUI_Alumno_Notas extends javax.swing.JPanel {

    /**
     * Creates new form GUI_Alumno_Notas
     */
    public GUI_Alumno_Notas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNotas = new javax.swing.JPanel();
        panelNotasBaseEntornosProgra = new javax.swing.JPanel();
        textBBBD = new javax.swing.JLabel();
        textEntornos = new javax.swing.JLabel();
        textProgramacion = new javax.swing.JLabel();
        textNotaBBDD = new javax.swing.JTextField();
        textNotaEntornos = new javax.swing.JTextField();
        textNotaProgramacion = new javax.swing.JTextField();
        panelNotaFinal = new javax.swing.JPanel();
        textFinal = new javax.swing.JLabel();
        textNotaFinall = new javax.swing.JTextField();
        labelDisplayMateria = new javax.swing.JLabel();
        panelSysdate = new javax.swing.JPanel();
        textSysdate = new javax.swing.JTextField();
        botonVolver = new javax.swing.JButton();
        panelOpciones = new javax.swing.JPanel();
        panelBotones = new javax.swing.JPanel();
        botonTodasMaterias = new javax.swing.JButton();
        botonBBDD = new javax.swing.JButton();
        botonEntornos = new javax.swing.JButton();
        botonProgramacion = new javax.swing.JButton();
        botonLenguajeM = new javax.swing.JButton();
        botonSistemas = new javax.swing.JButton();
        botonIPE = new javax.swing.JButton();

        setBackground(new java.awt.Color(65, 70, 80));
        setFocusable(false);
        setMaximumSize(new java.awt.Dimension(1500, 778));
        setMinimumSize(new java.awt.Dimension(1500, 778));
        setPreferredSize(new java.awt.Dimension(1500, 778));

        panelNotas.setMaximumSize(new java.awt.Dimension(1212, 800));

        panelNotasBaseEntornosProgra.setLayout(new java.awt.GridLayout(2, 3, 35, 10));

        textBBBD.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        textBBBD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textBBBD.setText("1º evaluación");
        textBBBD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNotasBaseEntornosProgra.add(textBBBD);

        textEntornos.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        textEntornos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textEntornos.setText("2º evaluación ");
        textEntornos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNotasBaseEntornosProgra.add(textEntornos);

        textProgramacion.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        textProgramacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textProgramacion.setText("3º evaluación");
        textProgramacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNotasBaseEntornosProgra.add(textProgramacion);

        textNotaBBDD.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        textNotaBBDD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textNotaBBDD.setText("0.0");
        textNotaBBDD.setFocusable(false);
        textNotaBBDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNotaBBDDActionPerformed(evt);
            }
        });
        panelNotasBaseEntornosProgra.add(textNotaBBDD);

        textNotaEntornos.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        textNotaEntornos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textNotaEntornos.setText("0.0");
        textNotaEntornos.setFocusable(false);
        textNotaEntornos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNotaEntornosActionPerformed(evt);
            }
        });
        panelNotasBaseEntornosProgra.add(textNotaEntornos);

        textNotaProgramacion.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        textNotaProgramacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textNotaProgramacion.setText("0.0");
        textNotaProgramacion.setFocusable(false);
        textNotaProgramacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNotaProgramacionActionPerformed(evt);
            }
        });
        panelNotasBaseEntornosProgra.add(textNotaProgramacion);

        panelNotaFinal.setLayout(new java.awt.GridLayout(2, 3, 35, 10));

        textFinal.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        textFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textFinal.setText("Nota final");
        textFinal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNotaFinal.add(textFinal);

        textNotaFinall.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        textNotaFinall.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textNotaFinall.setText("0.0");
        textNotaFinall.setFocusable(false);
        textNotaFinall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNotaFinallActionPerformed(evt);
            }
        });
        panelNotaFinal.add(textNotaFinall);

        labelDisplayMateria.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        labelDisplayMateria.setText("MATERIA");

        javax.swing.GroupLayout panelNotasLayout = new javax.swing.GroupLayout(panelNotas);
        panelNotas.setLayout(panelNotasLayout);
        panelNotasLayout.setHorizontalGroup(
            panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNotasLayout.createSequentialGroup()
                .addGroup(panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNotasLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(panelNotasBaseEntornosProgra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNotasLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(panelNotaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNotasLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(labelDisplayMateria)))
                .addGap(50, 50, 50))
        );
        panelNotasLayout.setVerticalGroup(
            panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNotasLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(labelDisplayMateria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNotasBaseEntornosProgra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNotaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        panelSysdate.setLayout(new java.awt.GridBagLayout());

        textSysdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textSysdate.setText("SYSDATE");
        textSysdate.setFocusable(false);
        panelSysdate.add(textSysdate, new java.awt.GridBagConstraints());

        botonVolver.setBackground(new java.awt.Color(51, 51, 51));
        botonVolver.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        botonVolver.setForeground(new java.awt.Color(255, 255, 255));
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonTodasMaterias.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        botonTodasMaterias.setText("Todas las materias");

        botonBBDD.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        botonBBDD.setText("Base de datos");

        botonEntornos.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        botonEntornos.setText("Entornos de desarrollo");

        botonProgramacion.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        botonProgramacion.setText("Programación");

        botonLenguajeM.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        botonLenguajeM.setText("Lenguaje de marcas");

        botonSistemas.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        botonSistemas.setText("Sistemas informáticos");

        botonIPE.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        botonIPE.setText("IPE");
        botonIPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIPEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonBBDD)
                    .addComponent(botonProgramacion)
                    .addComponent(botonLenguajeM)
                    .addComponent(botonEntornos)
                    .addComponent(botonIPE)
                    .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botonTodasMaterias)
                        .addComponent(botonSistemas)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonTodasMaterias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(botonIPE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonBBDD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonProgramacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonLenguajeM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonSistemas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonEntornos)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265)
                .addComponent(panelNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1179, Short.MAX_VALUE)
                .addComponent(panelSysdate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelSysdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(207, 207, 207)
                        .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(129, 129, 129))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textNotaBBDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNotaBBDDActionPerformed
        this.setBackground(new java.awt.Color(250, 183, 37));
    }//GEN-LAST:event_textNotaBBDDActionPerformed

    private void textNotaEntornosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNotaEntornosActionPerformed
        this.setBackground(new java.awt.Color(250, 183, 37));
    }//GEN-LAST:event_textNotaEntornosActionPerformed

    private void textNotaProgramacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNotaProgramacionActionPerformed
        this.setBackground(new java.awt.Color(250, 183, 37));
    }//GEN-LAST:event_textNotaProgramacionActionPerformed

    private void textNotaFinallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNotaFinallActionPerformed
        this.setBackground(new java.awt.Color(250, 183, 37));
    }//GEN-LAST:event_textNotaFinallActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.setBackground(new java.awt.Color(250, 183, 37));
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonIPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIPEActionPerformed
        this.setBackground(new java.awt.Color(250, 183, 37));
    }//GEN-LAST:event_botonIPEActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBBDD;
    private javax.swing.JButton botonEntornos;
    private javax.swing.JButton botonIPE;
    private javax.swing.JButton botonLenguajeM;
    private javax.swing.JButton botonProgramacion;
    private javax.swing.JButton botonSistemas;
    private javax.swing.JButton botonTodasMaterias;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel labelDisplayMateria;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelNotaFinal;
    private javax.swing.JPanel panelNotas;
    private javax.swing.JPanel panelNotasBaseEntornosProgra;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelSysdate;
    private javax.swing.JLabel textBBBD;
    private javax.swing.JLabel textEntornos;
    private javax.swing.JLabel textFinal;
    private javax.swing.JTextField textNotaBBDD;
    private javax.swing.JTextField textNotaEntornos;
    private javax.swing.JTextField textNotaFinall;
    private javax.swing.JTextField textNotaProgramacion;
    private javax.swing.JLabel textProgramacion;
    private javax.swing.JTextField textSysdate;
    // End of variables declaration//GEN-END:variables
}
