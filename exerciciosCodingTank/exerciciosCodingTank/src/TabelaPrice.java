import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TabelaPrice {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual o valor do empréstimo?");
        BigDecimal emprestimo = leia.nextBigDecimal();

        System.out.println("Qual o valor do juros?");
        BigDecimal juros = leia.nextBigDecimal();

        System.out.println("Em quantas parcelas deseja quita-lo?");
        int meses = leia.nextInt();
        leia.close();

        BigDecimal jurosEmDecimal = juros.multiply(new BigDecimal("0.01"));

        BigDecimal umMaisJurosElevadoAN = jurosEmDecimal.add(new BigDecimal("1.0")).pow(meses);

        BigDecimal dividendo = umMaisJurosElevadoAN.multiply(jurosEmDecimal);

        BigDecimal divisor = umMaisJurosElevadoAN.subtract(new BigDecimal("1.0"));

        BigDecimal divisao = dividendo.divide(divisor, 6, RoundingMode.HALF_UP);

        BigDecimal parcela = divisao.multiply(emprestimo);

        System.out.printf("Valor fixo da parcela R$ %s, Saldo devedor total R$ %s%n", parcela.setScale(2), emprestimo.setScale(2));

        BigDecimal jurosMes;
        BigDecimal jurosTotal = new BigDecimal("0");
        BigDecimal amortizacao;
        BigDecimal saldoDevedor = emprestimo;
        BigDecimal amortizacaoTotal = new BigDecimal("0");


        for (int i = 1; i <= meses; i++) {
            jurosMes = saldoDevedor.multiply(jurosEmDecimal);
            amortizacao = parcela.subtract(jurosMes);
            saldoDevedor = saldoDevedor.subtract(amortizacao);
            jurosTotal = jurosTotal.add(jurosMes);
            amortizacaoTotal = amortizacaoTotal.add(amortizacao);
            System.out.printf("Parcela %s | Juros: R$ %s | Amortização: R$ %s | Saldo devedor R$ %s%n", i, jurosMes.setScale(2, RoundingMode.HALF_UP), amortizacao.setScale(2, RoundingMode.HALF_UP), saldoDevedor.setScale(2, RoundingMode.HALF_UP));
        }
        System.out.printf("Total: Prestação: R$ %s, Juros R$ %s, Amortização R$ %s", (parcela.multiply(BigDecimal.valueOf(meses))).setScale(2, RoundingMode.HALF_UP), jurosTotal.setScale(2, RoundingMode.HALF_UP), amortizacaoTotal.setScale(2, RoundingMode.HALF_UP));


    }
}
