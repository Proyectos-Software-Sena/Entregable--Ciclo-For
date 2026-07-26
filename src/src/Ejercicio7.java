import javax.swing.*;

public class Ejercicio7 {
    public static void main (String[] args){

       double tasaCambio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tasa de cambio del dia"));
       double multiplicacion = 0;
       double pesos;

       for (int i= 1; i <= 10; i++){
           pesos = i * tasaCambio;
           JOptionPane.showMessageDialog(null, i + "USD =" + pesos + "COP");
       }
    }
}
