import javax.swing.JOptionPane;

public class Ejercicio9 {
    public static void main(String[] args) {
        long poblacion = Long.parseLong(JOptionPane.showInputDialog("Cantidad inicial de bacterias:"));
        int horas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas horas de proyección?"));

        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i <= horas; i++) {
            poblacion *= 2;
            resultado.append("Hora ").append(i).append(": ").append(poblacion).append(" bacterias\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
