
package Taller1;

import javax.swing.*;
import java.awt.event.*;

public class EjemploJTextArea {
    public static void main(String[] args) {
         JFrame ventana = new JFrame("ventana");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 500);
        ventana.setLayout(null);

        JButton boton = new JButton("Terminar");
        boton.setBounds(50, 370, 100, 30);
        ventana.add(boton);
        
        JTextArea textarea1=new JTextArea();
        textarea1.setBounds(10,50,400,300);
        ventana.add(textarea1);
        ventana.setVisible(true);
    }
    
}
