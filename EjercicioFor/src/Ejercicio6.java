import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args){
        int cantidad;
        int edad;
        int menor = 0;
        int adulto = 0;
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de asistentes: "));
        for (int i = 1; i <= cantidad; i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del asistente: "+ i));
            if (edad <18){
                menor++;
            }else{
                adulto++;
            }
        }
        JOptionPane.showMessageDialog(null, "Menores: " + menor + "\nAdulto: " + adulto);
    }
}
