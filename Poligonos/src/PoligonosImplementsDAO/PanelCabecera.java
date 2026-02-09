/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PoligonosImplementsDAO;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Familia Mamani
 */
public class PanelCabecera extends JPanel{

    public PanelCabecera() {
        
        
        this.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        JLabel lblTitulo=new JLabel("INTERFAZ DE TRIANGULO");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        this.setBackground(Color.WHITE);//pongo el this por buena practica, aunque no es necesario para que funcione, en este caso
        this.add(lblTitulo);
        
        
    }
    
    

   
    
    
}
