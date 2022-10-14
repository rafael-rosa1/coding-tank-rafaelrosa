import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = leia.nextInt();
        leia.close();

        if(numero > 0) {
            System.out.println("O número " + numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é negativo.");
        } else {
            System.out.println("O número " + numero + " é zero.");
        }
    }
}
