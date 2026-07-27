import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args){
        int taza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la taza de cambio reprentativa del mercado (TRM)"));
        double trm=Double.parseDouble(String.valueOf(taza));
        String resultado= "Tabla de convercion :";


        for(int usd=0; usd <= 10; usd++){
           double cop=usd * trm;
           resultado += usd + "\n " + "USD =" + "\n " +  "\n " + "COP";

        }
        JOptionPane.showMessageDialog(null, "El resultado es:" + "\n " + resultado);
    }

}
