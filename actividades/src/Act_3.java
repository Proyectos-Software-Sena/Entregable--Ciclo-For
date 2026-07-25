import javax.swing.*;

public class Act_3 {
    public static void main(String[] args){
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("cuantas temperaturas se tomaron "));
        int temp = 0;
        int num = 0;
        for (int i = 1;i <= cantidad;i++){
            temp = Integer.parseInt(JOptionPane.showInputDialog("escriba los valores "));
            if (temp > num){
                num = temp;
            }

        }
        System.out.println("La temperatura máxima registrada fue:" + num);
    }
}
