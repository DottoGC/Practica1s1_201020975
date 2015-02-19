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

public class ZombieGamer extends Gamer{
    
    private String pictureZombie;
    private String nameZombie;
    private int pointsOfAtack;
    private int pointsOfDefense;
    private char Mode;
    private int positionInTheStack;
    private int posX;
    private int posY;
    
    
    /**
     * CONSTRUCTOR
     * @param name Nombre del Jugador
     * @param quantity Cantidad de zombies
     */   
    public ZombieGamer(String name, int quantity) {
        super(name, quantity);
    }
    
    
    
    
    /**
     * 
     * Getters and Setters 
     */

    public String getPictureZombie() {
        return pictureZombie;
    }

    public void setPictureZombie(String pictureZombie) {
        this.pictureZombie = pictureZombie;
    }

    public String getNameZombie() {
        return nameZombie;
    }

    public void setNameZombie(String nameZombie) {
        this.nameZombie = nameZombie;
    }

    public int getPointsOfAtack() {
        return pointsOfAtack;
    }

    public void setPointsOfAtack(int pointsOfAtack) {
        this.pointsOfAtack = pointsOfAtack;
    }

    public int getPointsOfDefense() {
        return pointsOfDefense;
    }

    public void setPointsOfDefense(int pointsOfDefense) {
        this.pointsOfDefense = pointsOfDefense;
    }

    public char getMode() {
        return Mode;
    }

    public void setMode(char Mode) {
        this.Mode = Mode;
    }

    public int getPositionInTheStack() {
        return positionInTheStack;
    }

    public void setPositionInTheStack(int positionInTheStack) {
        this.positionInTheStack = positionInTheStack;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    

     
    
    
}
