import javax.swing.*;

public class Ejercicio5 {
    public static void main(String [] args){
        int monto= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto fijo  para ahorrar cada mes"));
        int meses= Integer.parseInt(JOptionPane.showInputDialog("Ingrese los meses a proyeccion"));

        double acumulante=0;

        for (int i=1; i < meses; i++) {
            System.out.println(i);
            acumulante += monto;
            JOptionPane.showMessageDialog(null, "Meses" + i +" : $" + acumulante + " ");
        }


    }
}