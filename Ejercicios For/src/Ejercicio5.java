import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args){

        int ahorro = Integer.parseInt(JOptionPane.showInputDialog("cuanto desea ahorrar? "));
        int meses = Integer.parseInt(JOptionPane.showInputDialog("por cuantos meses? "));

        for (int i = 1; i <= meses; i++){

            int total = 0;

            total = ahorro*i;

            JOptionPane.showMessageDialog(null,"mes " + i + ": " + total);


        }
    }
}
