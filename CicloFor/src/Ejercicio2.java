import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args){
        int piezas= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de piezas que desea revisar :"));
        int aprobadas=0;
        int reprobadas=0;
        for (int i=0; i < piezas; i++){
            int peso= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso en gramos de cada pieza :"));
            if (peso <= 100 || peso >= 120){
                JOptionPane.showMessageDialog(null, "Esta reprobada");
                reprobadas++;
            } else{
                JOptionPane.showMessageDialog(null, "Esta aprovada");
                aprobadas++;
            }
        }
        JOptionPane.showMessageDialog(null, " La cantidad total de piezas" + "\n" + "Aprobadas"
                +  "\n" +  aprobadas + "\n" +
                "y la cantidad de piezas " + "\n" + "Defectuosas" + "\n" + reprobadas);
    }
}
