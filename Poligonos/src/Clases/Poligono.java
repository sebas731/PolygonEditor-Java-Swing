/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Familia Mamani
 */
public class Poligono {
    
    private ArrayList<Point> listPoints = new ArrayList<Point>();
    
    private String name;
    
    private Color colorRelleno;
    
    private Color ColorFondo;

    public Poligono(ArrayList<Point>  listPoints,String name,Color cR,Color cF) {
        this.listPoints= listPoints;
        this.name = name;
        this.colorRelleno=cR;
        this.ColorFondo=cF;
        
        
    }
    
    public Poligono crearFigura(ArrayList<Point> puntos){

        if(puntos.size() == 3){
            return new Triangle(puntos, "Triangulo",new Color(0,0,170),new Color(0,0,170));
        }
        else if(puntos.size() == 4){
            return new Cuadrado(puntos, "Cuadrado",new Color(0,0,170),new Color(0,0,170));
        }
        else{
            return null;//return new PoligonoGenerico(puntos, "Poligono");
        }
    }
    
    public double calcularDistanciaP(Point p1,Point p2){
        
        return Math.sqrt(Math.pow(p2.getPosicionX() - p1.getPosicionX(), 2) + Math.pow(p2.getPosicionY() - p1.getPosicionY(), 2));
        
       
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

    public Color getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(Color colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    public Color getColorFondo() {
        return ColorFondo;
    }

    public void setColorFondo(Color ColorFondo) {
        this.ColorFondo = ColorFondo;
    }
    
    
    
    public double getPerimeter(){
        return 1.0;
    }
    
    public double getHeight(){
        return 1.0;
    }
    
    
    
    
    
    
    
}
