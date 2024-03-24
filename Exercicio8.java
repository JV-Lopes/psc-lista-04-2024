import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // pede 5 números
        System.out.println("Digite 5 números:");

        // inicializar variáveis para armazenar a soma e a média
        int soma = 0;
        double media;

        // lê os 5 números e calcula a soma
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        // calcula a média
        media = (double) soma / 5;

        // mostra a soma e a média
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
