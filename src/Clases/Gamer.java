/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;
import java.util.*;

/**
 *
 * @author androide17
 */
public class Gamer {
    
    private char Tipo;
    private String name; //Nombre del jugador
    private int quantity;//Cantidad de personajes del jugador(No. de zombies|No. de plantas)
    private ArrayList moreAtributes;
    
    
    //**Constructor Inicial de un jugador*/
    public Gamer(char tipo, String name, int quantity, ArrayList moreAtributes) {
        this.Tipo=tipo;
        this.name = name;
        this.quantity = quantity;
        this.moreAtributes=moreAtributes;
    }    

    
    public char getTipo() {
        return Tipo;
    }

    public void setTipo(char Tipo) {
        this.Tipo = Tipo;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    public int getSizeArrayList(){
        int x;
        x=this.moreAtributes.size();
        return x;
    }
    
    public String getAtributo(int indice){
        String atributo=moreAtributes.get(indice).toString();
    
        return atributo;
    }
    
    public ArrayList getArrayList(){
        return moreAtributes;
    }
    
}