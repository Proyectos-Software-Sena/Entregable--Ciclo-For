import javax.swing.*;

    public class Ejercicio2 {
        public static void main(String[] arg) {
            //preguntar las piezas
            int piezas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de piezas"));
            int aprobadas = 0;
            int defectuosas = 0;
            for (int i = 1; i <= piezas; i++){
                double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso de cada pieza"));
                if (peso < 100 || peso > 120) {
                    defectuosas++;
                }else{
                    aprobadas++;
                }
            }
            JOptionPane.showMessageDialog(null, "piezas aprobadas: " + aprobadas + "\n"
                    + "piezas defectuosas: " + defectuosas );
        }

    }

