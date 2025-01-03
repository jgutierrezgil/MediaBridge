/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * abrirUrl.java
 *
 * Created on 28-jun-2010, 5:11:28
 */
package Interfaz;

import Reproductor.ElegirTipo;
import Reproductor.MedioStrategy;

/**
 *
 * @author Joaquín
 */
public class abrirUrl extends javax.swing.JFrame {

    Principal p;

    /** Creates new form abrirUrl */
    public abrirUrl() {
        
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        aceptarURL = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        campoURL = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Introduzca la URL del archivo que desea reproducir:");

        aceptarURL.setText("Aceptar");
        aceptarURL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptarURLMouseClicked(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoURL, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(aceptarURL)
                        .addGap(85, 85, 85)
                        .addComponent(cancelar)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(campoURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarURL)
                    .addComponent(cancelar))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarURLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarURLMouseClicked
        MedioStrategy medio = null;
        ElegirTipo elegir = new ElegirTipo();

        if (this.campoURL.getText().equals("")) {
            System.out.println("No ha introducido una direccion valida.");
        } else {

            p = new Principal();
            p.reproduceURL(this.campoURL.getText());
            /*
            medio = elegir.seleccionaURL(this.campoURL.getText());
            System.out.println(this.campoURL.getText());
            medio.runURL(this.campoURL.getText());
            p.setMedio(medio);
             * 
             */

        }

        this.setVisible(false);
    }//GEN-LAST:event_aceptarURLMouseClicked

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_cancelarMouseClicked
    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {

    public void run() {
    new abrirUrl().setVisible(true);
    }
    });
    }
     * 
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarURL;
    private javax.swing.JTextField campoURL;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
