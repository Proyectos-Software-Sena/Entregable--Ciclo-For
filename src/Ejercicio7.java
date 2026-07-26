import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static void main(String[] args) {
        double trm = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es la TRM del día?"));
        StringBuilder tabla = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            tabla.append(i).append(" USD = ").append(i * trm).append(" COP\n");
        }

        JOptionPane.showMessageDialog(null, tabla.toString());
    }
}
