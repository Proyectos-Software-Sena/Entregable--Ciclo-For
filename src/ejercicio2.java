import javax.swing.*;

public class ejercicio2 {
    public static void main(String[] args){
        int piezas=Integer.parseInt(JOptionPane.showInputDialog("Cuantas piezas quiere revisar:"));
        int peso;
        int aprobadas=0;
        int defectuosas=0;

        for (int i=1; i <=piezas; i++){
            peso=Integer.parseInt(JOptionPane.showInputDialog("Cual es el peso de la pieza:" + i));

            if (peso >= 100 && peso <= 120){
                aprobadas++;
            } else {
                defectuosas++;
            }
        }
        JOptionPane.showMessageDialog(null, "Piezas aprobadas:" + aprobadas + "\nPiezas defectuosas" + defectuosas);
    }
}
