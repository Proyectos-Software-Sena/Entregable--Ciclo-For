import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args){
        int ahorro;
        int meses;
        int acumulado = 0;
        ahorro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuánto ahorra cada mes"));
        meses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuántos meses ahorra"));
        String resultado = "";
        for (int i = 1; i <= meses; i++){
            acumulado += ahorro;
            resultado += "Mes " + i + ": $" + acumulado + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
