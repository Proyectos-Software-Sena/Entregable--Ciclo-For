import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Ejercicio7 {
    public static void main(String[] args) {

        double tasaCanbio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tasa de cambio representativa del Mercado (TRM) del día: "));
        double canbio;
        for (int i = 1;
             i <= 10;
             i++){

            canbio = tasaCanbio * i;

            JOptionPane.showMessageDialog(null, i + " USD = " + canbio + "COP" );


        }
    }
}
