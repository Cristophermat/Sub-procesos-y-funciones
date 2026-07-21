/**
 * @author Cristopher Matias Montesdeoca Gómez
 */
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int numero;
            
            System.out.print("Ingrese un número entero: ");
            numero = entrada.nextInt();
            
            for (int i = 1; i <= 12; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }
}
