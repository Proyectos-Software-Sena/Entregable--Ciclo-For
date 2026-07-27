import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de terminos N de la serie de Fibonacci "));

        int a = 0;
        int b = 1;
        String serie = "";

        for(int i = 1; i <= n; i++){
            serie = serie + a;
            if(i < n){
                serie = serie + ", ";
            }

            int siguiente = a + b;
            a = b; // mover
            b = siguiente;
        }

        JOptionPane.showMessageDialog(null, "Serie de Fibonacci con " + n + " terminos:\n" + serie);
    }
}