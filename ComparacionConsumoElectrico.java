import java.util.Scanner;

public class ComparacionConsumoElectrico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el consumo mensual de electricidad de ambos hogares
        System.out.print("Ingrese consumo del hogar 1: ");
        double hogar1 = scanner.nextDouble();

        System.out.print("Ingrese consumo del hogar 2: ");
        double hogar2 = scanner.nextDouble();
        System.out.println();

        // Mostrar las comparaciones relacionales
        System.out.println(hogar1 + " es mayor que " + hogar2 + ": " + (hogar1 > hogar2));
        System.out.println(hogar1 + " es menor que " + hogar2 + ": " + (hogar1 < hogar2));
        System.out.println(hogar1 + " es mayor o igual que " + hogar2 + ": " + (hogar1 >= hogar2));
        System.out.println(hogar1 + " es menor o igual que " + hogar2 + ": " + (hogar1 <= hogar2));
        System.out.println(hogar1 + " es igual a " + hogar2 + ": " + (hogar1 == hogar2));
        System.out.println(hogar1 + " es diferente de " + hogar2 + ": " + (hogar1 != hogar2));
        System.out.println();

        // Determinar qué hogar consumió más energía y calcular la diferencia
        if (hogar1 > hogar2) {
            System.out.println("El hogar 1 consumió más energía.");
            double diferencia = hogar1 - hogar2;
            // Mostramos como entero si no tiene decimales para que coincida con el ejemplo
            System.out.println("La diferencia es de " + (diferencia == (int)diferencia ? (int)diferencia : diferencia) + " kWh.");
        } else if (hogar2 > hogar1) {
            System.out.println("El hogar 2 consumió más energía.");
            double diferencia = hogar2 - hogar1;
            System.out.println("La diferencia es de " + (diferencia == (int)diferencia ? (int)diferencia : diferencia) + " kWh.");
        } else {
            System.out.println("Ambos hogares consumieron la misma cantidad de energía.");
            System.out.println("La diferencia es de 0 kWh.");
        }

        scanner.close();
    }
}