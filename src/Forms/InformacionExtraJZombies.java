/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Forms;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author androide17
 */
public class InformacionExtraJZombies extends javax.swing.JFrame {
        
    public Clases.Gamer jugadorZombie;
    public String nombreJugador;
    public int cantidadZombies;
    
    DefaultListModel modeloLista=new DefaultListModel();//LO UTILIZAMOS PARA SETEAR EL MODELO QUE USA EL JLIST DEL FORMULARIO
    ArrayList listNewsAtribs = new ArrayList(); //ES EL ARRAYLIST DE TODOS LOS NUEVOS ATRUBUTOS INGREDOS DEL JUGADOR

    /**
     * Creates new form InformacionExtraJZombies
     */
    public InformacionExtraJZombies() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAtrib = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListNewAtribs = new javax.swing.JList();
        btnAdd = new javax.swing.JButton();
        btnTerminarRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingreso de Inforamacion Extra");

        jLabel2.setText("Jugador Zombie");

        jLabel3.setText("Atributo:");

        jScrollPane1.setViewportView(jListNewAtribs);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnTerminarRegistro.setText("Terminar Registro");
        btnTerminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTerminarRegistro)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAdd)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtAtrib))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAtrib, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTerminarRegistro)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        modeloLista.addElement(txtAtrib.getText());
        listNewsAtribs.add(txtAtrib.getText());
        
        jListNewAtribs.setModel(modeloLista);
        txtAtrib.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnTerminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarRegistroActionPerformed
    /**
     * Para terminar el proceso procedemos a crear nuestro jugador mandandole los tres campos necesarios,
    * 1. NombreJugadro
    * 2. Cantidad
    * 4. Lista de otros atributos infinitos a ingresar
    */ 
                jugadorZombie=new Clases.Gamer('Z',nombreJugador,cantidadZombies, listNewsAtribs);
                //System.out.println("Tipo: "+jugadorZombie.getTipo()+" NickNombre: "+jugadorZombie.getName()+" Cantidad de Plantas: "+jugadorZombie.getQuantity()+" NewsAtrib: "+listNewsAtribs.size());
               
                Listas.Nodo nodoJugadorParaLaLista= new Listas.Nodo(jugadorZombie);
                Forms.MainForm.listaJugadoresMAIN.add(nodoJugadorParaLaLista);
                
               // System.out.println("Agregado a ListaJugadores de Tamano: "+Forms.MainForm.listaJugadoresMAIN.getLengthList());
                
                JOptionPane.showMessageDialog(null, "Jugador Registrado Satisfactoriamente");
                dispose();  
                // TODO add your handling code here:
    }//GEN-LAST:event_btnTerminarRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionExtraJZombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionExtraJZombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionExtraJZombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionExtraJZombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionExtraJZombies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnTerminarRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jListNewAtribs;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAtrib;
    // End of variables declaration//GEN-END:variables
}