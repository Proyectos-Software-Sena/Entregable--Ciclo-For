import javax.swing.*;

public class ejercicio3 {
    public static void main(String[] args) {
        int cantTemp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de valores de temperatura "));
        double max = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la temperatura : 1"));

        // Ciclo desde el segundo valor hasta el último
        for (int i = 2; i <= cantTemp; i++) {
            double valores = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la temperatura : " + i));
            if (valores > max) {
                max = valores;
            }
        }
        System.out.println("El valor maximo registrado es " + max + "°");
    }
}
