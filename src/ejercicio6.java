import javax.swing.*;

public class ejercicio6 {
    public static void main(String[] args){
        int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de asistentes:"));
        int edad;
        int menores =0;
        int adultos =0;

        for (int i=1; i<=cantidad; i++){
            edad=Integer.parseInt(JOptionPane.showInputDialog("Edad del asistente" + i + ":"));

            if (edad < 18){
                menores++;
            }else {
                adultos++;
            }
        }
        JOptionPane.showMessageDialog(null, "Menores:" + menores + "\nAdultos:" + adultos);
    }
}
