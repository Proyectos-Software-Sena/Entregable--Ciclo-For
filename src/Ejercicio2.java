import javax.swing.*;

public class Ejercicio2 {

    public static void main(String[] args){

        int piezas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero de piezas a revisar"));
        int aprovadas = 0;
        int defectuosas = 0;

        for(int i = 1; i <= piezas; i++){
            double peso = Double.parseDouble(JOptionPane.showInputDialog("ingrese el peso de la pieza " + i + "(en gramos)"));

            if(peso < 100 || peso > 120){
                defectuosas++;
            }else{
                aprovadas++;
            }
        }

        JOptionPane.showMessageDialog(null, "Piezas aprovadas: " + aprovadas +"\n"
                +"Piezas defectuosas:" +  defectuosas);

    }

}
