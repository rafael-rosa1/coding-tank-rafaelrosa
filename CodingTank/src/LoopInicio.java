import java.util.Scanner;

public class LoopInicio {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor inicial:");
        int valorInicial = leia.nextInt();
        System.out.println("Digite o valor final:");
        int valorFinal = leia.nextInt();

        for (int i = valorInicial; i <= valorFinal; i++) {
            System.out.println(i);
        }
    }
}
