import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um n�mero:");
        int numero = leia.nextInt();
        leia.close();

        if(numero > 0) {
            System.out.println("O n�mero " + numero + " � positivo.");
        } else if (numero < 0) {
            System.out.println("O n�mero " + numero + " � negativo.");
        } else {
            System.out.println("O n�mero " + numero + " � zero.");
        }
    }
}
