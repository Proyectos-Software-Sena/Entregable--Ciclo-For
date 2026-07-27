import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de piezas"));
        int defectuosas = 0;
        int buenas = 0;
        for (int i = 1; i <= cantidad; i++) {
            int peso = Integer.parseInt(JOptionPane.showInputDialog("ingrese ekkl peso de la pieza"));
            if (peso <= 100 || peso >= 120) {
                defectuosas++;
            } else {
                buenas++;
            }
        }
        JOptionPane.showMessageDialog(null, "numero de piezas buenas"+ buenas + "numero de piezas defectuosas"+ defectuosas);
    }
}
