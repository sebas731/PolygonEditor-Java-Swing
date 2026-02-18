/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PoligonosImplementsDAO;

import Clases.Point;
import Clases.Poligono;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Familia Mamani
 */
public class PanelEdicion extends JDialog implements ActionListener{
    
    InterfazPrincipal padre;
    
    Poligono poligono;
    
    private static final String Aceptar="ACEPTAR";
    
    private static final String Cancelar="CANCELAR";
    
    private static final String Quitar="QUITAR";
    
    private static final String Agregar="AGREGAR";
    //para editar puntos
    
    JTextField txtPunto1X;
    
    JTextField txtPunto1Y;
    
    JTextField txtPunto2X;
    
    JTextField txtPunto2Y;
    
    JTextField txtPunto3X;
    
    JTextField txtPunto3Y;
    
    //algunas entradas de puntos que se pueden quitar, solo se puede qutar un punto y agregar uno
    JLabel lblPunto4;
    
    JTextField txtPunto4X;
    
    JTextField txtPunto4Y;
    
    JButton btnAceptar;
    
    JButton btnCancelar;
    
    JButton btnQuitar;
    
    JButton btnAgregar;
    
    //Labels de relleno
    
    JLabel relleno1=new JLabel("");
    
    JLabel relleno2=new JLabel("");
    
    JLabel relleno3=new JLabel("");
    
    private int cantidad;

    public PanelEdicion(InterfazPrincipal p) {
        
        this.padre = p;
        poligono = padre.getPoligono();
        //setBounds(500, 500, 400,400);
        GridLayout gd=new GridLayout(5, 3);
        setLayout(gd);
        
        cantidad=poligono.getListPoints().size();
        
        
        
        //PUNTO 1
        
        
        JLabel lblPunto1=new JLabel("PUNTO 1: ");
        lblPunto1.setFont(new Font("Arial", Font.BOLD, 15));
        
        add(lblPunto1);
        
        txtPunto1X=new JTextField(""+poligono.getListPoints().get(0).getPosicionX()+".0",12);
        add(txtPunto1X);
        
        txtPunto1Y=new JTextField(""+poligono.getListPoints().get(0).getPosicionY()+".0",12);
        add(txtPunto1Y);
        
        //PUNTO 2
        JLabel lblPunto2=new JLabel("PUNTO 2: ");
        lblPunto2.setFont(new Font("Arial", Font.BOLD, 15));
        
        add(lblPunto2);
        
        txtPunto2X=new JTextField(""+poligono.getListPoints().get(1).getPosicionX()+".0",12);
        add(txtPunto2X);
        
        txtPunto2Y=new JTextField(""+poligono.getListPoints().get(1).getPosicionY()+".0",12);
        add(txtPunto2Y);
        
        //PUNTO 3
       
        JLabel lblPunto3=new JLabel("PUNTO 3: ");
        lblPunto3.setFont(new Font("Arial", Font.BOLD, 15));
        
        add(lblPunto3);
        
        txtPunto3X=new JTextField(""+poligono.getListPoints().get(2).getPosicionY()+".0",12);
        add(txtPunto3X);
        
        txtPunto3Y=new JTextField(""+poligono.getListPoints().get(2).getPosicionY()+".0",12);
        add(txtPunto3Y);
        
        
        
        
        if (cantidad>3) {
            lblPunto4=new JLabel("PUNTO 4: ");
            lblPunto4.setFont(new Font("Arial", Font.BOLD, 15));
            add(lblPunto4);
            
            txtPunto4X=new JTextField(""+poligono.getListPoints().get(3).getPosicionX()+".0",12);
            add(txtPunto4X);
        
            txtPunto4Y=new JTextField(""+poligono.getListPoints().get(3).getPosicionY()+".0",12);
            add(txtPunto4Y);
            
        }
        
        
        //add
        asignarBotones();
        
        
        
        
        
        
        pack();
        
        
        
        
        
    }
    
    private void asignarBotones(){
        
        if (cantidad>3) {
            btnQuitar=new JButton("QUITAR");
            btnQuitar.setActionCommand(Quitar);
            btnQuitar.addActionListener(this);
            add(btnQuitar);
            
        }else{
            this.add(relleno1);
            this.add(relleno2);
            this.add(relleno3);
            btnAgregar=new JButton("AGREGAR");
            btnAgregar.setActionCommand(Agregar);
            btnAgregar.addActionListener(this);
            add(btnAgregar);
            
        }
        //btn aceptar
        btnAceptar=new JButton("ACEPTAR");
        btnAceptar.setActionCommand(Aceptar);
        btnAceptar.addActionListener(this);
        add(btnAceptar);
        
        // btnCancelar
        
        btnCancelar=new JButton("CANCELAR");
        btnCancelar.setActionCommand(Cancelar);
        btnCancelar.addActionListener(this);
        add(btnCancelar);
    }
    
    
    
