import javax.swing.*;

public class ejercicio4 {
    public static void main(String[] args){
        int lecturas=Integer.parseInt(JOptionPane.showInputDialog("Cuantas temperaturas va a rgistrar?"));
        int temperatura;
        int mayor=Integer.MIN_VALUE;

        for (int i=1; i <= lecturas; i++){
            temperatura=Integer.parseInt(JOptionPane.showInputDialog("Temperatura" + i));

            if (temperatura>mayor){
                mayor=temperatura;
            }
        }
        JOptionPane.showMessageDialog(null, "La temperatura máxima registrada fue:" + mayor + "°C");
    }
}
