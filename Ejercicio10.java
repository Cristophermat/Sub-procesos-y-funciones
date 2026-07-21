/**
 * @author Cristopher Matias Montesdeoca Gómez
 */
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int numero;
            int suma = 0;
            double promedio;
            
            for (int i = 1; i <= 10; i++) {
                System.out.print("Ingrese el número " + i + ": ");
                numero = entrada.nextInt();
                suma = suma + numero;
            }
            
            promedio = (double) suma / 10;
            
            System.out.println("Suma: " + suma);
            System.out.println("Promedio: " + promedio);
        }
    }
}
