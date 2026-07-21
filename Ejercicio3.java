/**
 * @author Cristopher Matias Montesdeoca Gómez
 */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int edad;
            
            System.out.print("Ingrese su edad: ");
            edad = entrada.nextInt();
            
            if (edad >= 18) {
                System.out.println("Es mayor de edad.");
            }
        }
    }
}