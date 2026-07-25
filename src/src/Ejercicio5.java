import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args){

        double ahorroMensual;
        double acumulado = 0;
        int cantidadMeses;
        String resultado = "";

        ahorroMensual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto que ahorrara cada mes:"));
        cantidadMeses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de meses:"));

        for (int i =  1; i <= cantidadMeses; i++){
            acumulado = acumulado + ahorroMensual;
            resultado = resultado + "Mes " + i + ": $" + acumulado + "\n";
        }

        JOptionPane.showMessageDialog(null,resultado);
    }
}
