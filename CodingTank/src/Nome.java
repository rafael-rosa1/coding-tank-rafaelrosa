import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome;
        int anoNascimento;

        System.out.println("Olá, qual o seu nome?");
        nome = ler.nextLine();
        saudacao(nome);

        System.out.println("Qual o seu ano de nascimento?");
        anoNascimento = ler.nextInt();
        idade(anoNascimento);
        ler.close();
    }

    public static void saudacao(String nome) {
        System.out.println(("Boa noite, " + nome + "."));
    }

    public static void idade(int anoNascimento) {
        int idade =  2022 - anoNascimento;
        System.out.println("No final de 2022 eu terei " + idade + " anos de idade.");
    }
}
