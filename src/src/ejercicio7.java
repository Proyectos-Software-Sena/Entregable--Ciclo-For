import javax.swing.*;
public class ejercicio7 {
    public static void main(String[] args) {
        double trm = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Tasa de Cambio Representativa del Mercado (TRM)"));
        String resultado = "";
        for (int i = 1; i <= 10; i++) {
            double conversion = i * trm;
            resultado += i + " USD = " + conversion + " COP\n";
        }
        System.out.println(resultado);
        JOptionPane.showMessageDialog(null, resultado);
    }
}
