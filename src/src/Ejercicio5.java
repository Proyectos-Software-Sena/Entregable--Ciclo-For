import javax.swing.*;

public class Ejercicio5 {
    public static void main (String[] args){

        int meses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de meses: "));
        double ahorro =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuanto ahorra cada mes: "));
        double acumulado = 0;

        for (int i = 1; i <= meses; i++){
            acumulado = acumulado + ahorro;

            JOptionPane.showMessageDialog(null, "Mes " + i + ": $ " + acumulado);
        }


    }
}
