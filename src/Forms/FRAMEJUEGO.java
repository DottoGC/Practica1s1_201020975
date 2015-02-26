/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Forms;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author androide17
 */
public class FRAMEJUEGO extends javax.swing.JFrame{
    public static int cantidadPlantas;
    public static int cantidadZombies;
    
    public static int filasMatriz;
    public static int columnasMatriz;
   
    Timer timerZ;
    Timer timer;
    File file;
    
    JButton[] buttonsPlants;
    JButton[] buttonsZombies;
    JButton[][] buttonsMatriz;
    
    /**
     * Creates new form FRAMEJUEGO
     */
    public FRAMEJUEGO() {
        initComponents();
        
        generarColaDefault();
        generarPilaDefault();
        
        llenarPanelPlantas();
        llenarPanelZombies();
        
        timerColaPlantas();
        timerPilaZombies();
        
        llenarPanelMatriz();
        

        
    }
    
    public void llenarPanelMatriz(){
        
    this.jPanelMatriz.removeAll();

          SwingUtilities.updateComponentTreeUI(this);
          
            
    buttonsMatriz = new JButton[filasMatriz][columnasMatriz];
    
      for(int column=0; column<columnasMatriz; column++){
            for(int fila=0; fila<filasMatriz; fila++){

                buttonsMatriz[fila][column]= new JButton("("+ (fila+1) +","+(column+1) +")");
                buttonsMatriz[fila][column].setBounds(column*100,100*fila,100,100);

                //ImageIcon tmpIconAux = new ImageIcon(getClass().getResource(MainForm.colaPlantas.obtenerPlantaDelIndice(column).getPicturePlant()));
                //ImageIcon tmpIcon = new ImageIcon(tmpIconAux.getImage().getScaledInstance(buttonsPlants[column].getWidth(), buttonsPlants[column].getHeight(), Image.SCALE_DEFAULT));

                //buttonsPlants[column][fila].setIcon(tmpIcon);
                //buttonsMatriz[column][fila].setBorder(BorderFactory.createLineBorder(Color.black));

                this.jPanelMatriz.add(buttonsMatriz[fila][column]);
                buttonsMatriz[fila][column].addActionListener(                new java.awt.event.ActionListener ( ) {
                                    public void actionPerformed(java.awt.event.ActionEvent evt ) {

                                    System.out.println("Se boton denstro de la matriz");

                                    }});

                
            }
      }


      
       this.repaint(); 
    
    }
    

    public void llenarPanelPlantas(){
        this.jPanelColaPlantas.removeAll();
            
    buttonsPlants = new JButton[MainForm.colaPlantas.getLengthList()];
        
        for(int i=0; i<MainForm.colaPlantas.getLengthList(); i++){
            buttonsPlants[i]= new JButton("Button"+(i+1));
            buttonsPlants[i].setBounds(10,75*i,75,75);
            
            ImageIcon tmpIconAux = new ImageIcon(getClass().getResource(MainForm.colaPlantas.obtenerPlantaDelIndice(i).getPicturePlant()));
            ImageIcon tmpIcon = new ImageIcon(tmpIconAux.getImage().getScaledInstance(buttonsPlants[i].getWidth(), buttonsPlants[i].getHeight(), Image.SCALE_DEFAULT));
            
            buttonsPlants[i].setIcon(tmpIcon);
            buttonsPlants[i].setBorder(BorderFactory.createLineBorder(Color.black));
        
            this.jPanelColaPlantas.add(buttonsPlants[i]);
      }

        for(int i=1; i<MainForm.colaPlantas.getLengthList(); i++){
               buttonsPlants[i].setEnabled(false);
               
               
         }  
       this.repaint(); 
       
        buttonsPlants[0].addActionListener( new java.awt.event.ActionListener ( ) {
                                    public void actionPerformed(java.awt.event.ActionEvent evt ) {

                                    //System.out.println("Se preciono boton plantas");
                                    MainForm.colaPlantas.sacarPrimero();
                                    llenarPanelPlantas();
                                    }});   
    }
    
