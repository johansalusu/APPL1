/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaintingShapes;

/**
 *
 * @author Johan Salusu
 */
public abstract class Shape {
    protected String shapeName;
    String toString;
    public abstract double area();
    
    public Shape (String shapeName){
        this.shapeName = shapeName;
    }
    
    @Override
    public String toString(){
        return "\nShape Name: "+shapeName;
    }
}