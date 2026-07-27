import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args){
        int totalAsistentes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número total de personas a registrar:"));
        int menores = 0;
        int adultos = 0;

        for (int i = 1; i <= totalAsistentes; i++) {
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad de la persona " + i + ":"));

            if (edad < 18) {
                menores++;
            } else {
                adultos++;
            }
        }

        JOptionPane.showMessageDialog(null, "Conteo de asistentes:\n" +
                "Menores: " + menores + "\n" +
                "Adultos: " + adultos);
    }
}
