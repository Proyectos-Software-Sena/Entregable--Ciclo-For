import javax.swing.*;

public class Ejercicio7 {
    public static void main (String[] args){
    Double precio = Double.parseDouble(JOptionPane.showInputDialog("ingrese preicio actual del dolar"));
    String tabla = "precio del dolar o TRM";
    tabla=tabla+precio+"\n\n";
    for (int usd=1;usd<=10;usd++){
        double cop = usd*precio;
        tabla=tabla+usd+"USD="+cop+"COP\n";
    }
    JOptionPane.showMessageDialog(null, tabla);
    }
}
