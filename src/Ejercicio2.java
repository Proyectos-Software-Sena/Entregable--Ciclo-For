
import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("¿Cuántas piezas se van a revisar?");
        int cantidad = Integer.parseInt(input);

        int aprobadas = 0;
        int defectuosas = 0;

        for (int i = 1; i <= cantidad; i++) {
            String pesoInput = JOptionPane.showInputDialog("Peso de la pieza " + i + " (g):");
            double peso = Double.parseDouble(pesoInput);

            if (peso < 100 || peso > 120) {
                defectuosas++;
            } else {
                aprobadas++;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Piezas aprobadas: " + aprobadas + " Piezas defectuosas: " + defectuosas);
    }
}
