import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // pede dois números inteiros
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        // verifica qual número é o menor e qual é o maior
        int menor = Math.min(numero1, numero2);
        int maior = Math.max(numero1, numero2);

        // mostra os números no intervalo definido
        System.out.println("Números no intervalo entre " + menor + " e " + maior + ":");
        for (int i = menor; i <= maior; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
