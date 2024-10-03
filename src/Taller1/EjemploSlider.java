
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
/**
 *
 * @author mundo joven
 */
public class EjemploSlider {
    public static void main(String[] args) {
         JFrame ventana = new JFrame("Ejemplo de JSlider");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 500);
        ventana.setLayout(null);
        
        JLabel etiqueta = new JLabel();
        etiqueta.setBounds(150, 200, 200, 30);
        ventana.add(etiqueta);
       
        
        JSlider slider = new JSlider(0, 200, 120);
        ventana.add(slider);
        slider.setBounds(150, 50, 400, 400);
        slider.setPaintTrack(true);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(5);
        
         // Añadir el listener para detectar cambios en el valor del slider
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // Actualizar la etiqueta con el valor actual del slider
                etiqueta.setText("Valor del slider: " + slider.getValue());
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
