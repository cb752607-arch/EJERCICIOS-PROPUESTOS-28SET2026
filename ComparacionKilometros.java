import java.util.Scanner;

public class ComparacionKilometros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese kilómetros del conductor 1: ");
        int cond1 = scanner.nextInt();

        System.out.print("Ingrese kilómetros del conductor 2: ");
        int cond2 = scanner.nextInt();
        System.out.println();

        // Comparaciones relacionales
        System.out.println(cond1 + " es mayor que " + cond2 + ": " + (cond1 > cond2));
        System.out.println(cond1 + " es menor que " + cond2 + ": " + (cond1 < cond2));
        System.out.println(cond1 + " es mayor o igual que " + cond2 + ": " + (cond1 >= cond2));
        System.out.println(cond1 + " es menor o igual que " + cond2 + ": " + (cond1 <= cond2));
        System.out.println(cond1 + " es igual a " + cond2 + ": " + (cond1 == cond2));
        System.out.println(cond1 + " es diferente de " + cond2 + ": " + (cond1 != cond2));
        System.out.println();

        // Determinar quién recorrió más y cálculo de la diferencia
        if (cond1 > cond2) {
            System.out.println("El conductor 1 recorrió más kilómetros.");
        } else if (cond2 > cond1) {
            System.out.println("El conductor 2 recorrió más kilómetros.");
        } else {
            System.out.println("Ambos conductores recorrieron la misma cantidad de kilómetros.");
        }

        int diferencia = Math.abs(cond1 - cond2);
        System.out.println("Diferencia: " + diferencia + " km.");

        scanner.close();
    }
}