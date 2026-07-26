import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        int cantidadPiezas, pesoPiezas, aprobadas, defectuosas, contador;

        cantidadPiezas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de piezas a revisar: "));
        pesoPiezas = 0;
        aprobadas = 0;
        defectuosas = 0;
        contador = 1;

        do {

            pesoPiezas = Integer.parseInt(JOptionPane.showInputDialog("ingrese el peso de la pieza (en gramos): " + contador));

            if (pesoPiezas < 100 || pesoPiezas > 120) {
                defectuosas++;

            } else {
                aprobadas++;

            }
            contador++;

        } while (contador <= cantidadPiezas);
        JOptionPane.showMessageDialog(null, "Piezas aprobadas: " + aprobadas + " Piezas defectuosas: " + defectuosas);

    }
}
