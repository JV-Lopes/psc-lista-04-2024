import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // pede 5 números
        System.out.println("Digite 5 números:");

        // inicializar a variável para armazenar o maior número
        int maiorNumero = Integer.MIN_VALUE;

        // lê os 5 números e encontra o maior
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            // verifica se o número lido é maior que o número armazenado atualmente
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        // mostra o maior número
        System.out.println("O maior número é: " + maiorNumero);

        scanner.close();
    }
}
