import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Adivinhe {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);

        int chute = -1;
        int tentativas = 0;
        int menorChute = Integer.MAX_VALUE;
        int maiorChute = Integer.MIN_VALUE;

        while(randomNum != chute) {
            tentativas++;
            System.out.println("Informe um numero");
            chute = leia.nextInt();
            leia.nextLine();

            if(chute > randomNum) {
                System.out.printf("%d � maior.\n", chute);
            } else if (chute < randomNum) {
                System.out.printf("%d � menor.\n", chute);
            }

            if(chute > maiorChute) {
                maiorChute = chute;
            }

            if(chute < menorChute) {
                menorChute = chute;
            }
        }

        System.out.printf("%d est� correto.\n", chute);
        System.out.printf("Foram feitas %d tentativas, a maior foi %d e a menor foi %d", tentativas, maiorChute, menorChute);
    }
}
