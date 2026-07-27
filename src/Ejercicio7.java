import javax.swing.*;

public class Ejercicio7 {
    public static   void main (String[] args){

        double tasaCambio = Double.parseDouble(JOptionPane.showInputDialog("Tasa de Cambio Representativa del Mercado (TRM) del día"));


        for (int i = 1; i <= 10; i++){

            double cambio = i * tasaCambio;

            System.out.println(i + "USD = " + cambio + "COP");
        }

    }
}
