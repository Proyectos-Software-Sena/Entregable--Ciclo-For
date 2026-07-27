import javax.swing.*;

public class ejercicio3 {
    static void main(String[] args) {

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de lecturas de temperatura que se tomaron: "));
        int temperatura;
        int temperaturaMaxima = 0;

        for (int i = 1; i <= cantidad; i++) {

            temperatura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la temperatura " + i + "(°C): "));

            if(temperatura > temperaturaMaxima){
                temperaturaMaxima = temperatura;
            }
        }
        JOptionPane.showMessageDialog(null, "La temperatura maxima registrada fue: " + temperaturaMaxima + "°C");
    }
}
