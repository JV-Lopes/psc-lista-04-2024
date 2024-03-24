import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // pede usuário e senha
        System.out.print("Digite o nome de usuário: ");
        String username = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String password = scanner.nextLine();
        
        // verifica a senha
        while (password.equals(username)) {
            System.out.println("Erro: A senha não pode ser igual ao nome de usuário.");
            System.out.print("Digite a senha novamente: ");
            password = scanner.nextLine();
        }

        scanner.close();
        
        System.out.println("Cadastro realizado com sucesso!");
    }
}
