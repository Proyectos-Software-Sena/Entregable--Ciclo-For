import javax.swing.*;

    public class Ejercicio7 {
        public static void main(String[] args){

            int tasa = Integer.parseInt(JOptionPane.showInputDialog("ingrtesa la TRM del dia: "));

            for (int i = 1; i <= 10; i++){
                int trm = tasa * i;
                System.out.println(i + " USD = " + trm + " COP");
            }

        }
    }

