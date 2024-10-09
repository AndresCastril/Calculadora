package Taller1;
//Librerias necesarias
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author mundo joven
 */
public class EjemploRadioButton {

    public static void main(String[] args) {
        /* tipo de widget utilizado en interfaces gráficas 
         de usuario que permite elegir una sola opción de un 
         conjunto predeterminado de estas.
         */
        JFrame ventana = new JFrame("ventana ejemplo RadioButton");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 500);
        ventana.setLayout(null);

        JButton boton = new JButton("Terminar");
        boton.setBounds(50, 150, 100, 30);
        ventana.add(boton);
        
         JLabel etiqueta = new JLabel("En que año ocurrió el grito de independencia de Colombia?: ");
        etiqueta.setBounds(5, 5, 450, 50);
        ventana.add(etiqueta);

        JRadioButton rbtn1 = new JRadioButton("1810", false);
        JRadioButton rbtn2 = new JRadioButton("1845", false);
        JRadioButton rbtn3 = new JRadioButton("1932", false);
//El ButtonGroup hace que los JRadioButton funcionen
//cuando eliges uno, los otros se desmarcan solos
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(rbtn1);
        grupo1.add(rbtn2);
        grupo1.add(rbtn3);

        ventana.add(rbtn1);
        ventana.add(rbtn2);
        ventana.add(rbtn3);

        rbtn1.setBounds(50, 50, 100, 30);
        rbtn2.setBounds(50, 80, 100, 30);
        rbtn3.setBounds(50, 110, 100, 30);

        ventana.setVisible(true);
         boton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
               String cad = "";

        if (rbtn1.isSelected()) {
            cad += "Es correcto!! fue en 1810";
        }
        if (rbtn2.isSelected()) {
            cad += "Respuesta incorrecta :( ";
        }
        if (rbtn3.isSelected()) {
            cad += "Respuesta incorrecta D:";
        }

        JOptionPane.showMessageDialog(null, cad);
            }
        });
    
    ventana.setVisible(true);
      
    }

    }


