import javax.swing.*;

public class Ejercicio10 {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos terminos de Fibonacci desea generar: ")) ;

        int anterior = 0;
        int actual = 1;
        String resultado = "";

        for (int i = 0; i < n; i++){

            resultado += anterior ;

            if (i < n - 1) {
                resultado += ", ";
            }

            int siguente = anterior + actual;

            anterior = actual;
            actual = siguente;

        }

        JOptionPane.showMessageDialog(null, resultado);

    }
}
