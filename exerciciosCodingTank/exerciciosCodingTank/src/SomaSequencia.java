import java.util.Scanner;

public class SomaSequencia {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe um numero para somar todos seus antecessores positivos.");
        int numeroInicial = leia.nextInt();
        int soma = 0;
        for (int i = numeroInicial; i >= 1; i--) {
            soma += i;
        }

        System.out.println(soma);
    }
}
