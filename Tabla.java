import  java.util.Scanner;

public class Tabla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { // ciclo infinito

            System.out.print("\nIngrese un número (o escribe 'salir'): ");
            String entrada = sc.nextLine();

            //  condición para salir
            if (entrada.equalsIgnoreCase("salir")) {
                System.out.println("Programa terminado ");
                break;
            }

            int numero = Integer.parseInt(entrada);
            int i = 1;

            do {
                System.out.println(numero + " x " + i + " = " + (numero * i));
                i++;
            } while (i <= 10);
        }
    }
} 
