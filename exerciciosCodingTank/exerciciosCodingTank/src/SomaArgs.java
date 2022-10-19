import java.util.Scanner;

public class SomaArgs {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        if(args.length == 0) {
            System.out.println("Digite o primeiro numero:");
            int valor1 = leia.nextInt();
            System.out.println("Digite o segundo numero:");
            int valor2 = leia.nextInt();
            System.out.println((valor1 + valor2));
        } else if(args.length == 1) {
            int valor1 = Integer.parseInt(args[0]);
            System.out.println("Digita mais um numero para efetuar a soma:");
            int valor2 = leia.nextInt();
            System.out.println((valor1 + valor2));
        } else if(args.length == 2) {
            int soma = 0;
            for (int i = 0; i <= args.length - 1; i++) {
                soma = soma + Integer.parseInt(args[i]);
            }
            System.out.println(soma);
        } else {
            System.out.println("Quantidade de valores inválida.");
        }
    }
}
