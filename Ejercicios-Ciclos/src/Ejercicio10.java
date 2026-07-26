import javax.swing.*;

    public class Ejercicio10 {
        public static void main(String[] args) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numero de Fibonacci"));
            int a = 0;
            int b = 1;
            String serie = "";
            for (int i = 1; i <= numero; i++) {

                serie += a;

                if (i < numero) {
                    serie += ", ";
                }
                int resultado = a + b;
                a = b;
                b = resultado;
            }

            JOptionPane.showMessageDialog(null, "Serie de Fibonacci:\n" + serie);
        }
    }