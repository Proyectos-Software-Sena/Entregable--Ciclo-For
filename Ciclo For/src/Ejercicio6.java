import javax.swing.*;
public class Ejercicio6 {
    public static void main(String[] args) {

            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de asistentes"));

                int edad;
                int menores = 0;
                int adultos = 0;
                for (int i = 1; i <= cantidad; i++) {

                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del asistente " + i));

                        if (edad < 18) {
                            menores++;
                        } else {
                        adultos++;
                    }
                }

                JOptionPane.showMessageDialog(null, "Menores de edad: " + menores + "\nAdultos: " + adultos);
            }
        }

