import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n--- CALCULADORA BÁSICA ---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Primer numero: ");
                int num1 = teclado.nextInt();

                System.out.print("Segundo numero: ");
                int num2 = teclado.nextInt();

                if (num1 < -99999 || num1 > 99999 || num2 < -99999 || num2 > 99999) {
                    System.out.println("Error");
                } else if (opcion == 1) {
                    System.out.println("Resultado: " + (num1 + num2));
                } else if (opcion == 2) {
                    System.out.println("Resultado: " + (num1 - num2));
                } else if (opcion == 3) {
                    System.out.println("Resultado: " + (num1 * num2));
                } else if (opcion == 4) {
                    if (num2 == 0) {
                        System.out.println("Error: No se puede dividir entre cero.");
                    } else {
                        System.out.println("Resultado: " + ((double) num1 / num2));
                    }
                }
            } else if (opcion == 5) {
                System.out.println("Has salido del programa");
            } else {
                System.out.println("Opcion incorrecta. Elige del 1 al 5.");
            }
        }

    }
}