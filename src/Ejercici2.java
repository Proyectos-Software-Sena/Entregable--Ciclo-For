import javax.swing.*;

public class Ejercici2 {
    public static void main (String[] args){

        int piezas = Integer.parseInt(JOptionPane.showInputDialog("cuantas piezas vas a revisar ?"));

        int aprobado = 0;
        int defectuosa = 0;

        for (int i = 1; i <= piezas; i++){
            double peso = Double.parseDouble(JOptionPane.showInputDialog("ingresa el peso de la pieza " + i  + "(en gramos):"));

            if (peso >= 100 && peso <= 120 ){
                aprobado++;

            }else{
                defectuosa++;
            }
        }
        JOptionPane.showMessageDialog(null, "piezasa aprovadas: " + aprobado + "\n piezas defectuosas: " + defectuosa);
    }
}
