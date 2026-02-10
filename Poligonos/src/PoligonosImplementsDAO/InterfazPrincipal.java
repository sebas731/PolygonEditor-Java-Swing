/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PoligonosImplementsDAO;

import Clases.Point;
import Clases.Poligono;
import Clases.Triangle;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Familia Mamani
 */
public class InterfazPrincipal extends JFrame{
    
    public  Poligono figura;

    public InterfazPrincipal() {
        
        //this.setVisible(true);
       // setPreferredSize(new Dimension(570, 500));
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ArrayList<Point> listaPuntos=new ArrayList<Point>();
        listaPuntos.add(new Point(30, 20));
        listaPuntos.add(new Point(200, 120));
        listaPuntos.add(new Point(300, 250));
        listaPuntos.add(new Point(150, 160));
        
        figura=new Triangle(listaPuntos, "Triangulo");
        //Panel de figura
        PanelDibujo d=new PanelDibujo(figura);
        add(d,BorderLayout.CENTER);
        //panel de titulo
        PanelCabecera PanelTitulo=new PanelCabecera();
        add(PanelTitulo,BorderLayout.NORTH);
        //panel de botones
        PanelInformacion i=new PanelInformacion(this);
        add(i,BorderLayout.WEST);
        //repaint();
        pack();
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
