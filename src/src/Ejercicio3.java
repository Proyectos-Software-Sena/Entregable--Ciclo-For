import javax.swing.*;
import java.util.jar.JarEntry;

public class Ejercicio3 {
    public static void main(String[] args) {
        int cantidaddeLecturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de lecturas: "));
        double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Temperatura 1: "));
        double temperaturaMayor = temperatura;

        for (int i = 2; i <= cantidaddeLecturas; i++) {
            temperatura = Double.parseDouble(
                    JOptionPane.showInputDialog("Ingrese la temperatura " + i + ":"));

            if (temperatura > temperaturaMayor) {
                temperaturaMayor = temperatura;
            }
        }
        JOptionPane.showMessageDialog(null, "La temperatura maxima registrada fue: " + temperaturaMayor + "°C");
    }
}

