import javax.swing.*;

public class Ejercicio10 {

    public static void main(String[] args){

        int cantidad;
        int a = 0;
        int b = 1;
        int siguiente;
        String serie = "";

        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos terminos desea generar?"));

        for (int i = 1; i <= cantidad; i++){

            serie = serie + a + " ";

            siguiente = a + b;
            a = b;
            b = siguiente;
        }

        JOptionPane.showMessageDialog(null, "Serie de fibonacci:\n" + serie);
    }
}
