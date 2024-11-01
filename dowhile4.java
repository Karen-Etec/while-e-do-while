import java.util.Scanner;

public class dowhile4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contagemImpares = 0;

        do {
            System.out.print("Insira um número inteiro (0 para sair): ");
            numero = scanner.nextInt();

            if (numero != 0 && numero % 2 != 0) {
                contagemImpares++;
            }
        } while (numero != 0);

        System.out.println("Você inseriu " + contagemImpares + " números ímpares.");
        scanner.close();
    }
}