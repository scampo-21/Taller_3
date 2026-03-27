import java.util.Scanner;

public class Aleatorio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) { // ciclo infinito

            int numeroAleatorio = (int)(Math.random() * 100) + 1;
            String entrada;
            int intento;

            System.out.println("\n--- Nuevo juego ---");
            System.out.println("Escribe 'salir' para terminar");

            do {
                System.out.print("Adivina el número: ");
                entrada = sc.nextLine();

                // condición para salir
                if (entrada.equalsIgnoreCase("salir")) {
                    System.out.println("Juego terminado ");
                    break;
                }

                intento = Integer.parseInt(entrada);

                if (intento < numeroAleatorio) {
                    System.out.println("El número es mayor");
                } else if (intento > numeroAleatorio) {
                    System.out.println("El número es menor");
                }

            } while (intento != numeroAleatorio);

            // si escribió salir, se rompe el while principal
            if (entrada.equalsIgnoreCase("salir")) {
                break;
            }

            System.out.println("¡Correcto! Adivinaste el número ");
        }
    }
}