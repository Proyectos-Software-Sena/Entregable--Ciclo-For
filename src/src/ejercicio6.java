import javax.swing.*;

public class ejercicio6 {
    static void main(String[] args) {

        int cantidadAsistentes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de asistentes: "));
        int edad;
        int numAdultos = 0;
        int numMenores = 0;

        for (int i = 1; i <= cantidadAsistentes; i++) {

            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del asistente " + i));

            if(edad < 18){
                numMenores++;
            }else{
                numAdultos++;
            }
        }
        JOptionPane.showMessageDialog(null, "Menores: " + numMenores + "\nAdultos: " + numAdultos);
    }
}
