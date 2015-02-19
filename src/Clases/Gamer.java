/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 *
 * @author androide17
 */
public class Gamer {
        
    private String name; //Nombre del jugador
    private int quantity;//Cantidad de personajes del jugador(No. de zombies|No. de plantas)
    private int age;//Edad del jugador
    private String gender;//Tipo de sexo del jugador(M|F)
    
    
    //**Constructor Inicial de un jugador*/
    public Gamer(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
    
}
