/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Eliabi�o
 */
public class GUI_Menu extends javax.swing.JFrame {

    
    public GUI_Menu() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        botonCreditos = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        botonEmpezar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Maracandacas");

        Fondo.setBackground(new java.awt.Color(65, 70, 80));
        Fondo.setPreferredSize(new java.awt.Dimension(800, 800));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoIES.jpg"))); // NOI18N
        Logo.setToolTipText("");
        Logo.setFocusable(false);

        botonCreditos.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        botonCreditos.setText("Cr�ditos");
        botonCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCreditosActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        Titulo.setText("Visualizador de notas");

        botonEmpezar1.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        botonEmpezar1.setText("Empezar");
        botonEmpezar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpezar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(Titulo))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(Logo))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonEmpezar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonCreditos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(190, 190, 190))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Titulo)
                .addGap(36, 36, 36)
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(botonEmpezar1)
                .addGap(18, 18, 18)
                .addComponent(botonCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonSalir)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCreditosActionPerformed
        JOptionPane.showMessageDialog(null, "Elliabe was here");
    }//GEN-LAST:event_botonCreditosActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
         dispose();
    }//GEN-LAST:event_botonSalirActionPerformed
    
    /**
 * Mostra um painel na tela.
 * 
 * @param jp O painel (JPanel) que ser� mostrado.
 * 
 * Primeiro, ele ajusta o tamanho e posi��o do painel.  
 * Depois, limpa o fundo e adiciona o novo painel.  
 * Usa setPreferredSize() e pack() para ajustar o tamanho certinho.
 * 
 * @see #getFondo() // Precisa usar getFondo() porque "fondo" � privado.
 */
public void showMe(JPanel jp) {
    
    // Coloca o painel na posi��o (0,0)
    jp.setLocation(0, 0);
    
    // Ajusta o tamanho do painel
    jp.setSize(jp.getPreferredSize());

    // Remove tudo que tem no fundo
    getFondo().removeAll();

    // Deixa o fundo do mesmo tamanho do painel
    getFondo().setPreferredSize(jp.getPreferredSize());
    
    // Ajusta o tamanho da janela
    pack();

    // Adiciona o painel no fundo
    getFondo().add(jp);
    
    // Atualiza a tela
    getFondo().revalidate();
    getFondo().repaint();
}
    
    
    private void botonEmpezar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpezar1ActionPerformed
      showMe(new GUI_Login());
    }//GEN-LAST:event_botonEmpezar1ActionPerformed
    
    /**
    * @see getFondo()
    * @return el fondo
    */
    public JPanel getFondo(){
        return this.Fondo;
        }

    
    public static void main(String[] args) {
        new GUI_Menu().setVisible(true);
        
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton botonCreditos;
    private javax.swing.JButton botonEmpezar1;
    private javax.swing.JButton botonSalir;
    // End of variables declaration//GEN-END:variables
}
