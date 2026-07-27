import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args){
        int totalPiezas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de piezas a evaluar:"));
        int aprobadas = 0;
        int defectuosas = 0;

        for (int i = 1; i <= totalPiezas; i++) {
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso en gramos de la pieza " + i + ":"));

            if (peso < 100 || peso > 120) {
                defectuosas++;
            } else {
                aprobadas++;
            }
        }

        JOptionPane.showMessageDialog(null, "Resultados de la revisión:" + "Piezas aprobadas: " + aprobadas  + "Piezas defectuosas: " + defectuosas);
    }
}
