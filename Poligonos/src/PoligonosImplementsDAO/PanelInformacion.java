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
import java.text.DecimalFormat;
import java.text.NumberFormat;
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
    
    //labels para actualziar
    
    private JLabel lblPerimetro;
    
    private JLabel lblArea;
    
    private JLabel lblALtura;

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
        btnPuntos.setText("CAMBIAR PUNTOS");
        btnPuntos.setActionCommand(PUNTOS);
        btnPuntos.addActionListener(this);
        panelBotones.add(btnPuntos);
        //boton para cambiar color de relleno
        btnColorRelleno=new JButton();
        btnColorRelleno.setText("CAMBIAR COLOR");
        btnColorRelleno.setActionCommand(RELLENO);
        btnColorRelleno.addActionListener(this);
        panelBotones.add(btnColorRelleno);
        
        // COLOR LINEAS
        btnColorLineas=new JButton();
        btnColorLineas.setText("CAMBIAR COLOR LINEA");
        btnColorLineas.setActionCommand(COLOR);
        btnColorLineas.addActionListener(this);
        panelBotones.add(btnColorLineas);
        
        
        //-----PANEL INFERIOR ----
        JPanel panelInfo=new JPanel();
        panelInfo.setLayout(new GridLayout(3, 3, 10 ,10));
        panelInfo.setBorder(new TitledBorder("DATOS: "));
        //perimetro
        JLabel lblTPerimetro=new JLabel("Perimetro: ");
        lblTPerimetro.setFont(new Font("Arial", Font.BOLD, 15));
        panelInfo.add(lblTPerimetro);
        lblPerimetro=new JLabel(" "+padre.figura.getPerimeter()+ " px");
        panelInfo.add(lblPerimetro);
        //Area
        JLabel lblTArea=new JLabel("Area: ");
        lblTArea.setFont(new Font("Arial", Font.BOLD, 15));
        panelInfo.add(lblTArea);
        lblArea=new JLabel(" "+padre.figura.getArea()+ " px2");
        panelInfo.add(lblArea);
        //Altura
        JLabel lblTALtura=new JLabel("Altura: ");
        lblTALtura.setFont(new Font("Arial", Font.BOLD, 15));
        panelInfo.add(lblTALtura);
        
        lblALtura=new JLabel(" "+padre.figura.getHeight());
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
    public void actualizar(double perimetro,double area, double altura) {
       
        this.lblPerimetro.setText(formatearValor(perimetro));
        this.lblArea.setText(formatearValor(area));
        this.lblALtura.setText(formatearValor(altura)); 
        
    }
    private String formatearValor(double valor) {
        DecimalFormat df = (DecimalFormat)NumberFormat.getInstance();
        df.applyPattern("###,###.##");
        df.setMinimumFractionDigits(2);
        return df.format(valor);
  }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (PUNTOS.equals(e.getActionCommand())) {
            padre.cambiarFigura();
            System.out.println("HOLA");
            
        }else if (COLOR.equals(e.getActionCommand())) {
            padre.cambiarColorLineas();
            
        }else if (RELLENO.equals(e.getActionCommand())) {
            padre.cambiarColorRelleno();
        }
{
            
        }
    }

    
    
    
    
}
