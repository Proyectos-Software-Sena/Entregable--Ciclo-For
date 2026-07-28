import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args) {
         int bacterias;
         int horas;

         bacterias = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad  inicial de bacterias:"));
         horas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de horas:"));

         for (int i = 1; i <= horas; i++){
             bacterias = bacterias * 2;
             JOptionPane.showMessageDialog(null, "hora" + i + ":" + bacterias + "bacterias");
         }

    }
}
