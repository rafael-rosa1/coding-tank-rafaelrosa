import java.util.Scanner;

public class Palavras {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Quantas palavras serão informadas?");
        int qtdePalavras = leia.nextInt();
        leia.nextLine();
        String[] palavras = new String[qtdePalavras];

        for (int i = 0; i < qtdePalavras; i++) {
            System.out.printf("Informe a palavra %s\n", (i + 1));
            palavras[i] = leia.nextLine();
        }

        System.out.print("Palavras informadas: ");
        for (int i = 0; i < palavras.length; i++) {
            if (i == palavras.length - 1) {
                System.out.println(palavras[i] + ".");
            } else {
                System.out.print(palavras[i] + ", ");
            }
        }
        System.out.print("Ordem inversa: ");
        for (int i = palavras.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(palavras[i] + ".");
            } else {
                System.out.print(palavras[i] + ", ");
            }
        }
    }
}
