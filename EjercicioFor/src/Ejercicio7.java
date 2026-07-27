import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args){
        int trm;
        trm = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tasa (TRM)"));
        for (int i = 1; i <= 10; i++){

            int este = trm * i;
            System.out.println( i + "USD = " + este + "COP");
        }

    }
}
