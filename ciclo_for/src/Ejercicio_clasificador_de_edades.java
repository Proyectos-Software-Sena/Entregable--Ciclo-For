import javax.swing.*;
public class Ejercicio_clasificador_de_edades {
public static void main(String[] args){
    int cantidad = Integer.parseInt(
            JOptionPane.showInputDialog("Ingrese la cantidad total de asistentes:")
    );

    int menores = 0;
    int adultos = 0;


    for (int i = 1; i <= cantidad; i++) {
        int edad = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese la edad del asistente #" + i + ":")
        );
        if (edad < 18) {
            menores++;
        } else {
            adultos++;
        }
    }
    JOptionPane.showMessageDialog(
            null, "Menores: " + menores + " - Adultos: " + adultos);
}}
