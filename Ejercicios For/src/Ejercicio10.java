import javax.swing.*;

public class Ejercicio10 {
        public static void main(String[] args){

            int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Defina" +
                    " la cantidad de elementos de la serie: "));

            System.out.println("Serie de Fibonacci:");

            int anterior = 0;
            int actual = 1;

            for (int i = 1; i<=n; i++) {
                System.out.println(anterior);

                int siguiente = anterior + actual;
                anterior = actual;
                actual = siguiente;

            }
        }
    }


