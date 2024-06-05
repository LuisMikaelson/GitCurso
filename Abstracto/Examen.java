package Abstracto;
import java.io.*;
public class Examen {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int numero, i;
        BufferedReader obtenerNumero = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingesa");
        numero = Integer.parseInt(obtenerNumero.readLine());
        for (i = 1; i<=10; i++){
            System.out.println(numero +" x "+ i + " = " + numero*i + "\n");
        }
    }
}