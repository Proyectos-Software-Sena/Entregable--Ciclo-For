import javax.swing.*;

public class ejercicio7 {
    public static void main(String[] args){
        int trm= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tasa (TRM)"));

        for (int i = 1; i <= 10; i++){
            int sur = trm * i;
            System.out.print(i + "USD = " + sur + "COP");
        }
    }
}
