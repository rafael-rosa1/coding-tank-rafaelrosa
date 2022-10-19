import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe a primeira nota");
        double nota1 = leia.nextDouble();
        System.out.println("Informe a segunda nota");
        double nota2 = leia.nextDouble();
        System.out.println("Informe a terceira nota");
        double nota3 = leia.nextDouble();
        System.out.println("Informe a quarta nota");
        double nota4 = leia.nextDouble();

        boolean notasValidas = (nota1 > 0 && nota1 <= 10) && (nota2 > 0 && nota2 <= 10) && (nota3 > 0 && nota3 <= 10) &&
        (nota4 > 0 && nota4 <= 10);

        if(notasValidas) {
            System.out.println("A média do aluno foi " + ((nota1+nota2+nota3+nota4)/4));
        } else {
            System.out.println("Notas invalidas.");
        }
    }
}
