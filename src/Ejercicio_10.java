import javax.swing.*;

public class Ejercicio_10 {
    public static void main(String[]args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("defina la cantidad de elementos de la serie"));

        int a = 0;
        int b = 1;
        String serie = "";

        for (int i = 1; i <= n; i++){
            serie += a + " ";

            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println("serie de fibonacci generada: " + serie);
    }
}
