import java.util.Scanner;

public class while4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo N: ");
        int N = scanner.nextInt();
        int contador = 1;

        System.out.println("Números pares de 1 a " + N + ":");
        while (contador <= N) {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
            contador++;
        }
        scanner.close();
    }
}