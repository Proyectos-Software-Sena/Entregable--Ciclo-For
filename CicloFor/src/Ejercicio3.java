import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args){
        int lectura= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la lectura de la temperatura que se tomaron :"));
        int tempMax=0;

        for (int i= 0; i < lectura; i++){
            int temperatura= Integer.parseInt(JOptionPane.showInputDialog("Ingrese los valores leidos en grados celsius"));
            if (temperatura > tempMax){
                tempMax = temperatura;
            }
        }
        JOptionPane.showMessageDialog(null, "La temperatura máxima registrada fue: " + "\n" + tempMax);
    }
}
