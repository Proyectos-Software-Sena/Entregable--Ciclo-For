import javax.swing.*;

public class Ejercicio3 {
    static void main() {
        int cantidadDeLecturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de lecturas de temperatura:"));
        int mayorTemperatura = 0;

        for(int i = 0; i < cantidadDeLecturas; i++) {
            int temperatura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la temperatura " + (i + 1) + ":"));

            if (temperatura > mayorTemperatura) {
                mayorTemperatura = temperatura;
            } else if (temperatura < 0) {
                JOptionPane.showMessageDialog(null, "Se ha ingresado una temperatura negativa.");
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "La mayor temperatura ingresada hasta ahora es: " + mayorTemperatura);
    }
}
