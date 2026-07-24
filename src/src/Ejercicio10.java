import javax.swing.*;

public class Ejercicio10 {
    static void main() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de términos de Fibonacci:"));
        int a = 0;
        int b = 1;
        String serie = "";

        for (int i = 0; i < n; i++) {
            if (i > 0) {
                serie += ", ";
            }
            serie += a;
            int temp = a + b;
            a = b;
            b = temp;
        }

        JOptionPane.showMessageDialog(null, "Serie de Fibonacci: " + serie);
    }
}
