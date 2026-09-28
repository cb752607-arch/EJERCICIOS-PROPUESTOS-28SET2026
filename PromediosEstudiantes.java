import java.util.Scanner;

public class PromediosEstudiantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int promedio1, promedio2;
        
        System.out.print("Ingrese el promedio del estudiante 1: ");
        promedio1 = entrada.nextInt();
        
        System.out.print("Ingrese el promedio del estudiante 2: ");
        promedio2 = entrada.nextInt();
        System.out.println(); // Salto de línea para separar
        
        // Las 6 comparaciones relacionales
        System.out.println(promedio1 + " es mayor que " + promedio2 + ": " + (promedio1 > promedio2));
        System.out.println(promedio1 + " es menor que " + promedio2 + ": " + (promedio1 < promedio2));
        System.out.println(promedio1 + " es mayor o igual que " + promedio2 + ": " + (promedio1 >= promedio2));
        System.out.println(promedio1 + " es menor o igual que " + promedio2 + ": " + (promedio1 <= promedio2));
        System.out.println(promedio1 + " es igual a " + promedio2 + ": " + (promedio1 == promedio2));
        System.out.println(promedio1 + " es diferente de " + promedio2 + ": " + (promedio1 != promedio2));
        System.out.println(); // Salto de línea
        
        // Condicionales para ver quién obtuvo mejor promedio y calcular la diferencia
        if (promedio1 > promedio2) {
            System.out.println("El estudiante 1 obtuvo el mejor promedio.");
            System.out.println("La diferencia entre ambos promedios es: " + (promedio1 - promedio2));
        } else if (promedio2 > promedio1) {
            System.out.println("El estudiante 2 obtuvo el mejor promedio.");
            System.out.println("La diferencia entre ambos promedios es: " + (promedio2 - promedio1));
        } else {
            System.out.println("Ambos estudiantes tienen el mismo promedio.");
            System.out.println("La diferencia entre ambos promedios es: 0");
        }
    }
}