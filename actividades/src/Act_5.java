import javax.swing.*;

public class Act_5 {
    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("cuanto va a dopositar  "));
        int tiempo = Integer.parseInt(JOptionPane.showInputDialog("por cuanto tiempo(en meses)"));
        int suma = 0;

        for (int i = 1; i <= tiempo; i++) {
            suma += cantidad;
            System.out.println("mes " + i + ":" + suma);
        }
    }
}
