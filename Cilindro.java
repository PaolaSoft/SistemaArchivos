/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TutoriasISO;

/**
 *
 * @author Paola
 */
public class Cilindro extends javax.swing.JFrame {

    /**
     * Creates new form Cilindro
     */
    public Cilindro() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        btnRegresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        ingles = new javax.swing.JButton();
        español = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Cilindro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, 30));

        jTextPane1.setEditable(false);
        jTextPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextPane1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTextPane1.setText("Es el conjunto de pistas concéntricas de cada cara de cada plato, los cuales están situadas unas encima de las otras. Lo que se logra con esto es que la cabeza no tiene que moverse para poder acceder a las diferentes pistas de un mismo cilindro. Dado que las cabezas de lectura/escritura están alineadas unas con otras, la controladora de disco duro puede escribir en todas las pistas del cilindro sin mover el rotor. Cada pista esta formada por uno o más cluster.\n\n\nTomado el 20/Agosto/18 de: [https://www.monografias.com/trabajos37/discos-duros/discos-duros2.shtml]");
        jTextPane1.setAutoscrolls(false);
        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 331, 250));

        btnRegresar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnRegresar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paola\\Pictures\\SO\\if_InterfaceExpendet-02_592613.png")); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(null);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 160, 40));

        btnSalir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paola\\Pictures\\SO\\if_free-29_618316.png")); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 150, 40));

        ingles.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paola\\Pictures\\SO\\eu.png")); // NOI18N
        ingles.setToolTipText("Ingles");
        ingles.setContentAreaFilled(false);
        ingles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inglesActionPerformed(evt);
            }
        });
        getContentPane().add(ingles, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 30, -1));

        español.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paola\\Pictures\\SO\\if_Spain_298518.png")); // NOI18N
        español.setContentAreaFilled(false);
        español.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                españolActionPerformed(evt);
            }
        });
        getContentPane().add(español, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 30, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paola\\Pictures\\SO\\disco-duro-12-638.jpg")); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(150, 249));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paola\\Pictures\\SO\\up2.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paola\\Pictures\\SO\\blanco2.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        //Tambien se puede poner
        //this.setVisible(false);

        FatTypes fat= new FatTypes();
        fat.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void inglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inglesActionPerformed
        // TODO add your handling code here:
        jTextPane1.setText("It is the set of concentric tracks of each face of each plate, which are located on top of each other. What is achieved with this is that the head does not have to move to access the different tracks of the same cylinder. Since the read / write heads are aligned with each other, the hard disk controller can write to all cylinder tracks without moving the rotor. Each track is formed by one or more clusters.\n" +
"\n" +
"\n" +
"Taken on 20 / August / 18 from: [https://www.monografias.com/trabajos37/discos-duros/discos-duros2.shtml]");

    }//GEN-LAST:event_inglesActionPerformed

    private void españolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_españolActionPerformed
        // TODO add your handling code here:
        jTextPane1.setText("Es el conjunto de pistas concéntricas de cada cara de cada plato, los cuales están situadas unas encima de las otras. Lo que se logra con esto es que la cabeza no tiene que moverse para poder acceder a las diferentes pistas de un mismo cilindro. Dado que las cabezas de lectura/escritura están alineadas unas con otras, la controladora de disco duro puede escribir en todas las pistas del cilindro sin mover el rotor. Cada pista esta formada por uno o más cluster.\n" +
"\n" +
"\n" +
"Tomado el 20/Agosto/18 de: [https://www.monografias.com/trabajos37/discos-duros/discos-duros2.shtml]");

    }//GEN-LAST:event_españolActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cilindro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cilindro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cilindro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cilindro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cilindro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton español;
    private javax.swing.JButton ingles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
