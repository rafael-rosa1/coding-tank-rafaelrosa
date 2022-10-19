import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual operação deseja fazer? (opções: + - / *)");
        String operacao = leia.nextLine();


        boolean operacaoValida = operacao.equals("+") || operacao.equals("-") || operacao.equals("/") || operacao.equals("*");

        if(operacaoValida) {
            System.out.println("Informe o primeiro número:");
            int primeiroNumero = leia.nextInt();
            System.out.println("Informe o segundo número:");
            int segundoNumero = leia.nextInt();
            switch (operacao) {
                case "+" -> System.out.println((primeiroNumero + segundoNumero));
                case "-" -> System.out.println((primeiroNumero - segundoNumero));
                case "/" -> System.out.println((primeiroNumero / segundoNumero));
                case "*" -> System.out.println((primeiroNumero * segundoNumero));
            }
        } else {
            System.out.println("Operação desconhecida");
        }
    }
}
