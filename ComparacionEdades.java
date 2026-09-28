import java.util.Scanner;

public class ComparacionEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de edades
        System.out.print("Ingrese edad del trabajador 1: ");
        int edad1 = scanner.nextInt();
        
        System.out.print("Ingrese edad del trabajador 2: ");
        int edad2 = scanner.nextInt();
        
        System.out.println(); // Espacio en blanco para separar

        // Operadores relacionales
        System.out.println(edad1 + " es mayor que " + edad2 + ": " + (edad1 > edad2));
        System.out.println(edad1 + " es menor que " + edad2 + ": " + (edad1 < edad2));
        System.out.println(edad1 + " es mayor o igual que " + edad2 + ": " + (edad1 >= edad2));
        System.out.println(edad1 + " es menor o igual que " + edad2 + ": " + (edad1 <= edad2));
        System.out.println(edad1 + " es igual a " + edad2 + ": " + (edad1 == edad2));
        System.out.println(edad1 + " es diferente de " + edad2 + ": " + (edad1 != edad2));
        
        System.out.println(); // Espacio en blanco

        // Determinar quién es mayor y calcular la diferencia de edad usando Math.abs para asegurar un valor positivo
        if (edad1 > edad2) {
            System.out.println("El trabajador 1 es mayor.");
        } else if (edad2 > edad1) {
            System.out.println("El trabajador 2 es mayor.");
        } else {
            System.out.println("Ambos trabajadores tienen la misma edad.");
        }

        int diferencia = Math.abs(edad1 - edad2);
        System.out.println("La diferencia de edad es: " + diferencia + " años.");

        scanner.close();
    }
}