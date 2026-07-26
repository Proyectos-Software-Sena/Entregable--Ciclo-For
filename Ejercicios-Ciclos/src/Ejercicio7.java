import javax.swing.*;

public class Ejercicio7 {
public static void main (String[]arg){
    int tasa = Integer.parseInt(JOptionPane.showInputDialog("ingrese tasa de cambio en USD"));
    int multiplicacion = 1;
    for (int i =1; i <= 10; i++){
        multiplicacion= tasa*i;
        JOptionPane.showMessageDialog(null, + i + "USD" + "=" + multiplicacion + " COP");
    }
}
}


