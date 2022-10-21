import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe a quantidade de provas");
        int qtdeProvas = leia.nextInt();
        leia.nextLine();

        double[] notas = new double[qtdeProvas];

        double somaNotas = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;

        for (int i = 0; i < qtdeProvas ; i++) {
            System.out.printf("Informe a nota da prova %d%n", (i + 1));
            notas[i] = leia.nextDouble();
            leia.nextLine();

            somaNotas += notas[i];

            if(notas[i] > maiorNota) {
                maiorNota = notas[i];
            }

            if(notas[i] < menorNota) {
                menorNota = notas[i];
            }
        }

        double qtdeProvasDouble = qtdeProvas;

        System.out.printf("A menor nota é: %s%n", menorNota);
        System.out.printf("A maior nota é: %s%n", maiorNota);

        System.out.printf("A média das notas é: %s", (somaNotas/qtdeProvasDouble));
    }
}
