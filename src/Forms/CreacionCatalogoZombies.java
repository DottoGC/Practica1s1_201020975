/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Forms;

import static Forms.CreacionCatalogoPlantas.jListTipoDePlantas;
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Catalogo Zombies");

        JListTiposZombies.setAutoscrolls(false);
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

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(btnCrearZombie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGuardarCatalogo)
                .addGap(242, 242, 242))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearZombie)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(btnGuardarCatalogo)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCatalogoActionPerformed
        
        MainForm.listaCatalogoZombiesMAIN.recorrerListaCatalogoZombies();
        
        Forms.FRAMEJUEGO.filasMatriz=Integer.valueOf(JOptionPane.showInputDialog("EL JUEGO ESTA LISTO! \n INGRESE NUMERO DE FILAS DEL TABLERO QUE DESEE"));
        Forms.FRAMEJUEGO.columnasMatriz=Integer.valueOf(JOptionPane.showInputDialog("INGRESE NUMERO DE COLUMNAS DEL TABLERO QUE DESEE"));
        JOptionPane.showMessageDialog(null, "COMIENZA EL JUEGO!!!");
        System.out.println("Tamano de la matriz: "+Forms.FRAMEJUEGO.filasMatriz+"X"+Forms.FRAMEJUEGO.columnasMatriz);
        
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(JListTiposZombies.isSelectionEmpty()){
            
            //System.out.print("Index seleccionado: "+item);
            //System.out.print("Index seleccionado: "+item);
            
            JOptionPane.showMessageDialog(null, "No hay ningun ZOMBIE en la lista para Editar. Oh Asegurese de seleccionar uno de la lista!!");
        
        }else{          
            /**
             NECESITARE MANDARLE EL ITEM SELECCIONADO DE NUESTRO JLISTO CONTENEDOR DE LA INFORMACION DE NUESTRO CATALOGO
             */
            int item;
            item=JListTiposZombies.getSelectedIndex();
            
            //System.out.println("ITEM ES: "+item);
            
            Forms.EditarCatalogoZombies.indice=item;
            
            EditarCatalogoZombies v=new EditarCatalogoZombies();           
            v.show();
            
            
            
        }
        

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Clases.Metodos.eliminarZombie(JListTiposZombies.getSelectedIndex());
        System.out.println("Tamano Intem Seleccionado");

// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables
}
