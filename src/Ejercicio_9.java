import javax.swing.*;

public class Ejercicio_9 {
    public static void main(String[] args){
        int horas = Integer.parseInt(JOptionPane.showInputDialog("cuantas horas le va a dejar"));
        int bacInic = Integer.parseInt(JOptionPane.showInputDialog("cuantas bactrias iniciales hay"));
        for (int i = 1; i <= horas; i++){
            bacInic += bacInic;
            System.out.println("hora " + i + ":" + bacInic + "bacterias");
        }
    }
}
