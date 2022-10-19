import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int valorInicial = 0, valorFinal = 0;


        if (args.length == 0) {
            System.out.println("Digite o valor inicial:");
            valorInicial = leia.nextInt();
            System.out.println("Digite o valor final:");
            valorFinal = leia.nextInt();

        } else if (args.length == 1) {
            System.out.println("Digite somente o valor final");
            valorFinal = leia.nextInt();
            valorInicial = Integer.parseInt(args[0]);
        } else if (args.length > 2) {
            System.out.println("MAIS QUE 2 ARGUMENTOS TENTE NOVAMENTE");
        } else {
            valorInicial = Integer.parseInt(args[0]);
            valorFinal = Integer.parseInt(args[1]);
        }

        for (int i = valorInicial; i <= valorFinal; i++) {
            System.out.println(i);
        }
    }
}
