import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {

        int ahorro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto fijo a ahorrar cada mes"));
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de meses de la proyeccion"));

        int acumulado = 0;
        String resultado = " PROYECCION DE AHORROS \n\n";

        for(int mes = 1; mes <= meses; mes++){
            acumulado = acumulado + ahorro;
            resultado = resultado + "Mes " + mes + ": $" + acumulado + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
