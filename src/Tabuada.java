import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Desejo saber a tabuada do:");
        int tabuada = leia.nextInt();
        System.out.println("Tabuada do " + tabuada + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }
    }
}
