
import javax.swing.*;

public class Ejercicio_monitoreo_temperatura {
public static void main(String[] args){

    int can = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de lecturas de temperatura:"));
    int max= Integer.MIN_VALUE;
    for (int i = 1; i <= can; i++) {
        int temp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la temperatura #" + i + " en °C:"));
        if (temp > max) {
            max = temp;
        }
    }


    JOptionPane.showMessageDialog(null, "La temperatura máxima registrada fue: " + max + "°C");

}}
