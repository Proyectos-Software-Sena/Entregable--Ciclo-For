import javax.swing.*;

public class Ejercicio2 {
    static void main() {
        int numeroPiezas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de piezas vendidas:"));
        int piezasAprobadas = 0;
        int piezasRechazadas = 0;

        for(int i = 0; i < numeroPiezas; i++) {
            int pieza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estado de la pieza " + (i + 1) + ":"));
            if (pieza < 100 || pieza > 120) {
                piezasRechazadas++;
            } else {
                piezasAprobadas++;
            }
        }
        JOptionPane.showMessageDialog(null, "Piezas aprobadas: " + piezasAprobadas + "\nPiezas rechazadas: " + piezasRechazadas);
    }
}
