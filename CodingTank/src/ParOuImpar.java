import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um n�mero:");
        int numero = leia.nextInt();

        boolean resto = numero % 2 == 0;

        if(resto) {
            System.out.println("O numero " + numero + " � par");
        } else {
            System.out.println("O numero " + numero + " � impar");
        }
    }
}
