package CalculadoraUAM;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class CalculadoraUAM {

    public static void main(String[] args) {
        
        JFrame ventana = new JFrame("Calculadora UAM");
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 600);
        ventana.setLayout(null);

        JLabel etiqueta = new JLabel("Calculadora UAM");
        etiqueta.setBounds(330, 10, 150, 50);
        ventana.add(etiqueta);

        JLabel etiqueta2 = new JLabel("numero 1");
        etiqueta2.setBounds(130, 100, 150, 30);
        ventana.add(etiqueta2);

        JLabel etiqueta3 = new JLabel();
        etiqueta3.setText("numero 2");
        etiqueta3.setBounds(590, 100, 150, 30);
        ventana.add(etiqueta3);

        JTextField campo1 = new JTextField();
        campo1.setBounds(90, 150, 150, 30);
        ventana.add(campo1);
        JTextField campo2 = new JTextField();
        campo2.setBounds(550, 150, 150, 30);
        ventana.add(campo2);

        String[] opciones = new String[4];
        opciones[0] = "SUMAR";
        opciones[1] = "RESTAR";
        opciones[2] = "MULTIPLICAR";
        opciones[3] = "DIVIDIR";
        JComboBox combo1 = new JComboBox(opciones);
        combo1.setBounds(310, 200, 150, 30);
        combo1.setSelectedIndex(0);
        ventana.add(combo1);

        JButton boton1 = new JButton("1");
        boton1.setBounds(250, 250, 70, 30);
        ventana.add(boton1);
        JButton boton2 = new JButton("2");
        boton2.setBounds(350, 250, 70, 30);
        ventana.add(boton2);

        JButton boton3 = new JButton("3");
        boton3.setBounds(450, 250, 70, 30);
        ventana.add(boton3);

        JButton boton4 = new JButton("4");
        boton4.setBounds(250, 300, 70, 30);
        ventana.add(boton4);

        JButton boton5 = new JButton("5");
        boton5.setBounds(350, 300, 70, 30);
        ventana.add(boton5);

        JButton boton6 = new JButton("6");
        boton6.setBounds(450, 300, 70, 30);
        ventana.add(boton6);

        JButton boton7 = new JButton("7");
        boton7.setBounds(250, 350, 70, 30);
        ventana.add(boton7);

        JButton boton8 = new JButton("8");
        boton8.setBounds(350, 350, 70, 30);
        ventana.add(boton8);

        JButton boton9 = new JButton("9");
        boton9.setBounds(450, 350, 70, 30);
        ventana.add(boton9);

        JButton boton0 = new JButton("0");
        boton0.setBounds(350, 400, 70, 30);
        ventana.add(boton0);

        JButton calcular = new JButton("calcular");
        calcular.setBounds(320, 450, 150, 30);
        ventana.add(calcular);

    
        boton1.addMouseListener(new MouseAdapter() {
            // Acción a realizar cuando se hace clic 
            @Override
            public void mouseClicked(MouseEvent e) {
                String numero = "1";
                String campoNumero1 = campo1.getText();
                String campoNumero2 = campo2.getText();
                if (campoNumero1.equals("")) {
                    campo1.setText(numero);
                } else if (campoNumero2.equals("")) {
                    campo2.setText(numero);
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede ingresar mas numeros", "INFO", JOptionPane.INFORMATION_MESSAGE);
                }
                /*String acomulado = campoNumero1+numero;
            campo1.setText(acomulado); */
            }
        });
        boton2.addMouseListener(new MouseAdapter() {
            // Acción a realizar cuando se hace clic 
            @Override
            public void mouseClicked(MouseEvent e) {
                String numero = "2";
                String campoNumero1 = campo1.getText();
                String campoNumero2 = campo2.getText();
                if (campoNumero1.equals("")) {
                    campo1.setText(numero);
                } else if (campoNumero2.equals("")) {
                    campo2.setText(numero);
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede ingresar mas numeros", "INFO", JOptionPane.INFORMATION_MESSAGE);
                }
                /*String acomulado = campoNumero1+numero;
            campo1.setText(acomulado); */
            }
        });
        boton3.addMouseListener(new MouseAdapter() {
            // Acción a realizar cuando se hace clic 
            @Override
            public void mouseClicked(MouseEvent e) {
                String numero = "3";
                String campoNumero1 = campo1.getText();
                String campoNumero2 = campo2.getText();
                if (campoNumero1.equals("")) {
                    campo1.setText(numero);
                } else if (campoNumero2.equals("")) {
                    campo2.setText(numero);
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede ingresar mas numeros", "INFO", JOptionPane.INFORMATION_MESSAGE);
                }
                /*String acomulado = campoNumero1+numero;
            campo1.setText(acomulado); */
            }
        });
        boton4.addMouseListener(new MouseAdapter() {
            // Acción a realizar cuando se hace clic 
            @Override
            public void mouseClicked(MouseEvent e) {
                String numero = "4";
                String campoNumero1 = campo1.getText();
                String campoNumero2 = campo2.getText();
                if (campoNumero1.equals("")) {
                    campo1.setText(numero);
                } else if (campoNumero2.equals("")) {
                    campo2.setText(numero);
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede ingresar mas numeros", "INFO", JOptionPane.INFORMATION_MESSAGE);
                }
                /*String acomulado = campoNumero1+numero;
            campo1.setText(acomulado); */
            }
        });
        boton5.addMouseListener(new MouseAdapter() {
            // Acción a realizar cuando se hace clic 
            @Override
            public void mouseClicked(MouseEvent e) {
                String numero = "5";
                String campoNumero1 = campo1.getText();
                String campoNumero2 = campo2.getText();
                if (campoNumero1.equals("")) {
                    campo1.setText(numero);
                } else if (campoNumero2.equals("")) {
                    campo2.setText(numero);
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede ingresar mas numeros", "INFO", JOptionPane.INFORMATION_MESSAGE);
                }
                /*String acomulado = campoNumero1+numero;
            campo1.setText(acomulado); */
            }
        });
        boton6.addMouseListener(new MouseAdapter() {
            // Acción a realizar cuando se hace clic 
            @Override
            public void mouseClicked(MouseEvent e) {
                String numero = "6";
                String campoNumero1 = campo1.getText();
                String campoNumero2 = campo2.getText();
                if (campoNumero1.equals("")) {
                    campo1.setText(numero);
                } else if (campoNumero2.equals("")) {
                    campo2.setText(numero);
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede ingresar mas numeros", "INFO", JOptionPane.INFORMATION_MESSAGE);
                }
                /*String acomulado = campoNumero1+numero;
            campo1.setText(acomulado); */
            }
        });
        boton7.addMouseListener(new MouseAdapter() {
            // Acción a realizar cuando se hace clic 
            @Override
            public void mouseClicked(MouseEvent e) {
                String numero = "7";
                String campoNumero1 = campo1.getText();
                String campoNumero2 = campo2.getText();
                if (campoNumero1.equals("")) {
                    campo1.setText(numero);
                } else if (campoNumero2.equals("")) {
                    campo2.setText(numero);
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede ingresar mas numeros", "INFO", JOptionPane.INFORMATION_MESSAGE);
                }
                /*String acomulado = campoNumero1+numero;
            campo1.setText(acomulado); */
            }
        });
        boton8.addMouseListener(new MouseAdapter() {
            // Acción a realizar cuando se hace clic 
            @Override
            public void mouseClicked(MouseEvent e) {
                String numero = "8";
                String campoNumero1 = campo1.getText();
                String campoNumero2 = campo2.getText();
                if (campoNumero1.equals("")) {
                    campo1.setText(numero);
                } else if (campoNumero2.equals("")) {
                    campo2.setText(numero);
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede ingresar mas numeros", "INFO", JOptionPane.INFORMATION_MESSAGE);
                }
                /*String acomulado = campoNumero1+numero;
            campo1.setText(acomulado); */
            }
        });
        boton9.addMouseListener(new MouseAdapter() {
            // Acción a realizar cuando se hace clic 
            @Override
            public void mouseClicked(MouseEvent e) {
                String numero = "9";
                String campoNumero1 = campo1.getText();
                String campoNumero2 = campo2.getText();
                if (campoNumero1.equals("")) {
                    campo1.setText(numero);
                } else if (campoNumero2.equals("")) {
                    campo2.setText(numero);
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede ingresar mas numeros", "INFO", JOptionPane.INFORMATION_MESSAGE);
                }
                /*String acomulado = campoNumero1+numero;
            campo1.setText(acomulado); */
            }
        });
        boton0.addMouseListener(new MouseAdapter() {
            // Acción a realizar cuando se hace clic 
            @Override
            public void mouseClicked(MouseEvent e) {
                String numero = "0";
                String campoNumero1 = campo1.getText();
                String campoNumero2 = campo2.getText();
                if (campoNumero1.equals("")) {
                    campo1.setText(numero);
                } else if (campoNumero2.equals("")) {
                    campo2.setText(numero);
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede ingresar mas numeros", "INFO", JOptionPane.INFORMATION_MESSAGE);
                }
                /*String acomulado = campoNumero1+numero;
            campo1.setText(acomulado); */
            }
        });
        calcular.addMouseListener(new MouseAdapter() {
            // Acción a realizar cuando se hace clic 
            @Override
            public void mouseClicked(MouseEvent e) {
                double Numero1 = Integer.parseInt(campo1.getText());
                double Numero2 = Integer.parseInt(campo2.getText());

                String operaciones = combo1.getSelectedItem().toString();
                
                double resultado =0;
                
                switch(operaciones){
                    case "SUMAR":
                        resultado = Numero1 + Numero2;
                        break;
                    case "RESTAR":
                        resultado = Numero1 - Numero2;
                        break;
                    case "MULTIPLICAR":
                        resultado = Numero1 * Numero2;
                        break;
                      
                    case "DIVIDIR":
                        if(Numero2 == 0){
                            JOptionPane.showMessageDialog(null, "Operacion no valida (No se puede dividir entre 0)", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        else
                        resultado = Numero1 / Numero2;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Operación no válida", "ERROR", JOptionPane.ERROR_MESSAGE);
                        return;
                        
                }

                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "INFO", JOptionPane.INFORMATION_MESSAGE);

            }
        });
        
        ventana.setVisible(true);

        
    }
}
