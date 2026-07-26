import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {
        double montoMensual = Double.parseDouble(JOptionPane.showInputDialog("¿Monto fijo a ahorrar cada mes?"));
        int meses = Integer.parseInt(JOptionPane.showInputDialog("¿Cantidad de meses de la proyección?"));

        double acumulado = 0;
        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i <= meses; i++) {
            acumulado += montoMensual;
            resultado.append("Mes ").append(i).append(": $").append(acumulado).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}