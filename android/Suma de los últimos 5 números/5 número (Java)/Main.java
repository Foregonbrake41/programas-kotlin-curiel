import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double suma = 0;

        for (int i = 1; i <= 5; i++) {
            getValidNumber(scanner, "Ingresa el número " + i + ": ");
        }

        for (int i = 6; i <= 10; i++) {
            suma += getValidNumber(scanner, "Ingresa el número " + i + ": ");
        }

        System.out.println("La suma de los últimos 5 números es: " + suma);
        scanner.close();
    }

    public static double getValidNumber(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String input = scanner.nextLine();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un número válido.\n");
            }
        }
    }
}