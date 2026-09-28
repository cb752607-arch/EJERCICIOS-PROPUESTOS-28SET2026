import java.util.Scanner;

public class ComparacionAsistencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el porcentaje de asistencia de ambos estudiantes
        System.out.print("Ingrese asistencia del estudiante 1: ");
        double asistencia1 = scanner.nextDouble();

        System.out.print("Ingrese asistencia del estudiante 2: ");
        double asistencia2 = scanner.nextDouble();
        System.out.println();

        // Mostrar las comparaciones relacionales
        System.out.println(asistencia1 + " es mayor que " + asistencia2 + ": " + (asistencia1 > asistencia2));
        System.out.println(asistencia1 + " es menor que " + asistencia2 + ": " + (asistencia1 < asistencia2));
        System.out.println(asistencia1 + " es mayor o igual que " + asistencia2 + ": " + (asistencia1 >= asistencia2));
        System.out.println(asistencia1 + " es menor o igual que " + asistencia2 + ": " + (asistencia1 <= asistencia2));
        System.out.println(asistencia1 + " es igual a " + asistencia2 + ": " + (asistencia1 == asistencia2));
        System.out.println(asistencia1 + " es diferente de " + asistencia2 + ": " + (asistencia1 != asistencia2));
        System.out.println();

        // Indicar quién tiene mejor asistencia
        if (asistencia1 > asistencia2) {
            System.out.println("El estudiante 1 tiene mejor asistencia.");
        } else if (asistencia2 > asistencia1) {
            System.out.println("El estudiante 2 tiene mejor asistencia.");
        } else {
            System.out.println("Ambos estudiantes tienen la misma asistencia.");
        }

        // Calcular y mostrar la diferencia absoluta
        double diferencia = Math.abs(asistencia1 - asistencia2);
        
        // Se hace un cast a entero si deseas que salga sin decimales como en el ejemplo (ej. 5%)
        System.out.println("Diferencia de asistencia: " + (int)diferencia + "%");

        scanner.close();
    }
}