import javax.swing.*;

public class Ejercicio3 {
    public static void main (String[] args) {

        int cantidad;
        double temperatura;
        double maxima = 0;

        cantidad= Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas lecturas de temperatura desea ingresar?"));

        for (int i = 1; i <=cantidad; i++){
            temperatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura " + i + ":"));

            if ( temperatura > maxima){
                maxima = temperatura;
            }
        }
            JOptionPane.showMessageDialog(null,"La temperatura maxima registrada fue:"+ maxima + "°C");
    }
}
