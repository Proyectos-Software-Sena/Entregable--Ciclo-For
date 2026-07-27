import javax.swing.*;

public class Ejercicio_5 {
    public static void main (String[]args){
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("cuanto va a depositar"));
        int tiempo = Integer.parseInt(JOptionPane.showInputDialog("por cuanto tiempo en meses"));
        int suma = 0;

        for (int i = 1; i <= tiempo; i++){
            suma += cantidad;
            System.out.println("mes" + i + ":" + suma);
        }
    }
}
