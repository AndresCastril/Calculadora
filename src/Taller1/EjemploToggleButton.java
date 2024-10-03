
package Taller1;
import javax.swing.*;
import java.awt.event.*;

public class EjemploToggleButton {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo de ToggleButton");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 500);
        ventana.setLayout(null);
        
         JToggleButton toggleButton = new JToggleButton("Botón Toggle");
        toggleButton.setBounds(0, 0, 300, 30);
        ventana.add(toggleButton);
        
        JLabel label1 = new JLabel("");
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setBounds(0, 30, 300, 30);
        ventana.add(label1);
        
         toggleButton.addItemListener(new ItemListener() {
 
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                int estado = itemEvent.getStateChange();
                if(estado == ItemEvent.SELECTED){
                    label1.setText("Botón seleccionado");
                } else {
                    label1.setText("Botón deseleccionado");
                }
            }
        });
        
        ventana.setVisible(true);
 
    }
    
}
