import javax.swing.*;

public class Ejercicio5 {
    public static void main (String[] args){
        int ahorrar = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de dinero que quiere ahorar"));
        int meses = Integer.parseInt(JOptionPane.showInputDialog("ingrese los meses en los que va a ahorrar"));
        int total = 0;
        for(int i = 1; i <= meses; i++ ){
            total = ahorrar * i;
            System.out.println("el ahorrro es de: " + i + "$" + total);
        }



    }
}
