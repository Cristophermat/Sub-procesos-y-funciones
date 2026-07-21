/**
 * @author Cristopher Matias Montesdeoca Gómez
 */
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double calificacion;

        System.out.print("Ingrese una calificación entre 0 y 10: ");
        calificacion = entrada.nextDouble();

        if (calificacion < 0 || calificacion > 10) {
            System.out.println("Calificación fuera del rango permitido.");
        } else if (calificacion >= 9) {
            System.out.println("Excelente");
        } else if (calificacion >= 8) {
            System.out.println("Muy Bueno");
        } else if (calificacion >= 7) {
            System.out.println("Bueno");
        } else if (calificacion >= 5) {
            System.out.println("Regular");
        } else {
            System.out.println("Deficiente");
        }

        entrada.close();
    }
}
