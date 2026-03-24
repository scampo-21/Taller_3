import java.util.Scanner;

public class taller3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // MENÚ DENTRO DEL CUADRO
            System.out.println("/==========================================\\");
            System.out.println("||           ===== MENÚ =====            ||");
            System.out.println("|| 1. Fibonacci                         ||");
            System.out.println("|| 2. Número primo                      ||");
            System.out.println("|| 3. Ecuación cuadrática               ||");
            System.out.println("|| 4. Promedio                          ||");
            System.out.println("|| 5. Salir                             ||");
            System.out.println("\\==========================================/");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el número: ");
                    int n = sc.nextInt();

                    int suma = 0, a = 0, b = 1;
                    for (int i = 0; i < n; i++) {
                        suma += a;
                        int t = a + b;
                        a = b;
                        b = t;
                    }

                    // RESULTADO EN CUADRO
                    System.out.println("/==========================================\\");
                    System.out.println("|| Suma Fibonacci: " + suma + "               ||");
                    System.out.println("\\==========================================/");
                    break;

                case 2:
                    System.out.print("Ingrese n: ");
                    int num = sc.nextInt();

                    int contador = 0, numero = 2;
                    while (contador < num) {
                        if (esPrimo(numero)) contador++;
                        if (contador == num) {
                            System.out.println("/==========================================\\");
                            System.out.println("|| Primo: " + numero + "                      ||");
                            System.out.println("\\==========================================/");
                            break;
                        }
                        numero++;
                    }
                    break;

                case 3:
                    System.out.print("Ingrese a: ");
                    double a1 = sc.nextDouble();

                    System.out.print("Ingrese b: ");
                    double b1 = sc.nextDouble();

                    System.out.print("Ingrese c: ");
                    double c1 = sc.nextDouble();

                    double d = b1 * b1 - 4 * a1 * c1;

                    System.out.println("/==========================================\\");
                    if (d > 0) {
                        double x1 = (-b1 + Math.sqrt(d)) / (2 * a1);
                        double x2 = (-b1 - Math.sqrt(d)) / (2 * a1);
                        System.out.println("|| Raices: " + x1 + " , " + x2 + "        ||");
                    } else if (d == 0) {
                        double x = -b1 / (2 * a1);
                        System.out.println("|| Raiz doble: " + x + "                  ||");
                    } else {
                        System.out.println("|| No hay raices reales                  ||");
                    }
                    System.out.println("\\==========================================/");
                    break;

                case 4:
                    System.out.print("Cantidad de numeros: ");
                    int cant = sc.nextInt();

                    double sumaNum = 0;
                    for (int i = 0; i < cant; i++) {
                        System.out.print("Numero " + (i + 1) + ": ");
                        sumaNum += sc.nextDouble();
                    }

                    double prom = sumaNum / cant;

                    System.out.println("/==========================================\\");
                    System.out.println("|| Promedio: " + prom + "                ||");
                    System.out.println("\\==========================================/");
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 5);

        sc.close();
    }

    public static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}