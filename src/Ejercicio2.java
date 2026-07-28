import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        int cantidadPiezas;
        int peso;
        int aprobados = 0;
        int defectuosas = 0;

        cantidadPiezas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas piezas se van a revizar?"));

        for (int  i = 1; i <=cantidadPiezas; i++){
            peso= Integer.parseInt(JOptionPane.showInputDialog("ingrese el pesode la pieza" + i + "en gramos:"));
            if (peso >= 100 && peso <=120) {
                aprobados++;
            }else{
                defectuosas++;
            }
        }
        JOptionPane.showInputDialog(null, "piezas aprobadas:" + aprobados + "/npiezas defectuosas:" + defectuosas);

    }
}
