import javax.swing.*;

public class Ejercicio6 {
    public static void main (String[] args){

        int cantidadAsistentes = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad total de asistentes"));

        int mayor = 0;
        int menor = 0;


        for (int i = 1 ; i <= cantidadAsistentes; i++){

            int edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad de los asistentes " + i + " :"));

            if (edad < 18 ){
                menor++;


            }else if (edad >= 18 ){
                mayor++;

            }

        }
        JOptionPane.showMessageDialog(null, "Adultos : " + mayor + "\nMenores : " + menor  );
    }
}
