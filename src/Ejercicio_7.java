import javax.swing.*;

public class Ejercicio_7 {
    public static void main(String[]args){
        int dolar = Integer.parseInt(JOptionPane.showInputDialog("cuantos doares va a pasar"));
        int tasa = 4000;
        int total = 0;
        for (int i = 1; i <= dolar; i++){
            total = i * tasa;
            System.out.println(i + "USD =" + total);
        }
    }
}
