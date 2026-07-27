import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantas calificaciones componen el modulo?"));
        double suma = 0;
        for(int i = 1; i <= cantidad; i++){
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota " + i + " (0.0 a 5.0)"));

            suma = suma + nota;
        }
        double promedio = suma / cantidad;
        promedio = Math.round(promedio * 100.0) / 100.0;

        String estado;
        if(promedio >= 3.0){
            estado = "Aprobado";
        } else {
            estado = "No a" +
                    "probado";
        }

        String resultado = "Promedio " + promedio + " - Estado: " + estado;

        JOptionPane.showMessageDialog(null, resultado);
    }
}