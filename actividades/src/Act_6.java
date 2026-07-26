import javax.swing.*;

public class Act_6 {
    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("cuantos asistentes son  "));
        int meno = 0;
        int mayo = 0;
        for (int i = 1; i <= cantidad; i++) {
            int edades = Integer.parseInt(JOptionPane.showInputDialog("cuantos años tienen  "));
            if (edades < 18) {
                meno ++;
            }else {
                mayo ++;
            }
        }
        System.out.println("Menores: " + meno + " - Adultos: " + mayo);
    }
}
