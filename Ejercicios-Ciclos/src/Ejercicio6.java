import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[]arg) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad total de asistentes"));
        int edad = 0;
        int menores = 0;
        int adultos =0;

        for (int i = 1; i <= cantidad; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese su edad "));
            if (edad < 18) {
                menores++;
            } else {
                adultos++;
            }
        }
        JOptionPane.showMessageDialog(null, "cantidad de menores: " + menores + "cantidad de adultos: "
                + adultos);
    }
    }
