/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Forms;

import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author androide17
 */
public class CreacionCatalogoZombies extends javax.swing.JFrame {
public static DefaultListModel modeloLista=new DefaultListModel();//LO UTILIZA
    /**
     * Creates new form CreacionCatalogoZombies
     */
    public CreacionCatalogoZombies() {
        initComponents();
        
        
                ImageIcon tmpIconAux = new ImageIcon(getClass().getResource("/Others/fondoZombies.jpg"));
        ImageIcon tmpIcon = new ImageIcon(tmpIconAux.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
        lblFondo.setIcon(tmpIcon); 
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        JListTiposZombies = new javax.swing.JList();
        btnCrearZombie = new javax.swing.JButton();
        btnGuardarCatalogo = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Catalogo Zombies");

        jScrollPane1.setViewportView(JListTiposZombies);

        btnCrearZombie.setText("Crear Nuevo");
        btnCrearZombie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearZombieActionPerformed(evt);
            }
        });

        btnGuardarCatalogo.setText("Guardar Catalogo");
        btnGuardarCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCatalogoActionPerformed(evt);
            }
        });

        lblFondo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrearZombie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardarCatalogo)
                .addGap(149, 149, 149))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCatalogo)
                    .addComponent(btnCrearZombie))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCatalogoActionPerformed
        
        MainForm.listaCatalogoZombiesMAIN.recorrerListaCatalogoZombies();
        
        String tamanoMatriz;
        tamanoMatriz=JOptionPane.showInputDialog("EL JUEGO YA CASI ESTA LISTO. SOLO NECESITAMOS QUE INGRESE EL TAMANO QUE DESEE QUE TENGA EL TABLERO (nxn)");
        System.out.println("Tamano de la matriz: "+tamanoMatriz);
        
        Forms.FRAMEJUEGO vee=new Forms.FRAMEJUEGO();
        vee.show();
        
        
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarCatalogoActionPerformed

    private void btnCrearZombieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearZombieActionPerformed
        Forms.CreacionCatalogoZombies2 v=new Forms.CreacionCatalogoZombies2();
        v.show();
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnCrearZombieActionPerformed

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
            java.util.logging.Logger.getLogger(CreacionCatalogoZombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreacionCatalogoZombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreacionCatalogoZombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreacionCatalogoZombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreacionCatalogoZombies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JList JListTiposZombies;
    private javax.swing.JButton btnCrearZombie;
    private javax.swing.JButton btnGuardarCatalogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables
}
