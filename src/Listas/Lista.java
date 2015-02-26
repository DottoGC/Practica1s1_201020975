/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author androide17
 */
public class Lista {
    
    private Nodo firstNodo;
    private Nodo lastNodo;
    private Nodo currentNodo;
    private int length=0;
    
    public Lista() {
    this.firstNodo=null;
    this.lastNodo=null;
    this.currentNodo=null;
    }
    
    
    
    
    public void limpiarLista(){
    this.firstNodo=null;
    this.lastNodo=null;
    this.currentNodo=null;
    this.length=0;
    }
    
    
    

    public void add(Nodo objetoParaColocarEnLaLista){
        Nodo nodoAdicionar=new Nodo(objetoParaColocarEnLaLista);

        if(firstNodo==null){//Empezamos la lista
            this.firstNodo=nodoAdicionar;
            this.lastNodo=this.firstNodo;
            this.currentNodo=this.firstNodo;
        }else{//Agregar siguente nodo a la lista
            
            this.lastNodo.enlazarSiguiente(nodoAdicionar);//Nuestro ultimo nodo de la lista la enlzamos con el siguente que es el que se esta adicionando
            nodoAdicionar.enlazarAnterior(this.lastNodo);
            this.lastNodo=nodoAdicionar;
            this.currentNodo=this.lastNodo;
        }
        
        length=length + 1;
    }
    
    public void recorrerListaJugadores(){
        
        Listas.Nodo auxPrimero;
        auxPrimero=firstNodo;
                        
                        while( auxPrimero != null ){        

                            Listas.Nodo jug;
                            jug=(Listas.Nodo)auxPrimero.getObjetoGuardado();
                            Clases.Gamer jugador;
                            jugador=(Clases.Gamer)jug.getObjetoGuardado();
                            
                            System.out.println("NICKNAME: " + jugador.getName()+ " QUANTITY:: " + jugador.getQuantity()+" TIPO:"+jugador.getTipo());
                            
                            auxPrimero = auxPrimero.getSiguenteNodo();                            

                        }       
 
    }
    
    public void recorrerListaCatalogoPlantas(){
        
        Listas.Nodo auxPrimero;
        auxPrimero=firstNodo;
                        
                        while( auxPrimero != null ){        

                            Listas.Nodo nodoPlantaAux;
                            nodoPlantaAux=(Listas.Nodo)auxPrimero.getObjetoGuardado();
                            Clases.Plant planta;
                            planta=(Clases.Plant)nodoPlantaAux.getObjetoGuardado();
                            
                            System.out.println("PLANTA_IMG: "+planta.getPicturePlant()+" NAME: "+ planta.getNamePlant()+ " ATAQUE: " + planta.getPointsOfAtack()+" DEFENZA: "+planta.getPointsOfDefense()+" MODE: "+planta.getMode());
                            
                            auxPrimero = auxPrimero.getSiguenteNodo();                            

                        }       
 
    }
     
    public void recorrerListaCatalogoZombies(){
        
        Listas.Nodo auxPrimero;
        auxPrimero=firstNodo;
                        
                        while( auxPrimero != null ){        

                            Listas.Nodo nodoZombieAux;
                            nodoZombieAux=(Listas.Nodo)auxPrimero.getObjetoGuardado();
                            Clases.Zombie zombie;
                            zombie=(Clases.Zombie)nodoZombieAux.getObjetoGuardado();
                            
                            System.out.println("ZOMBIE_IMG: "+zombie.getPictureZombie()+" ZOMBIE_NAME: "+ zombie.getNameZombie()+ " ATAQUE: " + zombie.getPointsOfAtack()+" DEFENZA: "+zombie.getPointsOfDefense()+" MODE: "+zombie.getMode());
                            
                            auxPrimero = auxPrimero.getSiguenteNodo();                            

                        }       
 
    }
    
    public int getLengthList(){
        return this.length;
    }
                
