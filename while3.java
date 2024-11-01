import java.util.Random;
import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 e 100
        int tentativas = 0;
        int palpite;

        while (true) {
            System.out.print("Adivinhe o número entre 1 e 100: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Você acertou! O número era " + numeroSecreto + ".");
                System.out.println("Você fez " + tentativas + " tentativas.");
                break;
            }
        }
        scanner.close();
    }
}