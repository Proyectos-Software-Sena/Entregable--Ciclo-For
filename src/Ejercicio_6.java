import javax.swing.*;

public class Ejercicio_6 {
    public static void main (String[]args){
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("cuantos asistentes son"));
        int menor = 0;
        int mayor = 0;
        for (int i = 1; i <= cantidad; i++){
            int edades = Integer.parseInt(JOptionPane.showInputDialog("cuantos años tienen"));
            if (edades < 18){
                menor ++;
            }else {
                mayor ++;
            }
        }
        System.out.println("menores: " + menor + " adultos: " + mayor);
    }
}
