import javax.swing.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        int n;
        int a = 0;
        int b = 1;
        int c;
        String serie = "";

        n = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de terminos:"));

        for (int i = 1; i <= n; i++){
            serie = serie + a + ", ";
            c = a + b;
            a = b;
            b = c;
        }
        JOptionPane.showMessageDialog(null, "serie de fibonacci:" + serie);
    }
}
