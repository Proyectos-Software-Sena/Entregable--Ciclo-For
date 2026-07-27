import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args){
        int ventas= Integer.parseInt(JOptionPane.showInputDialog("Ingrese en numero de ventas que se hicieron al dia:"));
        double total=0;
        for (int i= 0; i < ventas; i++ ){
            double valor= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de las ventas" +  (i + 1) + ":"));
            total += valor;
        }
        JOptionPane.showMessageDialog(null, "El total de ventas del día es: " + total);
    }
}
