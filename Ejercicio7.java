/**
 * @author Cristopher Matias Montesdeoca Gómez
 */
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int numero;
            int cantidad = 0;
            int suma = 0;
            
            do {
                System.out.print("Ingrese un número positivo o uno negativo para terminar: ");
                numero = entrada.nextInt();
                
                if (numero >= 0) {
                    suma = suma + numero;
                    cantidad = cantidad + 1;
                }
            } while (numero >= 0);
            
            System.out.println("Cantidad de números ingresados: " + cantidad);
            System.out.println("Suma total: " + suma);
        }
    }
}
