/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PoligonosImplementsDAO;

import Clases.Point;
import Clases.Poligono;
import Clases.Triangle;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.Polygon;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Familia Mamani
 */
public class Interfaz extends JFrame{
    
    Poligono figura;
    /*
    class Panel extends JPanel{

        public Panel() {
           this.setBounds(0, 0, 500, 500);
           this.setVisible(true);
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponents(g);
            Graphics2D g2d = (Graphics2D)g;
            Polygon p=new Polygon();
            p.addPoint(29, 34);
            p.addPoint(78, 84);
            p.addPoint(150, 280);
            g2d.setColor(Color.BLUE);
            g2d.fill(p);
            g2d.setColor(Color.red);
            g2d.drawPolygon(p);
        }
        
        
        
    }
    */

    public Interfaz() {
        this.setVisible(true);
        setPreferredSize(new Dimension(570, 500));
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ArrayList<Point> listaPuntos=new ArrayList<Point>();
        listaPuntos.add(new Point(30, 20));
        listaPuntos.add(new Point(200, 120));
        listaPuntos.add(new Point(300, 250));
        listaPuntos.add(new Point(150, 160));
        
        figura=new Triangle(listaPuntos, "Triangulo");
        
        PanelDibujo d=new PanelDibujo(figura);
        add(d,BorderLayout.CENTER);
        PanelCabecera PanelTitulo=new PanelCabecera();
        add(PanelTitulo,BorderLayout.NORTH);
        
        PanelInformacion i=new PanelInformacion();
        add(i,BorderLayout.WEST);
    }

    

    
    

   
    public static void main(String[] args) {
       Interfaz i=new Interfaz();
       i.setVisible(true);
       i.setBounds(0, 0, 500,500);
       i.setLocationRelativeTo(null);
    }
    
}
