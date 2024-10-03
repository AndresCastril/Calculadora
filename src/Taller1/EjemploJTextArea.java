
package Taller1;

import javax.swing.*;
import java.awt.event.*;

public class EjemploJTextArea {
    public static void main(String[] args) {
         JFrame ventana = new JFrame("ventana");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 500);
        ventana.setLayout(null);
        
        JLabel etiqueta = new JLabel("De: ");
        etiqueta.setBounds(5, 5, 200, 30);
        ventana.add(etiqueta);
        
        JTextField campo1 = new JTextField();
        campo1.setBounds(51, 5, 200, 30);
        ventana.add(campo1);
        
        JLabel etiqueta1 = new JLabel("Para: ");
        etiqueta1.setBounds(282, 5, 200, 30);
        ventana.add(etiqueta1);
        
         JTextField campo2 = new JTextField();
        campo2.setBounds(400, 5, 200, 30);
        ventana.add(campo2);

        JButton boton = new JButton("enviar");
        boton.setBounds(50, 370, 100, 30);
        ventana.add(boton);
        
        JTextArea textarea1=new JTextArea();
        textarea1.setBounds(30,50,400,300);
        ventana.add(textarea1);
        
         boton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
               String De = campo1.getText();
               String Para = campo2.getText();
               String escrito = textarea1.getText();
                if (!De.isEmpty() & !Para.isEmpty() & !escrito.isEmpty()){
               JOptionPane.showMessageDialog(null, "Correo enviado a: " + Para + "\n De: " + De
               + "\n mensaje: \n" + escrito);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        ventana.setVisible(true);
    }
    
}
