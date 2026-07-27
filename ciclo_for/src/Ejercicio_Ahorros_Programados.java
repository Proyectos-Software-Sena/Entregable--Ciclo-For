
import javax.swing.*;
public class Ejercicio_Ahorros_Programados {
public static void main(String[] args){
            int monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto fijo a ahorrar cada mes:"));

            int meses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de meses de la proyección:"));

            int acumulado = 0;
            String resultado = "";

            // Ciclo para calcular acumulado mes a mes
            for (int i = 1; i <= meses; i++) {
                acumulado += monto;
                resultado += "Mes " + i + ": $" + acumulado + "\n";
            }
            JOptionPane.showMessageDialog(null, resultado);


        }
    }