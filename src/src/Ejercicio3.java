import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args){
        int cantidadLecturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de lecturas de temperatura a registrar:"));
        double tempMaxima = 0;

        for (int i = 1; i <= cantidadLecturas; i++) {
            double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Registro de temperatura " + i + " (°C):"));

            if (i == 1 || temperatura > tempMaxima) {
                tempMaxima = temperatura;
            }
        }

        JOptionPane.showMessageDialog(null, "La temperatura máxima registrada fue: " + tempMaxima + "°C");
    }
}
