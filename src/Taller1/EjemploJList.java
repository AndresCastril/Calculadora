package Taller1;
//idea de agregar un nombre a la lista con campos https://codejavu.blogspot.com/2013/12/ejemplo-jlist.html
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class EjemploJList {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Agregar empleados");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 500);
        ventana.setLayout(null);
        
         DefaultListModel<String> modeloLista = new DefaultListModel<>();
        modeloLista.addElement("Cristian");
        modeloLista.addElement("Julian");
        modeloLista.addElement("Milena");
        //dinamico para añadir elementos
        JList<String> listaNombres = new JList<>(modeloLista);
      
      
        
        JScrollPane scroll = new JScrollPane(listaNombres);
         ventana.add(scroll);
         scroll.setBounds(10, 50, 300,300);
        
        
        JTextField campo = new JTextField();
        campo.setBounds(10, 10, 200, 30);
        ventana.add(campo);
        JButton boton = new JButton("añadir");
        boton.setBounds(250, 10, 100, 30);
        ventana.add(boton);
         boton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
               String nombre = campo.getText();
                if (!nombre.isEmpty()) {
                    modeloLista.addElement(nombre);  
                    campo.setText("");  // Limpiar el campo de texto después de añadir
                } else {
                    JOptionPane.showMessageDialog(null, "El campo de texto está vacío");
                }
            }
        });
        ventana.setVisible(true);
        
    }

}
