import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[]arg){
        // primero preguntar las ventas realizadas
        int ventas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las cantidad de ventas realizadas en el dia "));
        int suma = 0;
        for(int i= 1; i <= ventas; i++){
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cada una de las ventas"));
            suma = suma + cantidad;
        }
        JOptionPane.showMessageDialog(null, "total de ventas del dia: " + suma );
    }
}