import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args){

        int cantidadLecturas;
        double temperatura;
        double temperaturaMaxima = 0;

        cantidadLecturas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas lecturas de temperatura se tomaron?"));

        for (int i = 1; i <= cantidadLecturas; i++){

            temperatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura #" + i + "en °C:"));

            if (i == 1){
                temperaturaMaxima = temperatura;

            } else if (temperatura > temperaturaMaxima){
                temperaturaMaxima = temperatura;
            }
        }

        JOptionPane.showMessageDialog(null,"La temperatura maxima registrada fue:" + temperaturaMaxima + "°C");
    }
}
