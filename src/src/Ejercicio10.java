import javax.swing.*;

public class Ejercicio10 {
    public static void main(String[] args){

        int cantidadTerminos;
        int a = 0;
        int b = 1;
        int c;
        String resultado = "";

        cantidadTerminos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de terminos de la serie Fibonacci"));

        for (int i = 1; i <= cantidadTerminos; i++){
            resultado = resultado + a + "";

            c = a + b;
            a = b;
            b = c;
        }

        JOptionPane.showMessageDialog(null,"Serie de Fibonacci:\n" + resultado);
    }
}
