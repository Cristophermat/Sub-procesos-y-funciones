/**
 * @author Cristopher Matias Montesdeoca Gómez
 */
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            String contrasena;
            
            do {
                System.out.print("Ingrese la contraseña: ");
                contrasena = entrada.nextLine();
            } while (!contrasena.equals("java2026"));
            
            System.out.println("Acceso concedido.");
        }
    }
}
