
public class Act_8 {
    public static void main(String[] args) {
        String cadena = "sena";
        String invertido = "";

        for (int i = cadena.length() -1 ; i >= 0; i--) {
            invertido += cadena.charAt(i);
        }
        System.out.println(invertido);
    }
}
