import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o coeficiente a:");
        BigDecimal a = leia.nextBigDecimal();

        System.out.println("Informe o coeficiente b:");
        BigDecimal b = leia.nextBigDecimal();

        System.out.println("Informe o coeficiente c");
        BigDecimal c = leia.nextBigDecimal();
        leia.close();

        System.out.println("A equação é " + a + "X^2 + " + b + "X + " + c);
        BigDecimal delta = (b.pow(2)).subtract(BigDecimal.valueOf(4.0).multiply(a).multiply(c));
        System.out.println("O valor de delta é: " + delta);

        int comparison = delta.compareTo(BigDecimal.ZERO);
        BigDecimal bMenos = b.multiply(new BigDecimal(-1));
        BigDecimal doisA = new BigDecimal(2).multiply(a);
        MathContext mc = new MathContext(2);

        if(comparison == -1) {
                System.out.println("Não existem raizes reais.");
                return;
        }
        BigDecimal raizDeDelta = delta.sqrt(mc);

        if (comparison == 0) {
            System.out.println("Só existe uma raiz X que é: " + (bMenos.divide(doisA)));
        } else if (comparison == 1) {
            BigDecimal x1 = (bMenos).add(raizDeDelta).divide(doisA);
            System.out.println("A raiz de x1 é: " + x1);
            BigDecimal x2 = (bMenos.subtract(raizDeDelta).divide(doisA));
            System.out.println("A raiz de x2 é: " + x2);
        }
    }
}
