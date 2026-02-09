/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Familia Mamani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int puntoX=0;
        int puntoY=0;
        ArrayList<Point> listaPunto = new ArrayList<Point>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingese el punto 1, X: ");
        puntoX = sc.nextInt();
        System.out.println("Ingrese el punto 2, Y: ");
        puntoY =sc.nextInt();
        Point p=new Point(puntoX, puntoY);
        listaPunto.add(p);
        System.out.println("Ingese el punto 1, X: ");
        puntoX = sc.nextInt();
        System.out.println("Ingrese el punto 2, Y: ");
        puntoY =sc.nextInt();
        Point p2=new Point(puntoX, puntoY);
        listaPunto.add(p2);
        System.out.println("Ingese el punto 1, X: ");
        puntoX = sc.nextInt();
        System.out.println("Ingrese el punto 2, Y: ");
        puntoY =sc.nextInt();
        Point p3=new Point(puntoX, puntoY);
        listaPunto.add(p3);
        
        Poligono triangulo= new Triangle(listaPunto, "Triangulo");
        Triangle t = (Triangle) triangulo;
        
        t.getHeight();
        for (Point listPoint : t.getListPoints()) {
            System.out.println(listPoint);
        }
        
       
        System.out.println(""+triangulo.getArea());
        
        
         
        
        
    }
    
}
