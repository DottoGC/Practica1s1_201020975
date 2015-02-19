/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author androide17
 */
public class Lista {
    private Nodo firstNodo;
    private Nodo lastNodo;
    private Nodo currentNodo;
    private int length=0;
    
    
    /**
     * Creamos la lista a;adiendo el primer objeto a la lista()
     * @param objetoParaColocarEnLaLista
     */
    
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

        }
        length++;
    }
    
    
    
    
}
