import javax.swing.*;

public class Ejercicio9 { public static void main(String []arg){
        int bacterias = Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad inicial de bacterias"));
        int hora = Integer.parseInt(JOptionPane.showInputDialog("ingrese la hora"));
        for(int i =  1; i <= hora; i++){
            bacterias= bacterias * 2;
            JOptionPane.showMessageDialog(null, "Hora " + i + " = " + bacterias + " bacterias" );
        }
    }
}
