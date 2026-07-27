import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args){

        int bacterias = Integer.parseInt(JOptionPane.showInputDialog("cuantas bacterias va a ingresar? "));
        int horas = Integer.parseInt(JOptionPane.showInputDialog("durante cuantas horas? "));

        for (int i = 1;i <= horas;i++){

            int crecimiento = bacterias * 2;

            bacterias = crecimiento;

            System.out.println("Hora: " + i + ": " +  crecimiento + " Bacterias: ");
        }
    }
}
