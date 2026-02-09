/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PoligonosImplementsDAO;

import Clases.Poligono;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Familia Mamani
 */
public class PanelDibujo extends JPanel{
    Poligono poligono;
    public PanelDibujo(Poligono p) {
        this.poligono=p;
        this.setBounds(0, 0,400, 400);
        this.setBorder(new LineBorder(Color.GREEN));
        setBackground(Color.GRAY);
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d=(Graphics2D) g; 
        Polygon p=new Polygon();
        for (int i = 0; i < poligono.getListPoints().size(); i++) {
            p.addPoint(poligono.getListPoints().get(i).getPosicionX(),poligono.getListPoints().get(i).getPosicionY());
            
        }
        
        /*p.addPoint(30,20);
        p.addPoint(4,70);
        p.addPoint(90,10);
        */
        g2d.setColor(Color.red);
        g2d.fill(p);
        g2d.drawPolygon(p);
        
    }
    
    
    
    
    
}
