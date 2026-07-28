import javax.swing.*;
public class ejercicio10 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de términos de la serie de Fibonacci"));

        int a = 0, b = 1;

        String resultado = "";

        for (int i = 1; i <= n; i++) {
            resultado += a + (i < n ? ", " : ""); // agregar número y coma si no es el último
            int siguiente = a + b; // calcular siguiente término
            a = b;
            b = siguiente;
        }

        System.out.println(resultado);
        JOptionPane.showMessageDialog(null, resultado);
    }
}
