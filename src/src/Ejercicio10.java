import javax.swing.*;

public class Ejercicio10 {
    public static void main(String[] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de términos a generar:"));

        int a = 0;
        int b = 1;
        String resultado = "";

        for (int i = 1; i <= n; i++) {
            resultado = resultado + a;

            if (i < n) {
                resultado = resultado + ", ";
            }

            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        JOptionPane.showMessageDialog(null, "Serie de Fibonacci (" + n + " términos):\n" + resultado);
    }
}
