import javax.swing.*;
public class Ejercicio_tabla_divisas {
public static void main(String[] args){
    double tasa = Double.parseDouble(
            JOptionPane.showInputDialog("Ingrese la Tasa de Cambio Representativa del Mercado (TRM):")
    );

    String resultado = "";


    for (int i = 1; i <= 10; i++) {
        double conversion = i * tasa;
        resultado += i + " USD = " + conversion + " COP\n";
    }


    JOptionPane.showMessageDialog(null, resultado);
}
}
