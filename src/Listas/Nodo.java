
/**
 *
 * @author Ottoniel Guarchaj
 */
public class Nodo {
    private Object  objetoGuardado;
    private Nodo anteriorNodo;
    private Nodo siguenteNodo;
    
/**
 * Contructor de la clase
 * @param paciene, paciente que se almacena en el nodo
 */
    public Nodo(Object objetoAGuardar){
        this.objetoGuardado=objetoAGuardar;
    }


 /**
  *Enlaza el nodo actual con el nodo especificado
  *@param siguienteNodo el nodo con el que se van a enlazar
  */
    public void enlazarSiguiente(Nodo siguientenodo){
    this.siguenteNodo=siguientenodo;
    }
    /**
     * ROmpe el nodo siguiente, oh establece null al enlace siguiente al nodo
     */
    public void romperEnlaceSiguiente(){
        this.siguenteNodo=null;
    }


 /**
  * Enlaza el nodo actual, por el enlace anterior, con el nodo especificado
  * @param anteriornodo el nodo con el que se va a enlazar
  */
    public void enlazarAnterior(Nodo anteriornodo){
        this.anteriorNodo=anteriornodo;
    }

    /**
     * Establece a null el enlace anterior
     */
    public void romperEnlaceAnterior(){
        this.anteriorNodo=null;
    }

    
/**
 * Getters and Setters 
 */
    public Object getObjetoGuardado() {
        return objetoGuardado;
    }

    public void setObjetoGuardado(Object objetoGuardado) {
        this.objetoGuardado = objetoGuardado;
    }

    public Nodo getAnteriorNodo() {
        return anteriorNodo;
    }

    public void setAnteriorNodo(Nodo anteriorNodo) {
        this.anteriorNodo = anteriorNodo;
    }

    public Nodo getSiguenteNodo() {
        return siguenteNodo;
    }

    public void setSiguenteNodo(Nodo siguenteNodo) {
        this.siguenteNodo = siguenteNodo;
    }


    
    
    
    
    
    
    
    

}