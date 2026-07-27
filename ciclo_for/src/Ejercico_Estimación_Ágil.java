
import javax.swing.*;

public class Ejercico_Estimación_Ágil {
public static void main(String[] args){

    int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de términos de la serie Fibonacci:"));

    int a = 0, b = 1, c;
    String resultado = "";

    for (int i = 1; i <= n; i++) {
        resultado += a + (i < n ? ", " : "");
        c = a + b;
        a = b;
        b = c;
    }

    JOptionPane.showMessageDialog(null, resultado);

}
}
