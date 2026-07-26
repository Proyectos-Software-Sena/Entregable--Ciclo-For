import javax.swing.*;

public class Ejercicio4 {

    public static void main(String[] args){

        int cantidad;
        double nota;
        double suma = 0;
        double promedio = 0;

        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantas notas desea ingresar ?"));

        for (int i = 1; i <= cantidad; i++){

            nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota"));

            suma = suma + nota;
        }

        promedio = suma / cantidad;

        if (promedio>=3.0){

            JOptionPane.showMessageDialog(null , "El promedio es: " + promedio + "\\n Estado: Aprobado");
        }else {

            JOptionPane.showMessageDialog(null , "El promedio es: " + promedio + "\\n Estado: No Aprobado");
        }
    }
}
