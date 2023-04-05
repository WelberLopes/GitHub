import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = input.nextLine();
        System.out.println("Digite a sua idade em anos (YY): ");
        int idade = input.nextInt();
        System.out.println("Digite a cidade em que você nasceu: ");
        String naturalidade = input.next();

        System.out.println("Deseja visualizar dados completos? ");
        char resposta = input.next().charAt(0);

        if (resposta == 'S') {
            System.out.println("Cadastro completo:");
            System.out.println("Nome: " + nome);
            System.out.println("Sobrenome : " + sobrenome);
            System.out.println("Idade: " + idade);
            System.out.println("Naturalidade : " + naturalidade);
        } else if (resposta == 'N') {
            System.out.println("Dados resumidos:");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        } else {
            System.out.println("Digitação errada, tente novamente.");
        }
    }
}