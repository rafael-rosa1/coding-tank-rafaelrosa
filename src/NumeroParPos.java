import java.util.Scanner;

public class NumeroParPos {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um n�mero:");
        int numero = leia.nextInt();
        leia.close();

        boolean resto = numero % 2 == 0;

        if(numero == 0) {
            System.out.println("O numero informado � zero");
            return;
        }

        String tipo = numero > 0 ? "Positivo" : "Negativo";

        if(resto) {
            System.out.println("O numero " + numero + " � par e " + tipo);
        } else {
            System.out.println("O numero " + numero + " � impar e " + tipo);
        }
    }
}
