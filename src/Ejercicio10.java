import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos términos de Fibonacci quieres generar?"));

        StringBuilder serie = new StringBuilder();
        long anterior = 0;
        long actual = 1;

        for (int i = 1; i <= n; i++) {
            serie.append(anterior);
            if (i < n) {
                serie.append(", ");
            }
            long siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;
        }

        JOptionPane.showMessageDialog(null, serie.toString());
    }
}