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
public class Poligono {
    
    private ArrayList<Point> listPoints = new ArrayList<Point>();
    
    private String name;

    public Poligono(ArrayList listPoints,String name) {
        this.listPoints= listPoints;
        this.name = name;
        
    }

    public ArrayList<Point> getListPoints() {
        return listPoints;
    }

    public void setListPoints(ArrayList<Point> listPoints) {
        this.listPoints = listPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getArea(){
        return 1.0;
        
    }
    
    public double getPerimeter(){
        return 1.0;
    }
    
    
    
    
    
}
