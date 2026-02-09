/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Familia Mamani
 */
public class Triangle extends Poligono{
    
    public Triangle(ArrayList listPoints, String name) {
        super(listPoints, name);
    }
    
    @Override
    public double getArea(){
        return 1.0;
        
    }
    
    public double getHeight(){
        return 3.0;
        
    }
    
    
    
    
}
