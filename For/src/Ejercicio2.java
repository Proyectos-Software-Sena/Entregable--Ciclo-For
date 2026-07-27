import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {

        int aprobadas = 0;
        int defectuosas = 0;


        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuántas piezas se van a revisar?"));

        for(int i = 1; i <= cantidad; i++){
            int peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso de la pieza " + i + " en gramos"));
            if(peso < 100 || peso > 120){
                defectuosas++;
            } else {
                aprobadas++;
            }
        }
        String resultado = "CONTROL DE CALIDAD \n" +
                "Piezas aprobadas " + aprobadas + "\n" +
                "Piezas defectuosas " + defectuosas;

        JOptionPane.showMessageDialog(null, resultado);
    }
}