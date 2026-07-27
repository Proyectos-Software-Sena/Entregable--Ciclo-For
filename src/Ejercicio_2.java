import javax.swing.*;

public class Ejercicio_2 {
    public static void main(String [] args){
        int piezas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas piezas se van revisar"));
        int aprobadas = 0;
        int desaprobadas = 0;

        for (int i = 1;i <= piezas; i++){
            int gramo = Integer.parseInt(JOptionPane.showInputDialog("Cuanto pesan"));
            if (gramo < 100 || gramo > 120){
                desaprobadas++;
            }else {
                aprobadas++;
            }
        }
        System.out.println("piezas aprobadas: " + aprobadas + "piezas defectuosas:"+ desaprobadas);
    }
}
