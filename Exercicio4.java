public class Exercicio4{
    public static void main(String[] args) {
        // define a população e o crescimento
        int populacaoA = 80000;
        double taxaCrescimentoA = 0.03;
        int populacaoB = 200000;
        double taxaCrescimentoB = 0.015;
        
        int anos = 0;
        
        // calcula os anos necessários para a população de A ultrapassar ou igualar a população de B
        while (populacaoA <= populacaoB) {
            populacaoA += populacaoA * taxaCrescimentoA;
            populacaoB += populacaoB * taxaCrescimentoB;
            anos++;
        }
        
        // mostra resultado
        System.out.println("Serão necessários " + anos + " anos para a população do país A ultrapassar ou igualar a população do país B.");
    }
}