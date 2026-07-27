
import javax.swing.*;


public class Ejercicio_control_calidad {
public  static void  main(String[] args){

    int canpies = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas piesas se van a pasar por el control de calidad?"));
    int apro = 0;
    int desa = 0;
    for (int i = 1; i <= canpies; i++) {
        int pe = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso de pa piesa a evaluar "));

        if (pe <= 100 || pe >= 120 ){
            apro++;
        }else{
          desa++;
        }
    }

        JOptionPane.showMessageDialog(null,"piezas aprobadas " + apro + "piezas desaprobadas " + desa);

}}
