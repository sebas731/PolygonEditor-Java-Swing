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
public class Cuadrado extends Poligono{
    
    
    public static Point p1;
    public static Point p2;
    public static Point p3;
    public static Point p4;
    
    public Cuadrado(ArrayList<Point> listPoints, String name, Color cR, Color cF) {
        super(listPoints, name, cR, cF);
    }
    
    @Override
    public double getArea(){
        p1=new Point(getListPoints().get(0).getPosicionX(), getListPoints().get(0).getPosicionY());
        p2= new Point(getListPoints().get(1).getPosicionX(), getListPoints().get(1).getPosicionY());
        p3=new Point(getListPoints().get(2).getPosicionX(), getListPoints().get(2).getPosicionY());
        p4=new Point(getListPoints().get(3).getPosicionX(),getListPoints().get(3).getPosicionY());
        
        double area = Math.abs(
            p1.getPosicionX() * p2.getPosicionY() +
            p2.getPosicionX() * p3.getPosicionY() +
            p3.getPosicionX() * p4.getPosicionY() +
            p4.getPosicionX() * p1.getPosicionY()
            -
            (
            p1.getPosicionY() * p2.getPosicionX() +
            p2.getPosicionY() * p3.getPosicionX() +
            p3.getPosicionY() * p4.getPosicionX() +
            p4.getPosicionY() * p1.getPosicionX()
            )
        ) / 2.0;

        BigDecimal bd = new BigDecimal(area);
        bd = bd.setScale(2, RoundingMode.HALF_UP);

        return bd.doubleValue();
        
    }
    
    @Override
    public double getPerimeter(){
        p1=new Point(getListPoints().get(0).getPosicionX(), getListPoints().get(0).getPosicionY());
        p2= new Point(getListPoints().get(1).getPosicionX(), getListPoints().get(1).getPosicionY());
        p3=new Point(getListPoints().get(2).getPosicionX(), getListPoints().get(2).getPosicionY());
        p4=new Point(getListPoints().get(3).getPosicionX(), getListPoints().get(3).getPosicionY());
        double a = calcularDistanciaP(p1, p2);
        double b = calcularDistanciaP(p2, p3);
        double c = calcularDistanciaP(p3, p4);
        double d = calcularDistanciaP(p4, p1);
        BigDecimal bd = new BigDecimal(a+b+c+d);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        
        double perimetro= bd.doubleValue();
        
        return perimetro;
        
    }
    
    
    
    @Override
    public double getHeight(){
        
        p1 = getListPoints().get(0);
        p2 = getListPoints().get(1);

        
        double base = calcularDistanciaP(p1, p2);
        double area = getArea();

        double resultado = (2 * area) / base;

        BigDecimal bd = new BigDecimal(resultado);
        bd = bd.setScale(2, RoundingMode.HALF_UP);

        return bd.doubleValue();
    }
    
    
    
}
