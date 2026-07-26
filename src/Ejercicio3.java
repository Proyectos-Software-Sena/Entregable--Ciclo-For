import javax.swing.*;

public class Ejercicio3 {
    public static void main (String[] args){

        int lecturas = Integer.parseInt(JOptionPane.showInputDialog("cuantas lecturas de temoeratura han tomado ?"));

        int valorMaximo = -999;
        for (int i =1 ; i <= lecturas; i++){
            int  valores = Integer.parseInt(JOptionPane.showInputDialog("ingrese valor de temperatura" + i + "(en grados celsius): "));

            if (valores > valorMaximo){
                valorMaximo = valores;
            }
        }
        JOptionPane.showMessageDialog(null,"la temperatura maxima registrada fue: " + valorMaximo + "°C" );
    }
}
