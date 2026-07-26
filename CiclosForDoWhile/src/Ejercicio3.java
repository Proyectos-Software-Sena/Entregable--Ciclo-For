import javax.swing.*;

public class Ejercicio3 {

    public static void main(String[] args){

        int cantidad;
        int temperatura;
        int mayor = 0;

        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantas temperaturas desea ingresar?"));

        for (int i = 1; i <= cantidad; i++){

            temperatura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la temperatura"));

            if (i == 1 || temperatura > mayor){

                mayor = temperatura;
            }
        }

        JOptionPane.showMessageDialog(null ,  "La maxima temperatura fue de: " + mayor + "°C");
    }
}
