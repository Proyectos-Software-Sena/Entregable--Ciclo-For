import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {

        double Ahorro, sumaAhorro;

        int meses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de meses de la proyección"));
        sumaAhorro = 0;
        Ahorro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese monto fijo a ahorrar cada mes: "));

        for ( int contador = 1;
              contador <= meses;
              contador++){

            sumaAhorro = sumaAhorro + Ahorro;


            JOptionPane.showMessageDialog(null,"Mes" + contador + ": $" + sumaAhorro);

        }
    }
}
