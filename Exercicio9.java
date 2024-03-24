public class Exercicio9 {
    public static void main(String[] args) {
        System.out.println("Números ímpares entre 1 e 50:");
        
        // loop de 1 a 50 para verificar os números ímpares
        for (int i = 1; i <= 50; i++) {
            // verifica se o número é ímpar
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
