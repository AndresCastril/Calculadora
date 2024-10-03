package Taller1;

import javax.swing.*;
import java.awt.event.*;

public class EjemploCheckBox {

    public static void main(String[] args) {
        /*CheckBox  son Casillas de verificación 
    que permiten al usuario seleccionar una o mas
    de las opciones propuestas
         */
    JFrame ventana = new JFrame("ventana ejemplo CheckBox");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setSize(800, 500);
    ventana.setLayout(null);
    
    JLabel etiqueta = new JLabel("Seleccione todas las frutas: ");
    etiqueta.setBounds(5, 5, 250, 50);
    ventana.add(etiqueta);
    
    JButton boton = new JButton("Terminar");
    boton.setBounds(50, 150, 100, 30);
    ventana.add(boton);

    JCheckBox check1=new JCheckBox();
    check1.setText("Banano");
    check1.setBounds(20, 50, 120, 30);
    ventana.add(check1);
  
    JCheckBox check2=new JCheckBox();
    check2.setText("Manzana");
    check2.setBounds(20, 80, 120, 30);
    ventana.add(check2);
  
    JCheckBox check3=new JCheckBox();
    check3.setText("Brócoli");
    check3.setBounds(20, 110, 120, 30);
    ventana.add(check3);
    
     boton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
               String cad = "";

        if (check1.isSelected()) {
            cad = "banano es fruta. te falta una fruta por seleccionar ";
        }
        if (check2.isSelected()) {
            cad = "Manzana es fruta. te falta una fruta por seleccionar ";
        }
        if (check3.isSelected()) {
            cad = "Brócoli no es una fruta, es una verduta!!. ";
        }
        if(check1.isSelected() & check2.isSelected() & !check3.isSelected()){
            cad = "Manzana y Banano son frutas, es correcto!!. ";
        }

        JOptionPane.showMessageDialog(null, cad);
            }
        });
    
    ventana.setVisible(true);
      
    }
    
}