    public Nodo getFirstNodo() {
        return firstNodo;
    }

    public void setFirstNodo(Nodo firstNodo) {
        this.firstNodo = firstNodo;
    }

    public Nodo getLastNodo() {
        return lastNodo;
    }

    public void setLastNodo(Nodo lastNodo) {
        this.lastNodo = lastNodo;
    }
    
    public void graficarJugadores(){        
        /**
         * PRIMERA PARTE DEL METODO
         * CREACION DEL STRING CODIGO FUENTE PARA EL ARCHIVO .TXT 
         */
        String codigo="";
             
        Listas.Nodo auxPrimero;
        auxPrimero=firstNodo;
        Listas.Nodo auxSegundo;
        auxSegundo=firstNodo.getSiguenteNodo();

                        
                        while( auxPrimero != null ){
                            
                            //PRIMER JUGADOR
                            Listas.Nodo jug;
                            jug=(Listas.Nodo)auxPrimero.getObjetoGuardado();
                            Clases.Gamer jugador;
                            jugador=(Clases.Gamer)jug.getObjetoGuardado();
                            
                            codigo=codigo + jugador.getName()+" -> "+jugador.getQuantity()+ " -> "+jugador.getTipo();
                            
                            
                            if (jugador.getArrayList()==null) {
                                codigo=codigo+"; \n";
                            }
                            else{
                                int z=jugador.getSizeArrayList();
                                for(int i=0; i<z; i++){
                                codigo=codigo+" -> "+jugador.getAtributo(i);
                                }
                                codigo=codigo+"; \n";
                            }    
                            auxPrimero = auxPrimero.getSiguenteNodo();  
                        }
                        
                        
                        auxPrimero=firstNodo;
                        
                        while(auxPrimero!=null){
                        
                        Listas.Nodo jug;
                        jug=(Listas.Nodo)auxPrimero.getObjetoGuardado();
                        Clases.Gamer juga;
                        juga=(Clases.Gamer)jug.getObjetoGuardado();
                        
                            Listas.Nodo jugg;
                            jugg=(Listas.Nodo)auxSegundo.getObjetoGuardado();
                            Clases.Gamer jugadorr;
                            jugadorr=(Clases.Gamer)jugg.getObjetoGuardado();
                        
                        
                            codigo=codigo + juga.getName()+ " -> "+jugadorr.getName()+"; \n";
                            
                            auxPrimero = null; 
                            
                        }
                        
                        
                        String todoElTXT="digraph G \n { \n "+ codigo +" \n }";
                        
        /**
         * SEGUNDA PARTE DEL METODO
         * CREACION DEL ARCHIVO DE TEXTO
         */
            try {
                        File outFile = new File("/home/androide17/Escritorio/Jugadores.txt");
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))) {
                writer.write(todoElTXT);
            }
                        } catch (IOException e) {
                        System.err.println(e);
                        System.exit(1);
            }
    }
    
    public void graficarColaPlantas(){        
        /**
         * PRIMERA PARTE DEL METODO
         * CREACION DEL STRING CODIGO FUENTE PARA EL ARCHIVO .TXT 
         */
        String codigo="";
             
        Listas.Nodo auxPrimero;
        auxPrimero=firstNodo;
                        boolean primero=false;
                        int indice=0;
                        
                        while( auxPrimero != null ){
                            //PRIMER JUGADOR
                            indice=indice+1;
                            
                            Listas.Nodo nodoAux;
                            nodoAux=(Listas.Nodo)auxPrimero.getObjetoGuardado();
                            Clases.Plant plantt;
                            plantt=(Clases.Plant)nodoAux.getObjetoGuardado();
                            
                            if(primero==true){
                            codigo=codigo+" -> "+plantt.getNamePlant()+indice;
                            }
                            if (primero==false) {
                               codigo=codigo+plantt.getNamePlant()+indice+" ->  PrimeroDeSalida ; \n";
                               codigo=codigo + plantt.getNamePlant()+indice;
                               primero=true;
                            }

                                
                            
                            auxPrimero = auxPrimero.getSiguenteNodo();  
                            
                            if (auxPrimero==null) {
                                codigo=codigo+"; \n";
                            }
                        
                        }
        
                        
                        
        String todoElTXT="digraph G \n { \n "+ codigo +" \n }";
                        
        
                                /**
                                 * SEGUNDA PARTE DEL METODO
                                 * CREACION DEL ARCHIVO DE TEXTO
                                 */
                                    try {
                                                File outFile = new File("/home/androide17/Escritorio/ColaPlantas.txt");
                                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))) {
                                        writer.write(todoElTXT);
                                    }
                                                } catch (IOException e) {
                                                System.err.println(e);
                                                System.exit(1);
                                    }
    }
    
        
     public void graficarPilaZombies(){        
        /**
         * PRIMERA PARTE DEL METODO
         * CREACION DEL STRING CODIGO FUENTE PARA EL ARCHIVO .TXT 
         */
         
        String codigo="";
             
        Listas.Nodo auxPrimero;
        auxPrimero=firstNodo;
        
                        boolean primero=false;
                        int indice=0;
                        
                        while( auxPrimero != null ){
                            //PRIMER JUGADOR
                            indice=indice+1;
                            
                            Listas.Nodo nodoAux;
                            nodoAux=(Listas.Nodo)auxPrimero.getObjetoGuardado();
                            Clases.Zombie zmbie;
                            zmbie=(Clases.Zombie)nodoAux.getObjetoGuardado();
                            
                            if(primero==true){
                            codigo=codigo+" -> "+zmbie.getNameZombie()+indice;
                            }
                            if (primero==false) {
                               codigo=codigo + zmbie.getNameZombie()+indice;
                               primero=true;
                            }

                            auxPrimero = auxPrimero.getSiguenteNodo();  
                            
                            if (auxPrimero==null) {
                                codigo=codigo+"; \n";
                                codigo=codigo+zmbie.getNameZombie()+indice+" -> UltimoDeSalida";
                            }                            
                        
                        }
        
                        
                        
        String todoElTXT="digraph G \n { \n "+ codigo +" \n }";
                        
        
                                /**
                                 * SEGUNDA PARTE DEL METODO
                                 * CREACION DEL ARCHIVO DE TEXTO
                                 */
                                    try {
                                                File outFile = new File("/home/androide17/Escritorio/PilaZombies.txt");
                                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))) {
                                        writer.write(todoElTXT);
                                    }
                                                } catch (IOException e) {
                                                System.err.println(e);
                                                System.exit(1);
                                    }
    }
    
    
    
    public String cadenaPlantas(){        
        /**
         * PRIMERA PARTE DEL METODO
         * CREACION DEL STRING CODIGO FUENTE PARA EL ARCHIVO .TXT 
         */
        String codigo="";
             
        Listas.Nodo auxPrimero;
        auxPrimero=firstNodo;
                        boolean primero=false;
                        int posicion=0;
                        
                        while( auxPrimero != null ){   
                            
                            //PRIMER JUGADOR
                            Listas.Nodo nodo;
                            nodo=(Listas.Nodo)auxPrimero.getObjetoGuardado();
                            Clases.Plant planta;
                            planta=(Clases.Plant)nodo.getObjetoGuardado();
                            
                            
                            String infoplanta="";
                            if(primero==true){
                            infoplanta=infoplanta+" -> \""+planta.getPicturePlant()+" "+planta.getNamePlant()+" Ataque: "+planta.getPointsOfAtack()+" Defenza: "+planta.getPointsOfDefense()+" Modo: "+planta.getMode()+"\"";
                            posicion=posicion+1;
                            } 
                            if (primero==false) {
                            infoplanta=infoplanta+"\""+planta.getPicturePlant()+" "+planta.getNamePlant()+" Ataque: "+planta.getPointsOfAtack()+" Defenza: "+planta.getPointsOfDefense()+" Modo: "+planta.getMode()+"\" ";
                            primero=true;
                            posicion=posicion+1;
                            }  
                            codigo=codigo + infoplanta;
                            
                            
                            if(posicion==this.length){
                            codigo=codigo + "; \n";
                            }
                             
                           
                            auxPrimero = auxPrimero.getSiguenteNodo();                           
                        }
                        
                        
        //String todoElTXT="digraph G \n { \n "+ codigo +" \n }";
          return codigo;
    }
        
    public String cadenaZombies(){        
        /**
         * PRIMERA PARTE DEL METODO
         * CREACION DEL STRING CODIGO FUENTE PARA EL ARCHIVO .TXT 
         */
        String codigo="";
             
        Listas.Nodo auxPrimero;
        auxPrimero=firstNodo;
                        boolean primero=false;
                        int posicion=0;
                        
                        while( auxPrimero != null ){   
                            
                            //PRIMER JUGADOR
                            Listas.Nodo nodo;
                            nodo=(Listas.Nodo)auxPrimero.getObjetoGuardado();
                            Clases.Zombie zombie;
                            zombie=(Clases.Zombie)nodo.getObjetoGuardado();
                            
                            
                            String infoZombie="";
                            if(primero==true){
                            infoZombie=infoZombie+" -> \""+zombie.getPictureZombie()+" "+zombie.getNameZombie()+" Ataque: "+zombie.getPointsOfAtack()+" Defenza: "+zombie.getPointsOfDefense()+" Modo: "+zombie.getMode()+"\"";
                            posicion=posicion+1;
                            } 
                            if (primero==false) {
                            infoZombie=infoZombie+"\""+zombie.getPictureZombie()+" "+zombie.getNameZombie()+" Ataque: "+zombie.getPointsOfAtack()+" Defenza: "+zombie.getPointsOfDefense()+" Modo: "+zombie.getMode()+"\" ";
                            primero=true;
                            posicion=posicion+1;
                            }  
                            codigo=codigo + infoZombie;
                            
                            
                            if(posicion==this.length){
                            codigo=codigo + "; ";
                            }

                            auxPrimero = auxPrimero.getSiguenteNodo();                           
                        }
        return codigo;
    }
    
    public void sacarPrimero(){
        
        firstNodo=firstNodo.getSiguenteNodo();
        length=length - 1;
        
    }
    
    public void sacarUltimo(){
         
                        length=length - 1;
                        
                        /**
                         * SI LASTNODO.ANTERIOR IS NULL
                         *          
                         */
                        if (lastNodo.getAnteriorNodo()==null) {
                            firstNodo=null;
                        }else{
                            lastNodo=lastNodo.getAnteriorNodo();
                            lastNodo.setSiguenteNodo(null);
                            currentNodo=lastNodo;             
                        }

    }
    
    
    public void recorrerColaPlantas(){
        System.out.println("Tama;o de la Cola: "+this.length);
        
        Listas.Nodo auxPrimero;
        auxPrimero=firstNodo;
                        
                        while( auxPrimero != null ){        

                            Listas.Nodo nodoPlantaAux;
                            nodoPlantaAux=(Listas.Nodo)auxPrimero.getObjetoGuardado();
                            String planta;
                            planta=(String)nodoPlantaAux.getObjetoGuardado();
                            
                            //System.out.println("PLANTA_IMG: "+zombie.getPicturePlant()+" NAME: "+ zombie.getNamePlant()+ " ATAQUE: " + zombie.getPointsOfAtack()+" DEFENZA: "+zombie.getPointsOfDefense()+" MODE: "+zombie.getMode());
                            System.out.println(planta);
                            
                            auxPrimero = auxPrimero.getSiguenteNodo();                            

                        }  
    }
    
    
    
    public Clases.Plant plantaAlAzar(){
        Clases.Plant random=null;
        
        Listas.Nodo auxPrimero;
        auxPrimero=firstNodo;
        
        int indiceCola=0;
        int x=(int) (Math.random()*this.length)+1 ;
            while( auxPrimero != null ){        
                indiceCola=indiceCola + 1;

                    if(x==indiceCola){
                        Listas.Nodo nodoPlantaAux=(Listas.Nodo)auxPrimero.getObjetoGuardado();
                       random=(Clases.Plant)nodoPlantaAux.getObjetoGuardado();
                       //System.out.println("PLANTA_IMG: "+zombie.getPicturePlant()+" NAME: "+ zombie.getNamePlant()+ " ATAQUE: " + zombie.getPointsOfAtack()+" DEFENZA: "+zombie.getPointsOfDefense()+" MODE: "+zombie.getMode());
                   }    
  
                    auxPrimero = auxPrimero.getSiguenteNodo();                            
            } 
        return random;
    }
    
    public Clases.Zombie zombieAlAzar(){
        Clases.Zombie random=null;
        
        Listas.Nodo auxPrimero;
        auxPrimero=firstNodo;
        
        int indiceCola=0;
        int x=(int) (Math.random()*this.length)+1 ;
            while( auxPrimero != null ){        
                indiceCola=indiceCola + 1;

                    if(x==indiceCola){
                        Listas.Nodo nodoPlantaAux=(Listas.Nodo)auxPrimero.getObjetoGuardado();
                       random=(Clases.Zombie)nodoPlantaAux.getObjetoGuardado();
                       //System.out.println("PLANTA_IMG: "+zombie.getPictureZombie()+" NAME: "+ zombie.getNameZombie()+ " ATAQUE: " + zombie.getPointsOfAtack()+" DEFENZA: "+zombie.getPointsOfDefense()+" MODE: "+zombie.getMode());
                   }    
  
                    auxPrimero = auxPrimero.getSiguenteNodo();                            
            } 
        return random;
    }
    
    
    public Clases.Plant obtenerPlantaDelIndice(int indice){
    
        Clases.Plant planta=null;
        
        Listas.Nodo nodoAux;
        nodoAux=firstNodo;
        
        int indiceCola=0;
            while( nodoAux != null ){        
                
                    if(indice==indiceCola){
                        Listas.Nodo nodoPlantaAux=(Listas.Nodo)nodoAux.getObjetoGuardado();
                       planta=(Clases.Plant)nodoPlantaAux.getObjetoGuardado();
                       //System.out.println("PLANTA_IMG: "+zombie.getPicturePlant()+" NAME: "+ zombie.getNamePlant()+ " ATAQUE: " + zombie.getPointsOfAtack()+" DEFENZA: "+zombie.getPointsOfDefense()+" MODE: "+zombie.getMode());
                   }    
                    
                    indiceCola=indiceCola + 1;
                    nodoAux = nodoAux.getSiguenteNodo();                            
            } 
        return planta;
        
    }
    
        public Clases.Zombie obtenerZombieDelIndice(int indice){
    
        Clases.Zombie zombie=null;
        
        Listas.Nodo nodoAux;
        nodoAux=firstNodo;
        
        int indiceCola=0;
            while( nodoAux != null ){       
                
                    if(indice==indiceCola){
                        Listas.Nodo nodoZombieAux=(Listas.Nodo)nodoAux.getObjetoGuardado();
                       zombie=(Clases.Zombie)nodoZombieAux.getObjetoGuardado();
                       //System.out.println("PLANTA_IMG: "+zombie.getPicturePlant()+" NAME: "+ zombie.getNamePlant()+ " ATAQUE: " + zombie.getPointsOfAtack()+" DEFENZA: "+zombie.getPointsOfDefense()+" MODE: "+zombie.getMode());
                   }    
                    
                    indiceCola=indiceCola + 1;
                    nodoAux = nodoAux.getSiguenteNodo();                            
            } 
        return zombie; 
        }
    
        
    }
