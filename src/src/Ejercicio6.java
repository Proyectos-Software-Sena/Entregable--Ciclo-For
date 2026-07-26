import javax.swing.*;
import java.util.jar.JarEntry;

public class Ejercicio6 {
    public static void main ( String[] args){

       int asistentes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad total de asistentes"));
       int edad;
       int menores = 0;
       int adultos = 0;

       for ( int i = 1; i<= asistentes; i++){
           edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de cada asistente: " + i));

         if ( edad < 18 ) {
             menores = menores + 1;
         }else{
             adultos = adultos + 1;
         }
       }
       JOptionPane.showMessageDialog(null, "Menores:" + menores + "\nAdultos:" + adultos);
    }
}
