/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PoligonosImplementsDAO;

import Clases.Poligono;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Familia Mamani
 */
public class PanelInformacion extends JPanel implements ActionListener{
    private static final String COLOR = "COLOR";
    private static final String PUNTOS = "PUNTOS";
    private static final String RELLENO= "RELLENO";
    
    
    //Botones
    JButton btnPuntos;
    
    JButton btnColorLineas;
    
    JButton btnColorRelleno;
    
    Poligono figura;
    
    InterfazPrincipal padre;

    public PanelInformacion(InterfazPrincipal principal) {
        padre = principal;
        
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
        btnColorRelleno.setActionCommand(RELLENO);
        panelBotones.add(btnColorRelleno);
        
        // COLOR LINEAS
        btnColorLineas=new JButton();
        btnColorLineas.setText("CAMBIAR COLOR LINEA");
        btnColorLineas.setActionCommand(COLOR);
        panelBotones.add(btnColorLineas);
        
        
        //-----PANEL INFERIOR ----
        JPanel panelInfo=new JPanel();
        panelInfo.setLayout(new GridLayout(3, 3, 10 ,10));
        panelInfo.setBorder(new TitledBorder("DATOS: "));
        //perimetro
        JLabel lblTPerimetro=new JLabel("Perimetro: ");
        lblTPerimetro.setFont(new Font("Arial", Font.BOLD, 15));
        panelInfo.add(lblTPerimetro);
        JLabel lblPerimetro=new JLabel(" "+padre.figura.getArea());
        panelInfo.add(lblPerimetro);
        //Area
        JLabel lblTArea=new JLabel("Area: ");
        lblTArea.setFont(new Font("Arial", Font.BOLD, 15));
        panelInfo.add(lblTArea);
        JLabel lblArea=new JLabel(" "+padre.figura.getArea());
        panelInfo.add(lblArea);
        //Altura
        JLabel lblTALtura=new JLabel("Altura: ");
        lblTALtura.setFont(new Font("Arial", Font.BOLD, 15));
        panelInfo.add(lblTALtura);
        
        JLabel lblALtura=new JLabel(" "+padre.figura.getArea());
        panelInfo.add(lblALtura);
        
        
        
        
        //AGREGANDO PANEL BOTONES
        
        gb.gridx=0;
        gb.gridy=0;
        gb.fill=gb.VERTICAL;
        gb.weighty=1.0;
        
        add(panelBotones,gb);
        //AGREGANDO PANEL INFORMACION
        gb.gridx=0;
        gb.gridy=1;
        
        add(panelInfo,gb);
        
        
        //asignando padre
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (PUNTOS.equals(e.getActionCommand())) {
            
            
        }else if (COLOR.equals(e.getActionCommand())) {
            
        }else if (RELLENO.equals(e.getActionCommand())) {
            
        }
{
            
        }
    }
    
    
    
}
