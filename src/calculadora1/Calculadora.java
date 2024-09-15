
package calculadora1;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Calculadora {
    public static void main(String[] args) {
        Operaciones calculadora = new Operaciones();
        Scanner entrada = new Scanner(System.in);
        
        JOptionPane.showMessageDialog(null, "!Bienvenido a mi calculadora!");
        
        String opcion = "";
        double acomulado = 0;
        while(!opcion.equals("5")){
        JOptionPane.showMessageDialog(null, "1. suma, 2. restar, 3. multiplicar, 4. dividir, 5. salir, 6. limpiar");
        opcion = JOptionPane.showInputDialog(" ");
         if(opcion.equals("1")){ 
             
            JOptionPane.showMessageDialog(null, "Ingrese el numero 1: "); 
            double numero1 = Integer.parseInt(JOptionPane.showInputDialog(""));
            JOptionPane.showMessageDialog(null, "Ingrese el numero 2: "); 
            double numero2 = Integer.parseInt(JOptionPane.showInputDialog(""));
            double resultado = acomulado + calculadora.sumar(numero1, numero2);
            acomulado = resultado;
            JOptionPane.showMessageDialog(null, numero1 + " + " + numero2+ " = " + resultado); 
            
        }
        if(opcion.equals("2")){
            JOptionPane.showMessageDialog(null, "Ingrese el numero 1: "); 
            double numero1 = Integer.parseInt(JOptionPane.showInputDialog(""));
            JOptionPane.showMessageDialog(null, "Ingrese el numero 2: "); 
            double numero2 = Integer.parseInt(JOptionPane.showInputDialog(""));
            double resultado = acomulado + calculadora.restar(numero1, numero2);
            acomulado = resultado;
            JOptionPane.showMessageDialog(null, numero1 + " - " + numero2+ " = " + resultado);
        }
        if(opcion.equals("3")){
            JOptionPane.showMessageDialog(null, "Ingrese el numero 1: "); 
            double numero1 = Integer.parseInt(JOptionPane.showInputDialog(""));
            JOptionPane.showMessageDialog(null, "Ingrese el numero 2: "); 
            double numero2 = Integer.parseInt(JOptionPane.showInputDialog(""));
            double resultado = acomulado + calculadora.multiplicar(numero1, numero2);
            acomulado = resultado;
            JOptionPane.showMessageDialog(null, numero1 + " * " + numero2+ " = " + resultado);
        }
        if(opcion.equals("4")){
            JOptionPane.showMessageDialog(null, "Ingrese el numero 1: "); 
            double numero1 = Integer.parseInt(JOptionPane.showInputDialog(""));
            JOptionPane.showMessageDialog(null, "Ingrese el numero 2: "); 
            double numero2 = Integer.parseInt(JOptionPane.showInputDialog(""));
            double resultado = acomulado + calculadora.dividir(numero1, numero2);
            acomulado = resultado;
            JOptionPane.showMessageDialog(null, numero1 + " / " + numero2+ " = " + resultado);
        }
     
        if(opcion.equals("5")){
            return;
        }
        if(opcion.equals("6")){
            acomulado = 0;
        }
        
    }
    
}
}
