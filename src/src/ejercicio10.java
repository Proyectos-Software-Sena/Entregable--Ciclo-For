import javax.swing.*;

public class ejercicio10 {
    static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de terminos que desea generar: "));

        int a = 0;
        int b = 1;
        int siguiente;

        String serie = "";

        for (int i = 1; i <= n; i++){

            serie += a + " ";

            siguiente = a + b;
            a = b;
            b = siguiente;
        }

        JOptionPane.showMessageDialog(null, serie);
    }
}
