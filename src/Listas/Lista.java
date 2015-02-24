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
    private int length;
    
    public Lista() {
    this.firstNodo=null;
    this.lastNodo=null;
    this.currentNodo=null;
    this.length=0;
    }

    public int getLengthList(){
        return this.length;
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
        length++;
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
    
    }
