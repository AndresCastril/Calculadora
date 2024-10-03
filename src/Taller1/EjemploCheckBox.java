package Taller1;

import javax.swing.*;
import java.awt.event.*;

public class EjemploCheckBox {

    public static void main(String[] args) {
        /*CheckBox  son Casillas de verificación 
    que permiten al usuario seleccionar una o mas
    de las opciones propuestas
         */
    JFrame ventana = new JFrame("ventana");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setSize(800, 500);
    ventana.setLayout(null);
    
    JButton boton = new JButton("Terminar");
    boton.setBounds(50, 150, 100, 30);
    ventana.add(boton);

    JCheckBox check1=new JCheckBox();
    check1.setText("check1");
    check1.setBounds(20, 30, 120, 30);
    ventana.add(check1);
  
    JCheckBox check2=new JCheckBox();
    check2.setText("check2");
    check2.setBounds(20, 60, 120, 30);
    ventana.add(check2);
  
    JCheckBox check3=new JCheckBox();
    check3.setText("check3");
    check3.setBounds(20, 90, 120, 30);
    ventana.add(check3);
    
     boton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
               String cad = "";

        if (check1.isSelected()) {
            cad += "Check 1 Seleccionado. ";
        }
        if (check2.isSelected()) {
            cad += "Check 2 Seleccionado. ";
        }
        if (check3.isSelected()) {
            cad += "Check 3 Seleccionado. ";
        }

        JOptionPane.showMessageDialog(null, cad);
            }
        });
    
    ventana.setVisible(true);
      
    }
    
}
