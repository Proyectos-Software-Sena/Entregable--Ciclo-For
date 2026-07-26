import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas lecturas de temperatura se tomaron?"));
        double maxima = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= cantidad; i++) {
            double temp = Double.parseDouble(JOptionPane.showInputDialog("Temperatura " + i + " (°C):"));
            if (temp > maxima) {
                maxima = temp;
            }
        }

        JOptionPane.showMessageDialog(null, "La temperatura máxima registrada fue: " + maxima + "°C");
    }
}
