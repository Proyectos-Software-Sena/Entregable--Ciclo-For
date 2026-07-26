import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {

        int asistentes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de asistentes: "));
        int adultos = 0;
        int menores = 0;

        for (int i = 1; i <= asistentes; i++) {
            int edad =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del asistente " + i + " :"));

            if (edad >= 18 ) {
                adultos++;
            }else {
                menores++;
            }
        }
        JOptionPane.showMessageDialog(null, "Menores : " + menores + "\nAdultos : " + adultos );
    }
}
