import javax.swing.*;

public class ejercicio2 {
    static void main(String[] args) {

        int numPiezas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de piezas que se van a revisar: "));
        int pesoPieza;
        int piezasDefectuosas = 0;
        int piezasAprobadas = 0;

        for (int i = 1; i <= numPiezas; i++) {

            pesoPieza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso de la pieza " + i));

            if(pesoPieza < 100 || pesoPieza > 120){
                piezasDefectuosas++;

            }else{
                piezasAprobadas++;
            }
        }
        JOptionPane.showMessageDialog(null, "Piezas aprobadas: " + piezasAprobadas + "\nPiezas defectuosas: " + piezasDefectuosas);
    }
}
