import java.util.Scanner;

public class ComparacionVentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar las ventas de los dos vendedores
System.out.print("Ingrese ventas del vendedor 1: ");
        double vendedor1 = scanner.nextDouble();

System.out.print("Ingrese ventas del vendedor 2: ");
        double vendedor2 = scanner.nextDouble();
        System.out.println();

        // Operadores relacionales
        boolean mayor = vendedor1 > vendedor2;
        boolean menor = vendedor1 < vendedor2;
        boolean mayorIgual = vendedor1 >= vendedor2;
        boolean menorIgual = vendedor1 <= vendedor2;
        boolean igual = vendedor1 == vendedor2;
        boolean diferente = vendedor1 != vendedor2;

        // Mostrar resultados de las comparaciones
        System.out.println(vendedor1 + " es mayor que " + vendedor2 + ": " + mayor);
        System.out.println(vendedor1 + " es menor que " + vendedor2 + ": " + menor);
        System.out.println(vendedor1 + " es mayor o igual que " + vendedor2 + ": " + mayorIgual);
        System.out.println(vendedor1 + " es menor o igual que " + vendedor2 + ": " + menorIgual);
        System.out.println(vendedor1 + " es igual a " + vendedor2 + ": " + igual);
        System.out.println(vendedor1 + " es diferente de " + vendedor2 + ": " + diferente);
        System.out.println();

        // Indicar quién realizó más ventas y calcular la diferencia absoluta
        if (vendedor1 > vendedor2) {
System.out.println("El vendedor 1 realizó más ventas.");
            System.out.println("La diferencia es: S/ " + (vendedor1 - vendedor2));
        } else if (vendedor2 > vendedor1) {
            System.out.println("El vendedor 2 realizó más ventas.");
            System.out.println("La diferencia es: S/ " + (vendedor2 - vendedor1));
        } else {
            System.out.println("Ambos vendedores realizaron la misma cantidad de ventas.");
            System.out.println("La diferencia es: S/ 0");
        }

        scanner.close();
    }
}