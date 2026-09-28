import java.util.Scanner;

public class ComparacionSaldosBancarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el saldo de las dos cuentas bancarias
        System.out.print("Ingrese saldo de la cuenta 1: ");
        double saldo1 = scanner.nextDouble();

        System.out.print("Ingrese saldo de la cuenta 2: ");
        double saldo2 = scanner.nextDouble();
        System.out.println();

        // Mostrar las comparaciones relacionales
        System.out.println(saldo1 + " es mayor que " + saldo2 + ": " + (saldo1 > saldo2));
        System.out.println(saldo1 + " es menor que " + saldo2 + ": " + (saldo1 < saldo2));
        System.out.println(saldo1 + " es mayor o igual que " + saldo2 + ": " + (saldo1 >= saldo2));
        System.out.println(saldo1 + " es menor o igual que " + saldo2 + ": " + (saldo1 <= saldo2));
        System.out.println(saldo1 + " es igual a " + saldo2 + ": " + (saldo1 == saldo2));
        System.out.println(saldo1 + " es diferente de " + saldo2 + ": " + (saldo1 != saldo2));
        System.out.println();

        // Determinar qué cuenta posee más dinero y calcular la diferencia
        if (saldo1 > saldo2) {
            System.out.println("La cuenta 1 tiene mayor saldo.");
        } else if (saldo2 > saldo1) {
            System.out.println("La cuenta 2 tiene mayor saldo.");
        } else {
            System.out.println("Ambas cuentas tienen el mismo saldo.");
        }

        double diferencia = Math.abs(saldo1 - saldo2);
        // Formatear como entero si no tiene decimales para que coincida limpiamente con el ejemplo
        String diferenciaFormateada = (diferencia == (int) diferencia) ? String.valueOf((int) diferencia) : String.valueOf(diferencia);
        
        System.out.println("La diferencia es: S/ " + diferenciaFormateada);

        scanner.close();
    }
}