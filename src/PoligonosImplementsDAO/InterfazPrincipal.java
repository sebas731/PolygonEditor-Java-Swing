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
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Familia Mamani
 */
public class InterfazPrincipal extends JFrame{
    
    public  Poligono figura;
    
    private PanelDibujo panelDibujo;
    
    private PanelCabecera panelTitulo;
    
    private PanelInformacion panelInformacion;

    public InterfazPrincipal() {
        
        //this.setVisible(true);
       // setPreferredSize(new Dimension(570, 500));
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ArrayList<Point> listaPuntos=new ArrayList<Point>();
        listaPuntos.add(new Point(30, 20));
        listaPuntos.add(new Point(200, 120));
        listaPuntos.add(new Point(300, 250));
        listaPuntos.add(new Point(250, 315));
        //listaPuntos.add(new Point(150, 160));
        
        figura=new Triangle(listaPuntos, "Triangulo",new Color(0,0,170), new Color(0,0,170));
        //Panel de figura
        panelDibujo=new PanelDibujo(figura);
        add(panelDibujo,BorderLayout.CENTER);
        //panel de titulo
        panelTitulo=new PanelCabecera();
        add(panelTitulo,BorderLayout.NORTH);
        //panel de botones
        panelInformacion=new PanelInformacion(this);
        add(panelInformacion,BorderLayout.WEST);
        //repaint();
        pack();
    }
    
    
    public void cambiarFigura(){
        
        PanelEdicion pe=new PanelEdicion(this);
        pe.setVisible(true);
        pe.setLocationRelativeTo(null);
       
        setEnabled(false);
        
    }
    
    
    
    public Poligono getPoligono(){
        
        return this.figura;
    }
    
    public void repintar(){
        
        this.panelDibujo.repaint();
        
        this.panelInformacion.actualizar(figura.getPerimeter(),figura.getArea(),figura.getHeight());
    }
    
    
    
    void cambiarColorLineas() {
        
        java.awt.Color nuevoColor
                = JColorChooser.showDialog(this, "Color Linea", null);
         this.figura.setColorRelleno(nuevoColor);
         repintar();
       
    }

    void cambiarColorRelleno() {
        
        java.awt.Color nuevoColor
                = JColorChooser.showDialog(this, "Color Fondo", null);
        if (nuevoColor != null) {
            this.figura.setColorFondo(nuevoColor);
           
        }
        repintar();
        
    }
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfazPrincipal i=new InterfazPrincipal();
       i.setVisible(true);
       //i.setBounds(0, 0, 500,500);
       i.setLocationRelativeTo(null);
    }

    
    
}
