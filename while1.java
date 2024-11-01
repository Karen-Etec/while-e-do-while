import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        while (true) {
            System.out.print("Insira um número inteiro (negativo para sair): ");
            numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            soma += numero;
        }

        System.out.println("A soma dos números positivos é: " + soma);
        scanner.close();
    }
}