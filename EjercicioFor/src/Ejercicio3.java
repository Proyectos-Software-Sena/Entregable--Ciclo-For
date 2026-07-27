import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args){
        int lecturas;
        int temperatura;
        int mayor = Integer.MIN_VALUE;
        lecturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuántas temperaturas quiere registrar"));
        for (int i = 1; i <= lecturas; i++){
            temperatura = Integer.parseInt(JOptionPane.showInputDialog("Temperatura " + i));
            if (temperatura > mayor){
                mayor = temperatura;
            }
        }
        JOptionPane.showMessageDialog(null, "La temperatura máxima registrada fue: " + mayor + "°C");
    }
}
