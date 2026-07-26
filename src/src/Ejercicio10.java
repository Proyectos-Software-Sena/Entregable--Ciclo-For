import javax.swing.*;

public class Ejercicio10 {
    public static void main (String[] args){

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de términos:"));
        int a = 0;
        int b = 1;
        int siguiente;
        String mensaje = "";

        for ( int i =1; i <= cantidad; i++) {

            mensaje = mensaje + a + ", ";

            siguiente = a + b;
            a = b;
            b = siguiente;
        }
        JOptionPane.showMessageDialog(null, "Serie de Fibonacci: \n" + mensaje);

        }
    }
