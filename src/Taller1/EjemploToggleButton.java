
package Taller1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EjemploToggleButton {

    public static void main(String[] args) {
        // Crear la ventana
        JFrame ventana = new JFrame("Ejemplo de JToggleButton con Cambio de Color");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 200);
        ventana.setLayout(null);

        // Crear el ToggleButton
        JToggleButton toggleButton = new JToggleButton("Encender");
        toggleButton.setBounds(100, 50, 200, 50);
        ventana.add(toggleButton);

        // Crear una etiqueta para mostrar el estado
        JLabel label = new JLabel("El botón está apagado.");
        label.setBounds(100, 110, 200, 30);
        ventana.add(label);

        // Agregar evento al ToggleButton
        toggleButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                // Verificar el estado del ToggleButton
                if (toggleButton.isSelected()) {
                    toggleButton.setText("Apagar");
                    label.setText("El botón está encendido.");
                    ventana.getContentPane().setBackground(Color.GREEN); // Cambiar fondo a verde
                } else {
                    toggleButton.setText("Encender");
                    label.setText("El botón está apagado.");
                    ventana.getContentPane().setBackground(null);  // Fondo por defecto
                }
            }
        });

        ventana.setVisible(true);
    }
}