    private void quitarPunto(){
        
            
        if (cantidad <= 3) {
               JOptionPane.showMessageDialog(this, 
                   "No pueden haber menos de 3 puntos", 
                   "Error", 
                   JOptionPane.ERROR_MESSAGE);
               return; // Salir del método sin hacer cambios
        }else{
            
            if (poligono.getListPoints().size()==3) {
                
                JOptionPane.showMessageDialog(this, 
                   "Primero agrege el punto nuevo", 
                   "Error", 
                   JOptionPane.ERROR_MESSAGE);
               return;
                
            }
            
                
        try {
            poligono.getListPoints().remove(3);
            cantidad = poligono.getListPoints().size();
            System.out.println("" + cantidad);
            this.remove(this.lblPunto4);
            this.remove(this.txtPunto4X);
            this.remove(this.txtPunto4Y);
            this.remove(this.btnAceptar);
            this.remove(this.btnCancelar);

           
            this.remove(this.btnQuitar);

            

            
            System.out.println("cantidad: " + cantidad);
            asignarBotones();

            //agregando todo otra vez
            this.revalidate();
            this.repaint();

            //quitando el punto del triangulo
           

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al quitar el punto: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        }
       
        
    }
    
    private void AgregarPunto(){
        
        if (cantidad>3) {
            
            JOptionPane.showMessageDialog(null, "alert", "No e pueden agregar más puntos", JOptionPane.ERROR_MESSAGE);
        }else{
            cantidad=4;
            
            this.remove(this.relleno1);
            this.remove(this.relleno2);
            this.remove(this.relleno3);
            
            this.remove(this.btnAgregar);
            this.remove(this.btnAceptar);
            this.remove(this.btnCancelar);
            lblPunto4=new JLabel("PUNTO 4: ");
            lblPunto4.setFont(new Font("Arial", Font.BOLD, 15));
            add(lblPunto4);
            
            txtPunto4X=new JTextField("0.0",12);
            add(txtPunto4X);
        
            txtPunto4Y=new JTextField("0.0",12);
            add(txtPunto4Y);
            
            asignarBotones();
            this.revalidate();
            this.repaint();
        }
        
        
        
    }
    
    private void editarPoligono(){
        
        try {
                ArrayList<Point> listaPuntos = new ArrayList<>();

                // PUNTO 1
                String texto1X = txtPunto1X.getText().trim();
                String texto1Y = txtPunto1Y.getText().trim();

                if (texto1X.isEmpty() || texto1Y.isEmpty()) {
                    JOptionPane.showMessageDialog(this, 
                        "El punto 1 no puede estar vacío", 
                        "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                double x1 = Double.parseDouble(texto1X);
                double y1 = Double.parseDouble(texto1Y);
                listaPuntos.add(new Point((int)x1, (int)y1));

                // PUNTO 2
                String texto2X = txtPunto2X.getText().trim();
                String texto2Y = txtPunto2Y.getText().trim();

                if (texto2X.isEmpty() || texto2Y.isEmpty()) {
                    JOptionPane.showMessageDialog(this, 
                        "El punto 2 no puede estar vacío", 
                        "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                double x2 = Double.parseDouble(texto2X);
                double y2 = Double.parseDouble(texto2Y);
                listaPuntos.add(new Point((int)x2, (int)y2));

                // PUNTO 3
                String texto3X = txtPunto3X.getText().trim();
                String texto3Y = txtPunto3Y.getText().trim();

                if (texto3X.isEmpty() || texto3Y.isEmpty()) {
                    JOptionPane.showMessageDialog(this, 
                        "El punto 3 no puede estar vacío", 
                        "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                double x3 = Double.parseDouble(texto3X);
                double y3 = Double.parseDouble(texto3Y);
                listaPuntos.add(new Point((int)x3, (int)y3));

                // PUNTO 4 (si existe)
                if (cantidad > 3) {
                    String texto4X = txtPunto4X.getText().trim();
                    String texto4Y = txtPunto4Y.getText().trim();

                    if (texto4X.isEmpty() || texto4Y.isEmpty()) {
                        JOptionPane.showMessageDialog(this, 
                            "El punto 4 no puede estar vacío", 
                            "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    double x4 = Double.parseDouble(texto4X);
                    double y4 = Double.parseDouble(texto4Y);
                    listaPuntos.add(new Point((int)x4, (int)y4));
                }

                // Actualizar el polígono
                padre.figura.setListPoints(listaPuntos);
                padre.repintar();
                padre.setEnabled(true);
                this.setVisible(false);

                JOptionPane.showMessageDialog(this, 
                    "Polígono editado exitosamente", 
                    "Éxito", 
                    JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, 
                    "Por favor ingrese solo números válidos", 
                    "Error de formato", 
                    JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, 
                    "Error al editar: " + e.getMessage(), 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
        
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (Aceptar.equals(e.getActionCommand())) {
            
            editarPoligono();
            
        }else if (Cancelar.equals(e.getActionCommand())) {
            
            //padre.repaint();
            padre.setEnabled(true);
            
            setVisible(false);
        }else if (Quitar.equals(e.getActionCommand())) {
            
            quitarPunto();
            
        }else if (Agregar.equals(e.getActionCommand())) {
            
            AgregarPunto();
            
        }
    
    
    }
    
    
    
    
    
    
}
