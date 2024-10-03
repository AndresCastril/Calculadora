package Taller1;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class EjemploSlider {
    public static void main(String[] args) {
         JFrame ventana = new JFrame("Tamaño de un boton");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 500);
        ventana.setLayout(null);
        
        JLabel etiqueta = new JLabel();
        etiqueta.setBounds(150, 205, 200, 30);
        ventana.add(etiqueta);
        
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(350, 205, 200, 30);
        ventana.add(etiqueta2);
       
       
        
        JSlider slider = new JSlider(0, 200, 120);
        ventana.add(slider);
        slider.setBounds(150, 150, 400, 400);
        slider.setPaintTrack(true);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(5);
        
        JSlider slider2 = new JSlider(0, 200, 120);
        ventana.add(slider2);
        slider2.setBounds(150, 250, 400, 50); 
        slider2.setPaintTrack(true);
        slider2.setPaintTicks(true);
        slider2.setPaintLabels(true);
        slider2.setMajorTickSpacing(50);
        slider2.setMinorTickSpacing(5);
        
        
        JButton boton = new JButton("Texto");
        ventana.add(boton);
        
         // Añadir el listener para detectar cambios en el valor del slider
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                
                // Actualizar la etiqueta con el valor actual del slider
                etiqueta.setText("Valor de x: " + slider.getValue());
                ventana.revalidate(); //Esto evita que desaparesca la etiqueta cuando se suelta el slider
                ventana.repaint();
                boton.setBounds(150, 10, slider.getValue(), slider2.getValue());
                ventana.revalidate(); //Esto evita que desaparesca la etiqueta cuando se suelta el slider
                ventana.repaint();
                
            }
        });
        slider2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                
                // Actualizar la etiqueta con el valor actual del slider
              
                etiqueta2.setText("Valor de y: " + slider2.getValue());
                boton.setBounds(150, 10, slider.getValue(), slider2.getValue());
                ventana.revalidate(); //Esto evita que desaparesca la etiqueta cuando se suelta el slider
                ventana.repaint();
                
            }
        });

        // Añadir el slider a la ventana
        ventana.add(slider);

        // Mostrar el valor inicial del slider en la etiqueta
        etiqueta.setText("Valor del slider: " + slider.getValue());
        
        
        
        ventana.setVisible(true);
        
        
    }
}
