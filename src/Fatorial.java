import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo.");
        int numero = leia.nextInt();

        int fatorial = fatorialRecursivo(numero);

        System.out.printf("%d! = %d", numero, fatorial);

//        for (int i = numero; i >= 1 ; i--) {
//            fatorial *= i;
//        }

    }

    private static int fatorialRecursivo(int n) {
        if(n <= 1) {
            return 1;
        }
        return n * fatorialRecursivo(n - 1);
    }

}
