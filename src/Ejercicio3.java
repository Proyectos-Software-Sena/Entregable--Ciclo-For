import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de lecturas: "));
        double maxima = 0;

        for(int i = 1; i <= cantidad; i++){
            double temperaturas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura de la lectura " + i + "(en grados Celsius):"));

            if (temperaturas > maxima){
                maxima = temperaturas;
            }

        }
        JOptionPane.showMessageDialog(null, "La temperatura máxima registrada fue:  " + maxima);
    }
}
