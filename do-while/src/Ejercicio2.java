import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        int cantidadpiezas, pesoPiezas, aprobadas, defectuosas,

                cantidadPiezas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de piezas a revisar: "));
        pesoPiezas = 0;
        aprobadas = 0;
        defectuosas = 0;


        for (int contador = 1;
             contador <= cantidadPiezas;
             contador++){

            pesoPiezas = Integer.parseInt(JOptionPane.showInputDialog("ingrese el peso de la pieza (en gramos): " + contador));

            if (pesoPiezas < 100 || pesoPiezas > 120) {
                defectuosas++;

            } else {
                aprobadas++;

            }
        }
        JOptionPane.showMessageDialog(null, "Piezas aprobadas: " + aprobadas + " Piezas defectuosas: " + defectuosas);

    }
}
