import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] arg) {
        int lectura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de lecturas"));
        double mayor= Double.parseDouble(JOptionPane.showInputDialog("ingrese temperatura 1 en grados celsius"));
        double temperatura =0;
        for (int i = 2; i <= lectura; i++) {
            temperatura = Double.parseDouble(JOptionPane.showInputDialog("ingrese la temperatura en grados celsius "));
            if (temperatura > mayor) {
                mayor = temperatura;
            }
        }
        JOptionPane.showMessageDialog(null, "la temperatura maxima es: " + mayor + "°c" );
    }
}