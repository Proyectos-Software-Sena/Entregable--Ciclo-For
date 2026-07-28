import javax.swing.*;
public class Ejercicio3 {
    public static void main(String[] args) {
        int cantidadLecturas;
        int temperatura;
        int temperaturaMaxima;

        cantidadLecturas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas lecturas de temperatura se tomaron?"));
        temperaturaMaxima = Integer.parseInt(JOptionPane.showInputDialog("ingrese la temperatura 1:"));

        for (int i = 2; i <= cantidadLecturas; i++) {
            temperatura = Integer.parseInt(JOptionPane.showInputDialog("ingrese la temperatura " + i + ":"));
            if (temperatura > temperaturaMaxima){
                temperaturaMaxima = temperatura;
            }
        }
        JOptionPane.showMessageDialog(null, "la temperatura maxima registrada fue:" + temperaturaMaxima + "°C");

    }
}

