import javax.swing.*;

public class ejercicio3 {
    public static void main(String[] args){
        int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las calificaciones"));
        double nota;
        double suma=0;
        double promedio;

        for (int i=1; i <=cantidad; i++){
            nota=Double.parseDouble(JOptionPane.showInputDialog("nota" + i));
            suma += nota;
        }
        promedio = suma / cantidad;
        if (promedio >= 3.0){
            JOptionPane.showMessageDialog(null, "Promedio:" + promedio + "\nEstado: Aprobado");
        } else {
            JOptionPane.showMessageDialog(null, "Promedio:" + promedio + "\nEstado: No Aprobado");
        }
    }
}
