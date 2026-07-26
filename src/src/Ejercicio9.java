import javax.swing.*;

public class Ejercicio9 {
    public  static void main (String[] args){

        int bacterias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de bacterias: "));
        int catidadHoras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas: "));

        for (int i = 1; i <=catidadHoras; i++){
            bacterias = bacterias * 2;

            JOptionPane.showMessageDialog(null, "Hora " + i + ": " + bacterias + " bacterias" );
        }
    }
}
