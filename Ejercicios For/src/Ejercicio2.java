import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args){

        int piezasT = Integer.parseInt(JOptionPane.showInputDialog("cuantas piezas va a revisar? "));
        int bien = 0;
        int mal = 0;

        for (int i = 1; i <= piezasT; i++){

            int peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso de cada pieza: "));

            if (peso > 100 && peso < 120) {
                bien++;
            }else {
                mal++;
            }
        }
        JOptionPane.showMessageDialog(null,"piezas aprobadas: " + bien + " piezas defectuosas: " + mal);
    }
}
