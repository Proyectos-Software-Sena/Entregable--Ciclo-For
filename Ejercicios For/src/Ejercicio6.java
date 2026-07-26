import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args){

        int asistentes = Integer.parseInt(JOptionPane.showInputDialog("cuantos son los asistentes???"));
        int edad = 0;
        int adul = 0;
        int menol = 0;

        for (int i = 1; i <= asistentes; i++){

            edad = Integer.parseInt(JOptionPane.showInputDialog("cual es la edad del asistente?"));

            if (edad < 18){
                menol++;
            }
            if (edad >= 18){
                adul++;
            }
        }
        JOptionPane.showMessageDialog(null,"adultos: " + adul + " menores: " + menol);
    }
}
