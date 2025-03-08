import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el inicio del rango: ");
        int inicio = scanner.nextInt();

        System.out.print("Ingrese el fin del rang: ");
        int fin = scanner.nextInt();

        System.out.println("Números amigos en el rango [" + inicio + ", " + fin + "]:");
        for (int i = inicio; i <= fin; i++) {

            if (esNumeroAmigo(i)) {
                System.out.print(i + " (Divisores: ");
                mostrarDivisores(i);
                System.out.println(")");
            }
        }
        scanner.close();
    }

    public static boolean esNumeroAmigo(int numero) {
        int contadorDivisores = 0;
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                contadorDivisores++;
                if (contadorDivisores > 2) {
                    return false;

                }
            }
        }
        return contadorDivisores == 2;
    }

    public static void mostrarDivisores(int numero) {
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}