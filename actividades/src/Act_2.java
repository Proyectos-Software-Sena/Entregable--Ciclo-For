import javax.swing.*;

public class Act_2 {
    public static void main(String[] args){
        int piezas = Integer.parseInt(JOptionPane.showInputDialog("cuantas piezas se van a revisar"));
        int apro = 0;
        int desa = 0;
        for (int i = 1;i <= piezas;i++){
            int gramo = Integer.parseInt(JOptionPane.showInputDialog("cuanto pesan "));
            if (gramo < 100 || gramo > 120){
                desa++;
            }else {
                apro++;
            }
        }
        System.out.println("Piezas aprobadas: " + apro + " Piezas defectuosas: " + desa);
    }
}
