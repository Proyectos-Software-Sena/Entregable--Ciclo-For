import javax.swing.*;

public class ejercicio5 {
    public static void main(String[] args){
        int monto=Integer.parseInt(JOptionPane.showInputDialog("Cuanto vas a ahorrar cada mes:"));
        int meses=Integer.parseInt(JOptionPane.showInputDialog("Cuantos mese vas a ahorrar:"));
        int total=0;
        String resultado="";

        for (int i =1; i <=monto; i++){
            total += monto;
            resultado += "Mes" + i + ":" + total + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
