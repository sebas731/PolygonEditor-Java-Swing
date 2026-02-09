/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PoligonosImplementsDAO;

import Clases.Poligono;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Familia Mamani
 */
public class PanelInformacion extends JPanel {
    private static final String COLOR = "COLOR";
    private static final String PUNTOS = "PUNTOS";
    
    
    //Botones
    JButton btnPuntos;
    
    JButton btnColorLineas;
    
    JButton btnColorRelleno;
    
    Poligono figura;

    public PanelInformacion() {
        
        setBounds(0,0,400,400);
        setLayout(new GridBagLayout());
        GridBagConstraints gb=new GridBagConstraints();
        
        //Panel Superior
        JPanel panelBotones=new JPanel();
        panelBotones.setLayout(new GridLayout(3, 1,30,20));
        panelBotones.setBorder(new TitledBorder("BOTONES "));
        //btnPuntos.setBounds(0, 0, 200, 100);
        btnPuntos=new JButton();
        btnPuntos.setText("CAMBIAR POLIGONO");
        btnPuntos.setActionCommand(PUNTOS);
        panelBotones.add(btnPuntos);
        //boton para cambiar color de relleno
        btnColorRelleno=new JButton();
        btnColorRelleno.setText("CAMBIAR COLOR");
        btnColorRelleno.setActionCommand(PUNTOS);
        panelBotones.add(btnColorRelleno);
        
        // COLOR LINEAS
        btnColorLineas=new JButton();
        btnColorLineas.setText("CAMBIAR COLOR LINEA");
        btnColorLineas.setActionCommand(PUNTOS);
        panelBotones.add(btnColorLineas);
        
       
        
        
        
        //PANEL BOTONES
        
        gb.gridx=0;
        gb.gridy=0;
        add(panelBotones,gb);
        
        
    }
    
    
    
}
