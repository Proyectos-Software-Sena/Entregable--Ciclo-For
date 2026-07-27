import javax.swing.*;

public class Ejercicio_3 {
    public static void main(String[]args){
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("cuantas temperaturas se tomaron"));
        int temperatura = 0;
        int numero = 0;
        for (int i=1; i <= cantidad;i++){
            temperatura = Integer.parseInt(JOptionPane.showInputDialog("escriba los valores"));
            if (temperatura > numero){
                numero = temperatura;
            }
        }
        System.out.println("la temperatura maxima registrada fue: " + numero);
    }
}
