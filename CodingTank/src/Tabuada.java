import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
//        Scanner leia = new Scanner(System.in);
//
//        System.out.println("Desejo saber a tabuada do:");
//        int tabuada = leia.nextInt();
//        System.out.println("Tabuada do " + tabuada + ":");
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
//        }

        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("Tabuada do %d:\n", i);
            imprimirTabuada(i);
        }
    }

    private static void imprimirTabuada(int i) {
        for (int j = 1; j <= 10 ; j++) {
            System.out.printf("%d x %d = %d\n", i, j, (i *j));
        }
    }
}
