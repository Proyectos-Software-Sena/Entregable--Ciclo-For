import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantas temperaturas se tomaron?"));
        double tempMaxima = -999;
        for(int i = 1; i <= cantidad; i++){
            double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura " + i + " en °C"));
            if(temperatura > tempMaxima){
                tempMaxima = temperatura;
            }
        }

        String resultado = "La temperatura maxima registrada fue " + tempMaxima + "°C";

        JOptionPane.showMessageDialog(null, resultado);
    }
}