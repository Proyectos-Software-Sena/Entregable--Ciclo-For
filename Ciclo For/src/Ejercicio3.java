import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Ejercicio3 {
public static void main(String[] args){
    int cantidad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de lecturas de temperatura que se tomaron"));
    int mayor = 0;
    for(int i = 1; i <= cantidad; i++ ){
        int grados = Integer.parseInt(JOptionPane.showInputDialog("ingrese los grados"));


        if (i == 1){
            mayor = grados;
        } else if (grados>mayor) {
            mayor = grados;
        }
    }
    JOptionPane.showMessageDialog(null,"la   n mayor temperatura fue: " + mayor);
}
}
