import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe sua altura em metros:");
        double altura = leia.nextDouble();
        System.out.println("Informe seu peso em Kg:");
        double peso = leia.nextDouble();

        double IMC = peso / (altura*altura);
        String classificacao;

        if(IMC < 17) {
            classificacao = "muito abaixo do peso";
        } else if(IMC >= 17 && IMC <= 18.49) {
            classificacao = "abaixo do peso";
        } else if (IMC >= 18.5 && IMC <= 24.99) {
            classificacao = "peso normal";
        } else if (IMC >= 25 && IMC <= 29.99) {
            classificacao = "acima do peso";
        } else if (IMC >= 30 && IMC <= 34.99) {
            classificacao = "obesidade I";
        } else if (IMC >= 35 && IMC <= 39.99) {
            classificacao = "obesidade II (severa)";
        } else {
            classificacao = "obesidade III (mórbida)";
        }

        System.out.println("O valor do seu IMC é " + IMC + " (considerado " + classificacao + ")");
    }
}