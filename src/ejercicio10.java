import javax.swing.*;

public class ejercicio10 {
    public static void main(String[] args){
        int terminos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de términos:"));
        int a=0;
        int b=1;
        int siguiente;
        String resultado="Serie de Fibonacci:\n";

        for (int i=1; i <=terminos; i++){
            resultado += a + "";

            siguiente=a+b;
            a=b;
            b=siguiente;
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
