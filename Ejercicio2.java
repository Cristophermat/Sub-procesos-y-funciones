/**
 * @author Cristopher Matias Montesdeoca Gómez
 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int numero1, numero2;
            System.out.print("Ingrese el primer numero entero: ");
            numero1 = entrada.nextInt();
            System.out.print("Ingrese el segundo numero entero: ");
            numero2 = entrada.nextInt();
            System.out.println("Suma: " + (numero1 + numero2));
            System.out.println("Resta: " + (numero1 - numero2));
            System.out.println("Multiplicacion: " + (numero1 * numero2));
            if (numero2 != 0) {
                System.out.println("Division: " + ((double) numero1 / numero2));
                System.out.println("Residuo: " + (numero1 % numero2));
            } else {
                System.out.println("No se puede dividir entre cero.");
                System.out.println("No se puede calcular el residuo entre cero.");
            }
        }
    }
}