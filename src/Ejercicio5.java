import javax.swing.*;

public class Ejercicio5 {
    public static void main (String[] args){

        double montoAhorro = Double.parseDouble(JOptionPane.showInputDialog("ingrese el monto que dese ahorrar mensualmente"));
        int mesesAhorro = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de meses de proyeccion "));
        double totalAhorros = 0;

        for (int i = 1; i <= mesesAhorro; i++){
            totalAhorros = totalAhorros + montoAhorro;

            System.out.println( "mes " + i + ": $" + totalAhorros);
        }
    }
}
