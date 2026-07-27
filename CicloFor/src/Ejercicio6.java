import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args){
        int asistentes= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de asistentes"));
        int menores=0;
        int mayores=0;

        for (int i=0; i < asistentes; i++){
            int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de cada asistente"));
            if (edad <= 18){
                menores++;
            } else if (edad >= 18) {
                mayores++;
            }
        }
        JOptionPane.showMessageDialog(null,"menores" + " " + menores + "\n" + "mayores" + " " + mayores);
    }
}
