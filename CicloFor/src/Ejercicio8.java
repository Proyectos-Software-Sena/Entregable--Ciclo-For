import javax.swing.*;

public class Ejercicio8 {
    public static void main(String[] args){
        String texto= JOptionPane.showInputDialog("Ingrese la palabra clave:");
        String invertido= "";

        for (int i=texto.length() -1; i >= 0; i--){
            invertido += texto.charAt(i);
        }

        JOptionPane.showMessageDialog(null, "Resultado :" + " " + invertido );
    }
}
