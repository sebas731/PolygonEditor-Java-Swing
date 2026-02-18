/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 *
 * @author Familia Mamani
 */
public class Triangle extends Poligono{
    
    public static Point p1;
    public static Point p2;
    public static Point p3;

    public Triangle(ArrayList<Point> listPoints, String name, Color cR, Color cF) {
        super(listPoints, name, cR, cF);
    }
    
    
    
    @Override
    public double getArea(){
        p1=new Point(getListPoints().get(0).getPosicionX(), getListPoints().get(0).getPosicionY());
        p2= new Point(getListPoints().get(1).getPosicionX(), getListPoints().get(1).getPosicionY());
        p3=new Point(getListPoints().get(2).getPosicionX(), getListPoints().get(2).getPosicionY());
        
        double a = calcularDistanciaP(p1, p2);
        double b = calcularDistanciaP(p2, p3);
        double c = calcularDistanciaP(p3, p1);
        
        double s = (a + b + c) / 2;
        
        double resultado = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        BigDecimal bd = new BigDecimal(resultado);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        double area = bd.doubleValue();
        return area;
        
    }
    @Override
    public double getPerimeter(){
        p1=new Point(getListPoints().get(0).getPosicionX(), getListPoints().get(0).getPosicionY());
        p2= new Point(getListPoints().get(1).getPosicionX(), getListPoints().get(1).getPosicionY());
        p3=new Point(getListPoints().get(2).getPosicionX(), getListPoints().get(2).getPosicionY());
        
        double a = calcularDistanciaP(p1, p2);
        double b = calcularDistanciaP(p2, p3);
        double c = calcularDistanciaP(p3, p1);
        BigDecimal bd = new BigDecimal(a+b+c);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        
        double perimetro= bd.doubleValue();
        
        return perimetro;
        
    }
    
    
    
    @Override
    public double getHeight(){
        
        p1=new Point(getListPoints().get(0).getPosicionX(), getListPoints().get(0).getPosicionY());
        p2= new Point(getListPoints().get(1).getPosicionX(), getListPoints().get(1).getPosicionY());
        double a = calcularDistanciaP(p1, p2);
        
        double area=getArea();
        
        double resultado = (2 * area) / a;
        
        BigDecimal bd = new BigDecimal(resultado);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        
        double altura= bd.doubleValue();
        
        return altura;
        
    }
    
    
    
    
}
