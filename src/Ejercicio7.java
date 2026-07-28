import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        int trm;
        int conversion;

        trm = Integer.parseInt(JOptionPane.showInputDialog("ingrese la trm del dia:"));

        for (int i = 1; i <= 10; i++){
            conversion = i * trm;
            JOptionPane.showMessageDialog(null, i + "usd=" + conversion + "COP");
        }
    }
}
