import java.util.Scanner;

public class ComparacionSueldos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int sueldo1, sueldo2;
        
System.out.print("Ingrese sueldo 1: ");
        sueldo1 = entrada.nextInt();
        
System.out.print("Ingrese sueldo 2: ");
        sueldo2 = entrada.nextInt();
        System.out.println(); // Salto de línea para separar
        
        // Las 6 comparaciones relacionales
        System.out.println(sueldo1 + " es mayor que " + sueldo2 + ": " + (sueldo1 > sueldo2));
        System.out.println(sueldo1 + " es menor que " + sueldo2 + ": " + (sueldo1 < sueldo2));
        System.out.println(sueldo1 + " es mayor o igual que " + sueldo2 + ": " + (sueldo1 >= sueldo2));
        System.out.println(sueldo1 + " es menor o igual que " + sueldo2 + ": " + (sueldo1 <= sueldo2));
        System.out.println(sueldo1 + " es igual a " + sueldo2 + ": " + (sueldo1 == sueldo2));
        System.out.println(sueldo1 + " es diferente de " + sueldo2 + ": " + (sueldo1 != sueldo2));
        System.out.println(); // Salto de línea
        
        // Condicionales para determinar quién gana más y la diferencia salarial
        if (sueldo1 > sueldo2) {
System.out.println("El practicante 1 gana más.");
            System.out.println("La diferencia salarial es: S/ " + (sueldo1 - sueldo2));
        } else if (sueldo2 > sueldo1) {
System.out.println("El practicante 1 gana más.");
            System.out.println("La diferencia salarial es: S/ " + (sueldo2 - sueldo1));
        } else {
System.out.println("El practicante 1 gana más.");
            System.out.println("La diferencia salarial es: S/ 0");
        }
    }
}