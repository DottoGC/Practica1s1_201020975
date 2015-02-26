/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Forms;

import Clases.Metodos;
import static Forms.EditarCatalogoPlantas.indice;
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
public class EditarCatalogoZombies extends javax.swing.JFrame {
    public boolean imagencargada=false;
    
   public static int indice;
   
    Clases.Zombie pl;
    
    File archivo;
    String nombreFile;
    /**
     * Creates new form EditarCatalogoZombies
     */
    public EditarCatalogoZombies() {
        initComponents();
                //System.out.println("Indice sseleccioado"+indice);
        pl=Metodos.obtenerInformacionZombieParaEditar(indice);
        
        txtAtaque.setText(String.valueOf(pl.getPointsOfAtack()));
        txtDefenza.setText(String.valueOf(pl.getPointsOfDefense()));
        txtName.setText(pl.getNameZombie());
        
        ImageIcon tmpIconAux = new ImageIcon(getClass().getResource(pl.getPictureZombie()));
        ImageIcon tmpIcon = new ImageIcon(tmpIconAux.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
        lblImagen.setIcon(tmpIcon);  
        
        
        
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

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        btnCargarImage = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAtaque = new javax.swing.JTextField();
        txtDefenza = new javax.swing.JTextField();
        cmbMode = new javax.swing.JComboBox();
        btnActualizar = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setText("Editar Zombie");

        lblImagen.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCargarImage.setText("Cargar Imagen");
        btnCargarImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarImageActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Puntos de Ataque:");

        jLabel4.setText("Puntos de Defenza:");

        jLabel5.setText("Modo:");

        cmbMode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disaparo", "Ataque", " " }));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCargarImage)
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDefenza, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbMode, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtDefenza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(73, 73, 73)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarImage))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarImageActionPerformed
    imagencargada=true;
        
        try {
        abrir();
    } catch (IOException | InterruptedException ex) {
        Logger.getLogger(CreacionCatalogoPlantas2.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    SwingUtilities.updateComponentTreeUI(this);//ACTUALIZAMOS DATOS DE NUESTRO FORMULARIO
    
        btnCargarImage.setVisible(false);

        //System.out.println("Path archivo: ver "+archivo.getAbsolutePath().toString());
                ImageIcon tmpIconAux = new ImageIcon(getClass().getResource("/Others/"+nombreFile));
                ImageIcon tmpIcon = new ImageIcon(tmpIconAux.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
                lblImagen.setIcon(tmpIcon);        // TODO add your handling code here:
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnCargarImageActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
      
        if(imagencargada==false){
            JOptionPane.showMessageDialog(null, "TIENE QUE ACTUALIZAR LA IMAGEN");
        
        }else{
        
                CreacionCatalogoZombies.modeloLista.clear();
        
        int indexSelected=cmbMode.getSelectedIndex();
        
        char tipo;
        if (indexSelected==0) {//Disparo
           tipo='D';
        }else{
            tipo='A';
        }
        
        
        //System.out.println("INDEX SELECTED: "+indexSelected);
        
        Listas.Nodo auxNodo;
        auxNodo=MainForm.listaCatalogoZombiesMAIN.getFirstNodo();
        int i=0;
                        while( auxNodo != null ){        

                            Listas.Nodo nodoPlantaAux;
                            nodoPlantaAux=(Listas.Nodo)auxNodo.getObjetoGuardado();
                            Clases.Zombie zombie;
                            zombie=(Clases.Zombie)nodoPlantaAux.getObjetoGuardado();
                           
                            if(indice==i){
                                zombie.setPictureZombie("/Others/"+nombreFile);
                                zombie.setNameZombie(txtName.getText());
                                zombie.setPointsOfAtack(Integer.valueOf(txtAtaque.getText()));
                                zombie.setPointsOfDefense(Integer.valueOf(txtDefenza.getText()));
                                zombie.setMode(tipo);
                                
                                //System.out.println("ZOMBIE_IMG: "+zombie.getPictureZombie()+" NAME: "+ zombie.getNameZombie()+ " ATAQUE: " + zombie.getPointsOfAtack()+" DEFENZA: "+zombie.getPointsOfDefense()+" MODE: "+zombie.getMode());
                                
                            }else{
                                 //System.out.println("ZOMBIE_IMG: "+zombie.getPictureZombie()+" NAME: "+ zombie.getNameZombie()+ " ATAQUE: " + zombie.getPointsOfAtack()+" DEFENZA: "+zombie.getPointsOfDefense()+" MODE: "+zombie.getMode());
                                        
                            }
                            
                            CreacionCatalogoZombies.modeloLista.addElement(zombie.getNameZombie()+" Ataque: "+zombie.getPointsOfAtack()+" Defenza: "+zombie.getPointsOfDefense()+" Modo: "+zombie.getMode() );
                            auxNodo = auxNodo.getSiguenteNodo();
                            i=i+1;


                        }
                        
                        dispose();
                        
                        CreacionCatalogoZombies.JListTiposZombies.setModel(CreacionCatalogoZombies.modeloLista);
                                                //System.out.println("TAMA;O CATALOGO ZOMBIES"+MainForm.listaCatalogoZombiesMAIN.getLengthList());
        }
        
        
        
        

    }//GEN-LAST:event_btnActualizarActionPerformed

            
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
            java.util.logging.Logger.getLogger(EditarCatalogoZombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarCatalogoZombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarCatalogoZombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarCatalogoZombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarCatalogoZombies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCargarImage;
    private javax.swing.JComboBox cmbMode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextField txtAtaque;
    private javax.swing.JTextField txtDefenza;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
