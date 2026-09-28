import java.util.Scanner;

public class ComparacionProduccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese producción de la fábrica 1: ");
        int fabrica1 = scanner.nextInt();

        System.out.print("Ingrese producción de la fábrica 2: ");
        int fabrica2 = scanner.nextInt();
        System.out.println();

        // Operadores relacionales
        System.out.println(fabrica1 + " es mayor que " + fabrica2 + ": " + (fabrica1 > fabrica2));
        System.out.println(fabrica1 + " es menor que " + fabrica2 + ": " + (fabrica1 < fabrica2));
        System.out.println(fabrica1 + " es mayor o igual que " + fabrica2 + ": " + (fabrica1 >= fabrica2));
        System.out.println(fabrica1 + " es menor o igual que " + fabrica2 + ": " + (fabrica1 <= fabrica2));
        System.out.println(fabrica1 + " es igual a " + fabrica2 + ": " + (fabrica1 == fabrica2));
        System.out.println(fabrica1 + " es diferente de " + fabrica2 + ": " + (fabrica1 != fabrica2));
        System.out.println();

        // Análisis de producción y diferencia
        if (fabrica1 > fabrica2) {
            System.out.println("La fábrica 1 produjo más.");
            System.out.println("Diferencia de producción: " + (fabrica1 - fabrica2) + " unidades.");
        } else if (fabrica2 > fabrica1) {
            System.out.println("La fábrica 2 produjo más.");
            System.out.println("Diferencia de producción: " + (fabrica2 - fabrica1) + " unidades.");
        } else {
            System.out.println("Ambas fábricas produjeron lo mismo.");
            System.out.println("Diferencia de producción: 0 unidades.");
        }

        scanner.close();
    }
}