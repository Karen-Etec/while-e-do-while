import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();
        int contador = 1;

        System.out.println("Tabuada do " + numero + ":");
        while (contador <= 10) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;
        }
        scanner.close();
    }
}