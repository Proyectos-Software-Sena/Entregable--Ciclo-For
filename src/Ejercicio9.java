import javax.swing.*;

public class Ejercicio9 {
    public static void main (String[] args){

        int bacteria = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad inicial de bacterias "));
        int horas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de horas de proyeccion "));

        for (int i = 1 ; i <= horas; i++){

            bacteria = bacteria* 2;

            System.out.println("hora " + i + ": " + bacteria + " bacterias" );
        }

    }
}
