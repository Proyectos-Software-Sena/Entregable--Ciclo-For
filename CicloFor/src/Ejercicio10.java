import javax.swing.*;

public class Ejercicio10 {
    public static void main(String[] args){
        int cantidad= Integer.parseInt(JOptionPane.showInputDialog("¿Cunatos numeros?"));
        String resultado = "";
        int a= 0,b=1;
        for (int i = 1; i <= cantidad; i++){
            resultado += a + "";
            int sig= a+ b;
            a= b;
            b=sig;
        }
        JOptionPane.showMessageDialog(null, "Resultado" + "\n" + resultado);
    }
}
