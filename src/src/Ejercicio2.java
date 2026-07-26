import javax.swing.*;

public class Ejercicio2 {
    public static void main (String [] args ){
        int cantidadPiezas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de piezas: "));
        double peso;
        int aprobadas = 0;
        int defectuosas = 0;

        for (int i = 1; i <= cantidadPiezas; i++){
           peso =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la pieza: " + i ));

        if ( peso < 100 || peso >120) {
            defectuosas++;
        }else{
            aprobadas++;
        }

        }

        JOptionPane.showMessageDialog(null, "La cantidad de piezas aprobadas son: " + aprobadas +
                 "\n La cantidad de piezas defectuosas es: " + defectuosas);
    }

}
