import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char continuar = 's';
        
        while (continuar == 's') {
            // pede a população e o crescimento
            System.out.println("Informe a população inicial do país A:");
            int populacaoA = obterPopulacaoValida(scanner);

            System.out.println("Informe a taxa de crescimento anual do país A (em decimal):");
            double taxaCrescimentoA = obterTaxaCrescimentoValida(scanner);

            System.out.println("Informe a população inicial do país B:");
            int populacaoB = obterPopulacaoValida(scanner);

            System.out.println("Informe a taxa de crescimento anual do país B (em decimal):");
            double taxaCrescimentoB = obterTaxaCrescimentoValida(scanner);

            int anos = 0;

            // calcula os anos necessários para a população de A ultrapassar ou igualar a população de B
            while (populacaoA <= populacaoB) {
                populacaoA += populacaoA * taxaCrescimentoA;
                populacaoB += populacaoB * taxaCrescimentoB;
                anos++;
            }

            // mostra resultado
            System.out.println("Serão necessários " + anos + " anos para a população do país A ultrapassar ou igualar a população do país B.");

            // pergunta ao usuário se deseja continuar
            System.out.println("Deseja realizar outra operação? (s/n)");
            continuar = scanner.next().charAt(0);
        }

        scanner.close();
    }

    // função para obter uma população válida (um número inteiro positivo)
    private static int obterPopulacaoValida(Scanner scanner) {
        int populacao = -1;
        while (populacao <= 0) {
            System.out.print("População: ");
            if (scanner.hasNextInt()) {
                populacao = scanner.nextInt();
                if (populacao <= 0) {
                    System.out.println("Por favor, insira um valor inteiro positivo para a população.");
                }
            } else {
                System.out.println("Por favor, insira um valor inteiro positivo para a população.");
                scanner.next(); // Limpar o buffer do scanner
            }
        }
        return populacao;
    }

    // função para obter uma taxa de crescimento válida (um número decimal entre 0 e 1)
    private static double obterTaxaCrescimentoValida(Scanner scanner) {
        double taxa = -1.0;
        while (taxa < 0 || taxa > 1) {
            System.out.print("Taxa de crescimento (em decimal): ");
            if (scanner.hasNextDouble()) {
                taxa = scanner.nextDouble();
                if (taxa < 0 || taxa > 1) {
                    System.out.println("Por favor, insira um valor decimal entre 0 e 1 para a taxa de crescimento.");
                }
            } else {
                System.out.println("Por favor, insira um valor decimal entre 0 e 1 para a taxa de crescimento.");
                scanner.next(); // Limpar o buffer do scanner
            }
        }
        return taxa;
    }
}
