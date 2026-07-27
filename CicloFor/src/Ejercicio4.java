import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args){
        double calificaciones= Double.parseDouble(JOptionPane.showInputDialog("¿Cunatas calificaciones contiene el modulo?"));
        int aprovado= 0;
        int noAprovado=0;
        double sumaNotas=0.0;

        for (int i=0; i < calificaciones; i++ ) {
            double notas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las calificaciones de 0.0 hasta 5.0"));
            sumaNotas += notas;
        }
        double promedio = sumaNotas / calificaciones;
        promedio= Math.round(promedio * 100.0
        ) / 100.0;

        String estado = "";
        if (promedio >= 3.0){
            estado= "Aprovado";


        } else if (promedio <= 3.0) {
            estado="noAprovado";
        }
        JOptionPane.showMessageDialog(null, "si el promedio es >= 3.0) o No Aprobado (si es < 3.0)" + "\n" + "Promedio" + "\n" +
                promedio +  "\n" +"Estado" + "\n" + estado  );
    }
}
