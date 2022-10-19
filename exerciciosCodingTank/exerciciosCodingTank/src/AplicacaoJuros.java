import java.math.BigDecimal;
import java.util.Scanner;

public class AplicacaoJuros {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o valor inicial investido em R$.");
        BigDecimal valorInicial = leia.nextBigDecimal();
        leia.nextLine();
        System.out.println("Informe o juros ao m�s em %");
        BigDecimal jurosAoMes = leia.nextBigDecimal();
        leia.nextLine();
        System.out.println("Informe o tempo em meses que o dinheiro ficar� investido.");
        int tempoMeses = leia.nextInt();
        leia.close();

        System.out.println(valorInicial + " reais, " + jurosAoMes + "% de juros ao m�s por " + tempoMeses + " meses.");

        BigDecimal jurosEmPorcentagem = jurosAoMes.divide(new BigDecimal(100));
        BigDecimal juros;
        BigDecimal saldo = valorInicial;

        for (int i = 1; i <= tempoMeses; i++) {
            juros = saldo.multiply(jurosEmPorcentagem);
            saldo = saldo.add(juros);
            System.out.println("M�s " + i + ": Juros: R$ " + juros.setScale(2) + ", saldo: " + saldo.setScale(2));
        }
    }
}
