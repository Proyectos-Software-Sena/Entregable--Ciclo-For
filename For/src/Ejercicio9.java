import javax.swing.*;
import java.util.logging.Handler;

public class Ejercicio9 {
    public static void main (String[] args){
        int bacterias =Integer.parseInt(JOptionPane.showInputDialog("ingresa cantidad ded bacterias"));
        int horas =Integer.parseInt(JOptionPane.showInputDialog("ingresa la cantidad de horas"));

        for (int i=1;i<=horas;i++){

        bacterias=bacterias*2;
            JOptionPane.showMessageDialog(null, "Hora"+i+"="+bacterias+"bacterias");

        }
    }
}

