package Taller1;

import javax.swing.*;

public class EjemploJList {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo de JSlider");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 500);
        ventana.setLayout(null);
        String nombres[] = {"Cristian", "Julian", "Milena"};
        JList listaNombres = new JList(nombres);
        listaNombres.setBounds(100, 100, 100, 100);
        ventana.add(listaNombres);
        ventana.setVisible(true);
        //idea de agregar un nombre a la lista con campos https://codejavu.blogspot.com/2013/12/ejemplo-jlist.html
    }

}
