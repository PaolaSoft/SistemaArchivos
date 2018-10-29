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
public class FatTypes extends javax.swing.JFrame {

    /**
     * Creates new form FatTypes
     */
    public FatTypes() {
        initComponents();
    }

    /**
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        Descripcion = new javax.swing.JMenuItem();
        Pista = new javax.swing.JMenu();
        mPista = new javax.swing.JMenuItem();
        mSector = new javax.swing.JMenuItem();
        mCilindro = new javax.swing.JMenuItem();
        mCara = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        fat8 = new javax.swing.JMenuItem();
        fat12 = new javax.swing.JMenuItem();
        fat16 = new javax.swing.JMenuItem();
        fat32 = new javax.swing.JMenuItem();
        ntfs = new javax.swing.JMenuItem();
        exfat = new javax.swing.JMenuItem();
        Linux = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        Android = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        Ios = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        Wearables = new javax.swing.JMenu();
        Smarttv = new javax.swing.JMenuItem();
        Smartwatch = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        Acerca = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paola\\Pictures\\SO\\inicio.png")); // NOI18N

        jMenu3.setText("Sistema de Archivos");

        Descripcion.setText("Descripcion");
        Descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescripcionActionPerformed(evt);
            }
        });
        jMenu3.add(Descripcion);

        jMenuBar2.add(jMenu3);

        Pista.setText("Discos");

        mPista.setText("Pista");
        mPista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPistaActionPerformed(evt);
            }
        });
        Pista.add(mPista);

        mSector.setText("Sector");
        mSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSectorActionPerformed(evt);
            }
        });
        Pista.add(mSector);

        mCilindro.setText("Cilindro");
        mCilindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCilindroActionPerformed(evt);
            }
        });
        Pista.add(mCilindro);

        mCara.setText("Cara");
        mCara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCaraActionPerformed(evt);
            }
        });
        Pista.add(mCara);

        jMenuBar2.add(Pista);

        jMenu5.setText("Microsoft");

        fat8.setText("FAT8");
        fat8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fat8ActionPerformed(evt);
            }
        });
        jMenu5.add(fat8);

        fat12.setText("FAT12");
        fat12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fat12ActionPerformed(evt);
            }
        });
        jMenu5.add(fat12);

        fat16.setText("FAT16");
        fat16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fat16ActionPerformed(evt);
            }
        });
        jMenu5.add(fat16);

        fat32.setText("FAT32");
        fat32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fat32ActionPerformed(evt);
            }
        });
        jMenu5.add(fat32);

        ntfs.setText("NTFS");
        ntfs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ntfsActionPerformed(evt);
            }
        });
        jMenu5.add(ntfs);

        exfat.setText("ExFAT");
        exfat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exfatActionPerformed(evt);
            }
        });
        jMenu5.add(exfat);

        jMenuBar2.add(jMenu5);

        Linux.setText("Linux/Unix");

        jMenuItem2.setText("Informaciòn");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Linux.add(jMenuItem2);

        jMenuBar2.add(Linux);

        Android.setText("Android");
        Android.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AndroidActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Informaciòn");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Android.add(jMenuItem1);

        jMenuBar2.add(Android);

        Ios.setText("iOS");

        jMenuItem3.setText("Informaciòn");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Ios.add(jMenuItem3);

        jMenuBar2.add(Ios);

        Wearables.setText("Wearables");

        Smarttv.setText("Smart TV");
        Smarttv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmarttvActionPerformed(evt);
            }
        });
        Wearables.add(Smarttv);

        Smartwatch.setText("Smart Watch");
        Smartwatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmartwatchActionPerformed(evt);
            }
        });
        Wearables.add(Smartwatch);

        jMenuBar2.add(Wearables);

        jMenu10.setText("¿Quienes somos?");

        Acerca.setText("Acerca de");
        Acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcercaActionPerformed(evt);
            }
        });
        jMenu10.add(Acerca);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem13.setText("Salir");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem13);

        jMenuBar2.add(jMenu10);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Metodo para invocar el formulario de la descripcion
    private void DescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescripcionActionPerformed
        
        Descripcion des= new Descripcion();
        des.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_DescripcionActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        //Salir
        System.exit(0);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void mPistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPistaActionPerformed

        Pista pis= new Pista();
        pis.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_mPistaActionPerformed

    private void mSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSectorActionPerformed
        
        Sector sec= new Sector();
        sec.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_mSectorActionPerformed

    private void mCilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCilindroActionPerformed
        
        Cilindro cil= new Cilindro();
        cil.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_mCilindroActionPerformed

    private void mCaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCaraActionPerformed
        
        Cara car= new Cara();
        car.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_mCaraActionPerformed

    private void fat8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fat8ActionPerformed
        
        Fat8 f8= new Fat8();
        f8.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_fat8ActionPerformed

    private void fat12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fat12ActionPerformed
        
        Fat12 f12= new Fat12();
        f12.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_fat12ActionPerformed

    private void fat16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fat16ActionPerformed
        
        Fat16 f16= new Fat16();
        f16.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_fat16ActionPerformed

    private void fat32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fat32ActionPerformed
        
        Fat32 f32= new Fat32();
        f32.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_fat32ActionPerformed

    private void ntfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ntfsActionPerformed
        
        Ntfs nt= new Ntfs();
        nt.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_ntfsActionPerformed

    private void exfatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exfatActionPerformed
        
        Exfat exf= new Exfat();
        exf.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_exfatActionPerformed

    private void SmarttvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmarttvActionPerformed
        // TODO add your handling code here:
        Smarttv exf= new Smarttv();
        exf.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_SmarttvActionPerformed

    private void SmartwatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmartwatchActionPerformed
        // TODO add your handling code here:
        SmartWatch exf= new SmartWatch();
        exf.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_SmartwatchActionPerformed

    private void AcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcercaActionPerformed
        // TOD
        Acerca exf= new Acerca();
        exf.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_AcercaActionPerformed

    private void AndroidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AndroidActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_AndroidActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Ios exf= new Ios();
        exf.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Android exf= new Android();
        exf.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Linux exf = new Linux();
        exf.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * 
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
            java.util.logging.Logger.getLogger(FatTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FatTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FatTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FatTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FatTypes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Acerca;
    private javax.swing.JMenu Android;
    private javax.swing.JMenuItem Descripcion;
    private javax.swing.JMenu Ios;
    private javax.swing.JMenu Linux;
    private javax.swing.JMenu Pista;
    private javax.swing.JMenuItem Smarttv;
    private javax.swing.JMenuItem Smartwatch;
    private javax.swing.JMenu Wearables;
    private javax.swing.JMenuItem exfat;
    private javax.swing.JMenuItem fat12;
    private javax.swing.JMenuItem fat16;
    private javax.swing.JMenuItem fat32;
    private javax.swing.JMenuItem fat8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem mCara;
    private javax.swing.JMenuItem mCilindro;
    private javax.swing.JMenuItem mPista;
    private javax.swing.JMenuItem mSector;
    private javax.swing.JMenuItem ntfs;
    // End of variables declaration//GEN-END:variables
}
