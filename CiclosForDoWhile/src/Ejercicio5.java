import javax.swing.*;

public class Ejercicio5 {

    public static void main(String[] args){

        int ahorros;
        int meses;
        int acumulado = 0;
        String resultado = "";

        ahorros = Integer.parseInt(JOptionPane.showInputDialog("Cuanto piensa ahorrar cada mes ?"));

        meses = Integer.parseInt(JOptionPane.showInputDialog("Cuantos meses ?"));

        for (int i = 1; i <= meses; i++){

            acumulado = acumulado + ahorros;

            resultado = resultado + "mes" + i + ": $" + acumulado + "\n";
        }

        JOptionPane.showMessageDialog(null ,  resultado);
    }
}
