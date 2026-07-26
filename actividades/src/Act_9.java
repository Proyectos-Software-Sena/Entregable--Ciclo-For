import javax.swing.*;

public class Act_9 {
    public static void main(String[] args) {
        int horas = Integer.parseInt(JOptionPane.showInputDialog("cuantas horas las va a dejar  "));
        int bacInic = Integer.parseInt(JOptionPane.showInputDialog("cuantas bacterias iniciales hay "));
        for (int i = 1; i <= horas; i++){
            bacInic += bacInic;
            System.out.println("hora " + i + ": " + bacInic + " bacterias");
        }
    }
}
