import javax.swing.*;

public class Ejercicio10 {
    public static void main ( String[] args){

        int termino = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de términos  de la serie de Fibonacci que desea generar "));

        int resultado ;
        int numero1 = 0;
        int numero2 = 1;


        for (int i = 1; i <= termino; i++ ){

            System.out.print(numero1);

            if (i < termino){

                System.out.print(", ");
            }

            resultado = numero1 + numero2;
            numero1 = numero2;
            numero2 = resultado;
        }
    }
}
