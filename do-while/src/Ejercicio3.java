import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {

        int cantidadTenperatura, temperatura, contador, temperaturaMax;

        contador = 1;
        temperaturaMax = 0;

        cantidadTenperatura = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de lecturas de temperatura que se tomaron: "));

        do {
            temperatura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la temperatura (en grados Celsius) " + contador +":"));

            if (temperatura > temperaturaMax) {
                temperaturaMax = temperatura;
            }
            contador++;

        } while (contador <= cantidadTenperatura);

        JOptionPane.showMessageDialog(null, "La temperatura máxima registrada fue: " + temperaturaMax + "°c");

    }
}

