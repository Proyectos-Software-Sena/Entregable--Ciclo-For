import javax.swing.*;

public class Ejercicio_4 {
    public static void main (String[]args){
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("cuantas notas se tomaron"));
        double notas = 0;
        double suma = 0;
        double promedio = 0;
        for (int i = 1;i <= cantidad;i++){
            notas =Double.parseDouble(JOptionPane.showInputDialog("ingrse las notas"));
            suma += notas;
            promedio = suma/cantidad;
        }
        if (promedio < 3.0 ){
            System.out.println("promedio:" + promedio + "reprobado");
        }else if (promedio >= 3.0){
            System.out.println("promedio:" + promedio + "aprobado");
        }
    }
}
