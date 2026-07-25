import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args){

        int cantidadAsistencias;
        int edad;
        int menores = 0;
        int adultos = 0;

        cantidadAsistencias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de asistentes:"));

        for (int i = 1; i <= cantidadAsistencias; i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del asistente #" + i + ":"));

            if (edad < 18){
                menores++;

            } else {
                adultos++;
            }
        }

        JOptionPane.showMessageDialog(null,"Cantidad de menores:" + menores + "\nCantidad de adultos:" + adultos);
    }
}
