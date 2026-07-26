import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args){

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("cuantas temperaturas va a registrar?"));
        double tem;
        double mayor = 0;

        for (int i = 1; i <= cantidad; i++){
            tem = Double.parseDouble(JOptionPane.showInputDialog("ingresa cada temperatura: "));

            if (i == 1){
                mayor = tem;
            } else if (tem>mayor) {
                mayor = tem;
            }
        }
        JOptionPane.showMessageDialog(null,"la mayor temperatura fue: " + mayor);
    }
}
