import javax.swing.*;

public class Ejercicio7 {

    public static void main(String[] args){

        int tasa;
        String tabla = "";

        tasa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el TMR del dia"));

        for (int i = 1; i <= 10; i++){

            tabla = tabla + i + "USD = " + (i * tasa) + "COP\n";
        }

        JOptionPane.showMessageDialog(null, tabla);
    }
}
