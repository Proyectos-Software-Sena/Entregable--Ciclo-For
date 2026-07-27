import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args){
        int bac = Integer.parseInt(JOptionPane.showInputDialog("Bacterias iniciales"));
        int horas = Integer.parseInt(JOptionPane.showInputDialog("horas"));
        String resultado= "";

        for (int i = 1; i <= horas; i++){
            bac *=2;
            resultado += "Hora" + i + "\n" + ":" + "\n" + bac + "\n" + "bacterias";
        }
        JOptionPane.showMessageDialog(null, "Resultado :" + "\n" + resultado);
    }
}
