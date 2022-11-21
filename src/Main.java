import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        int inicio;
        int fin;
        int contador = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("TEXTO INNECESARIO");

        System.out.println("Escribe el inicio:");
        inicio = sc.nextInt();

        System.out.println("Escribe el fin:");
        fin = sc.nextInt();



        for (int x = inicio; x <= fin; x++) {
            if (esPrimo(x)) {
                contador++;
                System.out.print(x + ",");
            }
        }
        System.out.printf("\nTotal: %d", contador);
        sc.close();
    }



    public static boolean esPrimo(int numero) {
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }

        for (int x = 2; x < numero / 2; x++) {
            // Si es divisible por cualquiera de estos números, no es primo
            if (numero % x == 0)
                return false;
        }
        return true;
    }

}