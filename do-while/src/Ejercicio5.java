import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {

        double Ahorro, sumaAhorro;
        int meses, contador;

        contador = 1;
        sumaAhorro = 0;


        meses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de meses de la proyección"));
        montoAhorro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese monto fijo a ahorrar cada mes: "));
        do {
            sumaAhorro = sumaAhorro + montoAhorro;
            contador++;

            JOptionPane.showMessageDialog(null,"Mes" + contador + ": $" + sumaAhorro);

        }while (contador <= meses);
    }
}