    public void llenarPanelZombies(){
        this.jPanelPilaZombies.removeAll();
        
        buttonsZombies = new JButton[MainForm.pilaZombies.getLengthList()];
        
        for(int i=0; i<MainForm.pilaZombies.getLengthList(); i++){
            buttonsZombies[i]= new JButton("Button"+(i+1));
            buttonsZombies[i].setBounds(10,75*i,75,75);
            
            ImageIcon tmpIconAux = new ImageIcon(getClass().getResource(MainForm.pilaZombies.obtenerZombieDelIndice(i).getPictureZombie()));
            ImageIcon tmpIcon = new ImageIcon(tmpIconAux.getImage().getScaledInstance(buttonsZombies[i].getWidth(), buttonsZombies[i].getHeight(), Image.SCALE_DEFAULT));
            
            buttonsZombies[i].setIcon(tmpIcon);
            buttonsZombies[i].setBorder(BorderFactory.createLineBorder(Color.black));
        
            this.jPanelPilaZombies.add(buttonsZombies[i]);
        }

        for(int i=0; i<MainForm.pilaZombies.getLengthList()-1; i++){
               buttonsZombies[i].setEnabled(false); 
         }
        
        this.repaint(); 

        buttonsZombies[MainForm.pilaZombies.getLengthList()-1].addActionListener( new java.awt.event.ActionListener ( ) {
                                    public void actionPerformed(java.awt.event.ActionEvent evt ) {

                                    //System.out.println("Se preciono boton zombies");
                                    MainForm.pilaZombies.sacarUltimo();
                                    llenarPanelZombies();
                                    }});
    
    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelColaPlantas = new javax.swing.JPanel();
        jPanelPilaZombies = new javax.swing.JPanel();
        lblCantidadPlantas = new javax.swing.JLabel();
        lblCantidadZombies = new javax.swing.JLabel();
        jPanelMatriz = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelColaPlantas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelColaPlantas.setAutoscrolls(true);

        javax.swing.GroupLayout jPanelColaPlantasLayout = new javax.swing.GroupLayout(jPanelColaPlantas);
        jPanelColaPlantas.setLayout(jPanelColaPlantasLayout);
        jPanelColaPlantasLayout.setHorizontalGroup(
            jPanelColaPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanelColaPlantasLayout.setVerticalGroup(
            jPanelColaPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );

        jPanelPilaZombies.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelPilaZombiesLayout = new javax.swing.GroupLayout(jPanelPilaZombies);
        jPanelPilaZombies.setLayout(jPanelPilaZombiesLayout);
        jPanelPilaZombiesLayout.setHorizontalGroup(
            jPanelPilaZombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );
        jPanelPilaZombiesLayout.setVerticalGroup(
            jPanelPilaZombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblCantidadPlantas.setText("No: ");

        lblCantidadZombies.setText("No: ");

        javax.swing.GroupLayout jPanelMatrizLayout = new javax.swing.GroupLayout(jPanelMatriz);
        jPanelMatriz.setLayout(jPanelMatrizLayout);
        jPanelMatrizLayout.setHorizontalGroup(
            jPanelMatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );
        jPanelMatrizLayout.setVerticalGroup(
            jPanelMatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu1.setText("Jugar");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("View");

        jMenuItem1.setText("Gamers Structure");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Catalog Structure");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Queue Structure");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Stack Structure");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCantidadPlantas)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelColaPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelMatriz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCantidadZombies)
                    .addComponent(jPanelPilaZombies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblCantidadPlantas)
                .addGap(5, 5, 5)
                .addComponent(lblCantidadZombies)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelColaPlantas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPilaZombies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelMatriz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void generarColaDefault(){
    /*
        Clases.Plant p=new Clases.Plant("URL", "plantauno", 25, 25, 'A');
        Listas.Nodo n=new Listas.Nodo(p);
        MainForm.listaCatalogoPlntasMAIN.add(n);
        Clases.Plant p2=new Clases.Plant("URL", "plantaDos", 5, 5, 'A');
        Listas.Nodo n2=new Listas.Nodo(p2);
        MainForm.listaCatalogoPlntasMAIN.add(n2);
        Clases.Plant p3=new Clases.Plant("URL", "plantaTres", 55, 55, 'A');
        Listas.Nodo n3=new Listas.Nodo(p3);
        MainForm.listaCatalogoPlntasMAIN.add(n3);
        Clases.Plant p4=new Clases.Plant("URL", "plantaCuatro", 5, 5, 'A');
        Listas.Nodo n4=new Listas.Nodo(p2);
        MainForm.listaCatalogoPlntasMAIN.add(n4);
        Clases.Plant p5=new Clases.Plant("URL", "plantaCinco", 55, 55, 'A');
        Listas.Nodo n5=new Listas.Nodo(p3);
        MainForm.listaCatalogoPlntasMAIN.add(n5);
        */
        inicializarCola();
}

    public void inicializarCola(){
        for (int i=1; i<=5 ; i++) {
            Clases.Plant ramomPlant;
            ramomPlant=MainForm.listaCatalogoPlntasMAIN.plantaAlAzar();

            Listas.Nodo nodoAux=new Listas.Nodo(ramomPlant);
            Forms.MainForm.colaPlantas.add(nodoAux);
            cantidadPlantas = cantidadPlantas - 1;
        }
    }

public void generarPilaDefault(){
    
    /*
        Clases.Zombie p=new Clases.Zombie("URL", "Zombieuno", 25, 25, 'D');
        Listas.Nodo n=new Listas.Nodo(p);
        MainForm.listaCatalogoZombiesMAIN.add(n);
        Clases.Zombie p2=new Clases.Zombie("URL", "ZombieDos", 25, 25, 'D');
        Listas.Nodo n2=new Listas.Nodo(p);
        MainForm.listaCatalogoZombiesMAIN.add(n2);
        Clases.Zombie p3=new Clases.Zombie("URL", "ZombieTres", 25, 25, 'D');
        Listas.Nodo n3=new Listas.Nodo(p3);
        MainForm.listaCatalogoZombiesMAIN.add(n3);
        Clases.Zombie p4=new Clases.Zombie("URL", "ZombieCuatro", 25, 25, 'D');
        Listas.Nodo n4=new Listas.Nodo(p4);
        MainForm.listaCatalogoZombiesMAIN.add(n4);
        Clases.Zombie p5=new Clases.Zombie("URL", "ZombieCinco", 25, 25, 'D');
        Listas.Nodo n5=new Listas.Nodo(p5);
        MainForm.listaCatalogoZombiesMAIN.add(n5);
        */
        inicializarPila();
}
    
    public void inicializarPila(){
        for (int i=1; i<=5 ; i++) {
            Clases.Zombie randomZombie;
            randomZombie=MainForm.listaCatalogoZombiesMAIN.zombieAlAzar();

            Listas.Nodo nodoAux=new Listas.Nodo(randomZombie);
            Forms.MainForm.pilaZombies.add(nodoAux);
            cantidadZombies = cantidadZombies - 1;
        }
    }
    
    public void timerPilaZombies(){
        timerZ = new Timer (5000, 
            new ActionListener ()
            {
                public void actionPerformed(ActionEvent e)
                {

                Clases.Zombie randomZombie;
                randomZombie=MainForm.listaCatalogoZombiesMAIN.zombieAlAzar();

                Listas.Nodo nodoAux=new Listas.Nodo(randomZombie);
                Forms.MainForm.pilaZombies.add(nodoAux);
                cantidadZombies=cantidadZombies-1;
   
                lblCantidadZombies.setText(String.valueOf(cantidadZombies));
                System.out.println("Tamano Pila: "+MainForm.pilaZombies.getLengthList());
                
                llenarPanelZombies();
                
                                if(cantidadZombies==0){
                                timerZ.stop();
                                timer.stop();
                                JOptionPane.showMessageDialog(null, "PLANTAS HAN GANADO");
                                System.exit(0);
                                }
                }
            }
        ); 

    timerZ.start();
    }
    
    
    public void timerColaPlantas(){
        timer = new Timer (5000, 
            new ActionListener ()
            {
                public void actionPerformed(ActionEvent e)
                {

                Clases.Plant randomPlant;
                randomPlant=MainForm.listaCatalogoPlntasMAIN.plantaAlAzar();

                Listas.Nodo nodoAux=new Listas.Nodo(randomPlant);
                Forms.MainForm.colaPlantas.add(nodoAux);
                cantidadPlantas=cantidadPlantas-1;
                
                lblCantidadPlantas.setText(String.valueOf(cantidadPlantas));
                System.out.println("Tamano cola: "+MainForm.colaPlantas.getLengthList());
                llenarPanelPlantas();
            
                                if(cantidadPlantas==0){
                                timer.stop();
                                timerZ.stop();
                                JOptionPane.showMessageDialog(null, "ZOMBIES HAN GANADO");
                                System.exit(0);
                                }
                }
            }
        ); 

    timer.start();
    }  
    
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //System.out.println("1");
        MainForm.listaJugadoresMAIN.graficarJugadores();
         //System.out.println("2");
         ejecutarEnConsolaJUGADORES();
          //System.out.println("3");
          
          SwingUtilities.updateComponentTreeUI(this);
          
         try { 
file = new File("/home/androide17/Escritorio/Jugadores.jpg");
Desktop.getDesktop().open(file);
} catch(Exception e) {
 
e.printStackTrace();
}
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

            imprimirCatalogos();
            ejecutarEnConsolaCATALOGOS();
            
            
                      SwingUtilities.updateComponentTreeUI(this);
            
            try {
            file = new File("/home/androide17/Escritorio/Catalogos.jpg");
            Desktop.getDesktop().open(file);
            } catch(Exception e) {
            e.printStackTrace();
            }

        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        MainForm.colaPlantas.graficarColaPlantas();
         ejecutarEnConsolaCOLA();
          //System.out.println("3");
          
          SwingUtilities.updateComponentTreeUI(this);
          
         try { 
            file = new File("/home/androide17/Escritorio/ColaPlantas.jpg");
            Desktop.getDesktop().open(file);
            } catch(Exception e) {

            e.printStackTrace();
        }    
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        MainForm.pilaZombies.graficarPilaZombies();
         ejecutarEnConsolaPILA();
          //System.out.println("3");
          
          SwingUtilities.updateComponentTreeUI(this);
          
         try { 
            file = new File("/home/androide17/Escritorio/PilaZombies.jpg");
            Desktop.getDesktop().open(file);
            } catch(Exception e) {

            e.printStackTrace();
        }



// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    
    
        public void ejecutarEnConsolaPILA(){
        try {
      
      String dotPath = "/usr/bin/dot";
      
      String fileInputPath = "/home/androide17/Escritorio/PilaZombies.txt";
      String fileOutputPath = "/home/androide17/Escritorio/PilaZombies.jpg";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
        
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
      
      rt.exec( cmd );
      
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
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
            java.util.logging.Logger.getLogger(FRAMEJUEGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRAMEJUEGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRAMEJUEGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRAMEJUEGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRAMEJUEGO().setVisible(true);
            }
        });
    }
    
    
    public void imprimirCatalogos(){
       String cadenaAMandar="";
       cadenaAMandar=MainForm.listaCatalogoPlntasMAIN.cadenaPlantas()+MainForm.listaCatalogoZombiesMAIN.cadenaZombies();// TODO add your handling code here:
       
       String texto="digraph G \n { \n "+cadenaAMandar+ "\n }";
       /**
         * SEGUNDA PARTE DEL METODO
         * CREACION DEL ARCHIVO DE TEXTO
         */
                        try {
                        File outFile = new File("/home/androide17/Escritorio/Catalogos.txt");
                        BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
                        writer.write(texto);
                        writer.close();
                        } catch (IOException e) {
                        System.err.println(e);
                        System.exit(1);
                        }
    }
    
    public void ejecutarEnConsolaJUGADORES(){
        try {
      
      String dotPath = "/usr/bin/dot";
      
      String fileInputPath = "/home/androide17/Escritorio/Jugadores.txt";
      String fileOutputPath = "/home/androide17/Escritorio/Jugadores.jpg";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
        
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
      
      rt.exec( cmd );
      
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
    }
        
    }
    
    public void ejecutarEnConsolaCOLA(){
        try {
      
      String dotPath = "/usr/bin/dot";
      
      String fileInputPath = "/home/androide17/Escritorio/ColaPlantas.txt";
      String fileOutputPath = "/home/androide17/Escritorio/ColaPlantas.jpg";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
        
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
      
      rt.exec( cmd );
      
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
    }
        
    }
    
    
    
    public void ejecutarEnConsolaCATALOGOS(){
        try {
      
      String dotPath = "/usr/bin/dot";
      
      String fileInputPath = "/home/androide17/Escritorio/Catalogos.txt";
      String fileOutputPath = "/home/androide17/Escritorio/Catalogos.jpg";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
        
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
      
      rt.exec( cmd );
      
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
    }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    public javax.swing.JPanel jPanelColaPlantas;
    private javax.swing.JPanel jPanelMatriz;
    private javax.swing.JPanel jPanelPilaZombies;
    private javax.swing.JLabel lblCantidadPlantas;
    private javax.swing.JLabel lblCantidadZombies;
    // End of variables declaration//GEN-END:variables


}
