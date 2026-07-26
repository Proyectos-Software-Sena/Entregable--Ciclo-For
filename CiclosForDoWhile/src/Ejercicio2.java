import javax.swing.*;

public class Ejercicio2 {

    public static void main(String[] args){

        int cantidad;
        int peso;
        int aprobadas = 0;
        int defectuosas = 0;

        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantas piezas desea revisar?"));

        for (int i = 1; i <= cantidad; i++ ){

            peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso de la pieza" + i));

            if (peso >= 100 && peso <= 120 ){

                aprobadas++;
            }else{
                defectuosas++;
            }
        }

        JOptionPane.showMessageDialog(null , "Piezas aprobadas: " + aprobadas + "\n Piezas defectuosas: "+ defectuosas);
    }
}
