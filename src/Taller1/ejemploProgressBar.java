package Taller1;

import javax.swing.*;
import java.awt.event.*;

public class ejemploProgressBar {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo de JProgressBar");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 500);
        ventana.setLayout(null);

        JProgressBar progressBar;
        progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        progressBar.setBounds(100, 100, 100, 100);
        ventana.add(progressBar);

        JButton botonIniciar = new JButton("Iniciar Progreso");
        botonIniciar.setBounds(150, 100, 150, 30);
        ventana.add(botonIniciar);
        
        //Bibliografia del progreso: Oracle. "The Java™ Tutorials: Creating a GUI With JFC/Swing"

        botonIniciar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Reiniciar el valor de la barra a 0
                progressBar.setValue(0);
                
                // Crear un temporizador para actualizar la barra
                Timer timer = new Timer(50, new ActionListener() { // Cambia el valor según el intervalo
                    int value = 0;  // Valor inicial

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Incrementar el valor en 1
                        value += 1;

                        if (value > 100) {
                            value = 100;  // Asegúrate de no sobrepasar 100
                            ((Timer) e.getSource()).stop();  // Detener el timer
                        }

                        progressBar.setValue(value);  // Actualizar la barra de progreso
                    }
                });

                timer.start();  // Iniciar el temporizador
            }
        });

        ventana.setVisible(true);

    }

}
