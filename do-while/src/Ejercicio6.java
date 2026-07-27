import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {

        int asistentes, edad, mayores, menores;

        asistentes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad total de asistentes: "));
        menores = 0;
        mayores = 0;

        for (int i = 1;
             i <= asistentes;
             i++) {

            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de cada uno: "));

            if (edad < 18) {
                menores++;
            } else if (edad >= 18) {
                mayores++;
            }
        }
        JOptionPane.showMessageDialog(null, "Menores: " + menores +
                "\n" + "Adultos: " + mayores);
    }
}
