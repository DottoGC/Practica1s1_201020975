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
public class PlantGamer extends Gamer{ 

    private String picturePlant;
    private String namePlant;
    private int pointsOfAtack;
    private int pointsOfDefense;
    private char Mode;
    private int positionInTheQueue;
    private int posX;
    private int poxY;

    
    
    
    /**
     * Getters and Setters  
     */
    public char getMode() {
        return Mode;
    }

    public void setMode(char Mode) {
        this.Mode = Mode;
    }

    public int getPositionInTheQueue() {
        return positionInTheQueue;
    }

    public void setPositionInTheQueue(int positionInTheQueue) {
        this.positionInTheQueue = positionInTheQueue;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPoxY() {
        return poxY;
    }

    public void setPoxY(int poxY) {
        this.poxY = poxY;
    }

    
    
    public PlantGamer(String name, int quantity) {
        super(name, quantity);
    }
     
    
    public String getPicturePlant() {
        return picturePlant;
    }

    public void setPicturePlant(String picturePlant) {
        this.picturePlant = picturePlant;
    }

    public String getNamePlant() {
        return namePlant;
    }

    public void setNamePlant(String namePlant) {
        this.namePlant = namePlant;
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
    
}
