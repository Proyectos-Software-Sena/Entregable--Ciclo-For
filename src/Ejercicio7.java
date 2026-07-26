import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args) {

        double tasaCambio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tasa de cambio representativa del mercado del día : ")) ;

        for (int i = 1; i <= 10; i++) {
            double pesos = i * tasaCambio ;
            System.out.println(i + " USD = " + pesos + " COP");
            JOptionPane.showMessageDialog(null,i + " USD = " + pesos + " COP" );

        }

    }
}
