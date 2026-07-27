import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad total de asistentes"));
        int menores = 0;
        int adultos = 0;
        for(int i = 1; i <= cantidad; i++){
            int edad = Integer.parseInt(JOptionPane.showInputDialog("edad del assistente " + i));
            if(edad < 18){
                menores++;
            } else {
                adultos++;
            }
        }

        String resultado = "Menores: " + menores + "  Adultos: " + adultos;

        JOptionPane.showMessageDialog(null, resultado);
    }
}