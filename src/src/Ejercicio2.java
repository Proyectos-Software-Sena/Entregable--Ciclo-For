import javax.swing.*;
public class Ejercicio2 {
    public static void main(String[] args) {
        int numPiezas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de piezas"));
        int aprobadas = 0, reprobadas = 0;

        for (int i = 1; i <= numPiezas; i++) {
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso (gramos)"));
            if (peso < 100 || peso > 120){
                aprobadas++;
            }
            else {
                reprobadas++;
            }
        }
        System.out.println("Piezas aprobadas: " + aprobadas +
                "\n"
                +
                "Piezas reprobadas: " + reprobadas);
    }
}
