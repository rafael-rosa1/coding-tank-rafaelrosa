import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Locale;
import java.util.Scanner;

public class FormaPagamento {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual o valor da compra?");
        BigDecimal valorCompra = leia.nextBigDecimal();
        leia.nextLine();
        System.out.println("Qual a forma de pagamento? [CREDITO, DEBITO, CHEQUE, BOLETO, DINHEIRO, PIX]");
        String formaPagamento = leia.nextLine().toUpperCase(Locale.ROOT);

        leia.close();

        BigDecimal desconto = BigDecimal.ZERO;

        switch (formaPagamento) {
            case "CREDITO", "DEBITO" -> desconto = new BigDecimal("0.03");
            case "CHEQUE" -> desconto = new BigDecimal("0.06");
            case "BOLETO" -> desconto = new BigDecimal("0.09");
            case "DINHEIRO", "PIX" -> desconto = new BigDecimal("0.12");
            default -> desconto = new BigDecimal("-1");
        }

        if (desconto.equals(new BigDecimal("-1"))) {
            System.out.println("FORMA DE PAGAMENTO INVALIDA");
        } else {
            BigDecimal cem = new BigDecimal(100);
            System.out.println("Sua compra possui " + desconto.multiply(cem) + "% de desconto;");

            BigDecimal precoComDesconto = valorCompra.subtract(valorCompra.multiply(desconto));
            System.out.println("Totalizando R$ " + precoComDesconto);
        }


    }
}
