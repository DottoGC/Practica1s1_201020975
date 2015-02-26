/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Forms;

import Clases.Metodos;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author androide17
 */
public class EditarCatalogoPlantas extends javax.swing.JFrame {
    boolean imagcarg=false;
   public static int indice;
   
    Clases.Plant pl;
    
    File archivo;
    String nombreFile;
    /**
     * Creates new form EditarCatalogoPlantas
     */

    public EditarCatalogoPlantas() {
        initComponents();
                
        //System.out.println("Indice sseleccioado"+indice);
        pl=Metodos.obtenerInformacionPlantaParaEditar(indice);
        
        txtAtack.setText(String.valueOf(pl.getPointsOfAtack()));
        txtDefenze.setText(String.valueOf(pl.getPointsOfDefense()));
        txtName.setText(pl.getNamePlant());
        
        ImageIcon tmpIconAux = new ImageIcon(getClass().getResource(pl.getPicturePlant()));
        ImageIcon tmpIcon = new ImageIcon(tmpIconAux.getImage().getScaledInstance(lblPicture.getWidth(), lblPicture.getHeight(), Image.SCALE_DEFAULT));
        lblPicture.setIcon(tmpIcon);  
        
        
        
        if(pl.getMode()=='D'){
            cmbMode.setSelectedIndex(0);
        }else{
         cmbMode.setSelectedIndex(1);
        }
        
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
        lblPicture = new javax.swing.JLabel();
        btncargarimagen = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAtack = new javax.swing.JTextField();
        txtDefenze = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        cmbMode = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setText("Editar Planta");

        lblPicture.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btncargarimagen.setText("Cargar Imagen");
        btncargarimagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargarimagenActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jLabel4.setText("Puntos Ataque:");

        jLabel5.setText("Puntos Defenza:");

        jLabel6.setText("Modo:");

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cmbMode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disparo", "Ataque" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncargarimagen))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(3, 3, 3)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(2, 2, 2)
                                    .addComponent(txtAtack))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDefenze))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cmbMode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAtack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDefenze, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(38, 38, 38)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btncargarimagen)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (imagcarg==false) {
                      JOptionPane.showMessageDialog(null, "TIENE QUE ACTUALIZAR LA IMAGEN");
        }else{
                CreacionCatalogoPlantas.modeloLista.clear();
        
        int indexSelected=cmbMode.getSelectedIndex();
        
        char tipo;
        if (indexSelected==0) {//Disparo
           tipo='D';
        }else{
            tipo='A';
        }
        
        
        //System.out.println("INDEX SELECTED: "+indexSelected);
        
        Listas.Nodo auxNodo;
        auxNodo=MainForm.listaCatalogoPlntasMAIN.getFirstNodo();
        int i=0;
                        while( auxNodo != null ){        

                            Listas.Nodo nodoPlantaAux;
                            nodoPlantaAux=(Listas.Nodo)auxNodo.getObjetoGuardado();
                            Clases.Plant planta;
                            planta=(Clases.Plant)nodoPlantaAux.getObjetoGuardado();
                           
                            if(indice==i){
                                planta.setPicturePlant("/Others/"+nombreFile);
                                planta.setNamePlant(txtName.getText());
                                planta.setPointsOfAtack(Integer.valueOf(txtAtack.getText()));
                                planta.setPointsOfDefense(Integer.valueOf(txtDefenze.getText()));
                                planta.setMode(tipo);
                                
                                //System.out.println("PLANTA_IMG: "+planta.getPicturePlant()+" NAME: "+ planta.getNamePlant()+ " ATAQUE: " + planta.getPointsOfAtack()+" DEFENZA: "+planta.getPointsOfDefense()+" MODE: "+planta.getMode());
                                
                            }else{
                                 //System.out.println("PLANTA_IMG: "+planta.getPicturePlant()+" NAME: "+ planta.getNamePlant()+ " ATAQUE: " + planta.getPointsOfAtack()+" DEFENZA: "+planta.getPointsOfDefense()+" MODE: "+planta.getMode());
                                        
                            }
                            
                            CreacionCatalogoPlantas.modeloLista.addElement(planta.getNamePlant()+" Ataque: "+planta.getPointsOfAtack()+" Defenza: "+planta.getPointsOfDefense()+" Modo: "+planta.getMode() );
                            auxNodo = auxNodo.getSiguenteNodo();
                            i=i+1;
                            //System.out.println("TAMA;O CATALOGO PLANTAS"+MainForm.listaCatalogoPlntasMAIN.getLengthList());

                        }
                        
                        dispose();
                        
                        CreacionCatalogoPlantas.jListTipoDePlantas.setModel(CreacionCatalogoPlantas.modeloLista);
                        
        
        }
    
        
        
        
        
        
        
        
        
        

       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btncargarimagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargarimagenActionPerformed
imagcarg=true;
        
        try {
        abrir();
    } catch (IOException | InterruptedException ex) {
        Logger.getLogger(CreacionCatalogoPlantas2.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    SwingUtilities.updateComponentTreeUI(this);//ACTUALIZAMOS DATOS DE NUESTRO FORMULARIO
    
        btncargarimagen.setVisible(false);

        //System.out.println("Path archivo: ver "+archivo.getAbsolutePath().toString());
                ImageIcon tmpIconAux = new ImageIcon(getClass().getResource("/Others/"+nombreFile));
                ImageIcon tmpIcon = new ImageIcon(tmpIconAux.getImage().getScaledInstance(lblPicture.getWidth(), lblPicture.getHeight(), Image.SCALE_DEFAULT));
                lblPicture.setIcon(tmpIcon);        // TODO add your handling code here:
    }//GEN-LAST:event_btncargarimagenActionPerformed

        
public void abrir() throws IOException, InterruptedException {
JFileChooser selector = new JFileChooser();//Instanciamos un objeto de la clase JFileChooser
selector.addChoosableFileFilter(new FileNameExtensionFilter("All Files", "jpg","png"));//Filtro que nos muestra archivos con extension .game

int open = selector.showDialog(null, "Abrir");
    
    if (open == JFileChooser.APPROVE_OPTION) {
    FileReader lector = null;
    BufferedReader lectorAyudante = null;

        try {
        archivo = selector.getSelectedFile();
        String PATH = selector.getSelectedFile().getAbsolutePath();//En caso de abrir un archivo que no sea de la misma extencion no se podra abrir
            
            
        if(PATH.endsWith(".jpg")){
            
        nombreFile=selector.getSelectedFile().getName();

       // System.out.println("Path: "+PATH);
        //System.out.println("Name: "+selector.getSelectedFile().getName());
        
            }else{
                JOptionPane.showMessageDialog(this, "No se reconoce el archivo","ERROR de extencion del archivo", JOptionPane.ERROR_MESSAGE);
                abrir();
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if(null!= lector){
                    lector.close();
                }
            } catch (IOException ex) {
            ex.printStackTrace();
            }
        }
    }
}

   
    
    
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
            java.util.logging.Logger.getLogger(EditarCatalogoPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarCatalogoPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarCatalogoPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarCatalogoPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarCatalogoPlantas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncargarimagen;
    private javax.swing.JComboBox cmbMode;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JTextField txtAtack;
    private javax.swing.JTextField txtDefenze;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}