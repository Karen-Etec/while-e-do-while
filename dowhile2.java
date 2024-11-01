import java.util.Scanner;

public class dowhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;

        do {
            System.out.print("Digite a temperatura em Celsius (0 para sair): ");
            celsius = scanner.nextDouble();

            if (celsius != 0) {
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
            }
        } while (celsius != 0);

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}