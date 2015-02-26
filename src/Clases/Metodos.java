/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import sun.applet.Main;

/**
 *
 * @author androide17
 */
public class Metodos {

      
    public Metodos(int indice) {
        
    }
    
       
    public static Clases.Plant obtenerInformacionPlantaParaEditar(int indice){
        Clases.Plant planta=null;
                
        Listas.Nodo auxPrimero;
        auxPrimero=Forms.MainForm.listaCatalogoPlntasMAIN.getFirstNodo();
                        
                        int index=0;
                        while( auxPrimero != null ){  
                                                        
                            Listas.Nodo nodoPlantaAux;
                            nodoPlantaAux=(Listas.Nodo)auxPrimero.getObjetoGuardado();
                            
                            if (index==indice) {
                            planta=(Clases.Plant)nodoPlantaAux.getObjetoGuardado();  
                                
                            }

                            auxPrimero = auxPrimero.getSiguenteNodo();
                            index=index+1;

                        }   
        
        return planta;
    }
    
    
    
        public static Clases.Zombie obtenerInformacionZombieParaEditar(int indice){
        Clases.Zombie zombie=null;
                
        Listas.Nodo auxPrimero;
        auxPrimero=Forms.MainForm.listaCatalogoZombiesMAIN.getFirstNodo();
                        
                        int index=0;
                        while( auxPrimero != null ){  
                                                        
                            Listas.Nodo nodoZombieAux;
                            nodoZombieAux=(Listas.Nodo)auxPrimero.getObjetoGuardado();
                            
                            if (index==indice) {
                            zombie=(Clases.Zombie)nodoZombieAux.getObjetoGuardado();  
                                
                            }

                            auxPrimero = auxPrimero.getSiguenteNodo();
                            index=index+1;

                        }   
        
        return zombie;
    }
    
        
   public static void eliminarZombie(int indice){
            Forms.CreacionCatalogoZombies.modeloLista.clear();
       
            Listas.Lista auxCatalogoZombies;
            auxCatalogoZombies=Forms.MainForm.listaCatalogoZombiesMAIN;
          
            Forms.MainForm.listaCatalogoZombiesMAIN.limpiarLista();
            
            Clases.Zombie zombie;
                
            Listas.Nodo auxPrimero;
            auxPrimero=auxCatalogoZombies.getFirstNodo();
                        
                        int index=0;
                        while( auxPrimero != null ){  
                                                        
                            Listas.Nodo nodoZombieAux;
                            nodoZombieAux=(Listas.Nodo)auxPrimero.getObjetoGuardado();
                            zombie=(Clases.Zombie)nodoZombieAux.getObjetoGuardado();
                            
                            if (index!=indice) {
                                Forms.MainForm.listaCatalogoZombiesMAIN.add(nodoZombieAux);
                                Forms.CreacionCatalogoZombies.modeloLista.addElement(zombie.getNameZombie()+" Ataque: "+zombie.getPointsOfAtack()+" Defenza: "+zombie.getPointsOfDefense()+" Mode: "+zombie.getMode());
                                
                            }else{

                            }

                            auxPrimero = auxPrimero.getSiguenteNodo();
                            index=index+1;

                        } 
                Forms.CreacionCatalogoZombies.JListTiposZombies.setModel(Forms.CreacionCatalogoZombies.modeloLista);
                System.out.println("Tamano Catalog ahora:" +Forms.MainForm.listaCatalogoZombiesMAIN.getLengthList());
        }
    
   
   
}
