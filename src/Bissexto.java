import java.util.Scanner;

public class Bissexto {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um ano para saber se ele é bissexto:");
        int ano = leia.nextInt();
        leia.close();

        boolean divisivelPor400 = ano % 400 == 0;
        boolean divisivelPor4 = ano % 4 == 0;
        boolean naoDivisivelPor100 = ano % 100 != 0;

        if((divisivelPor4 && naoDivisivelPor100) || divisivelPor400 ) {
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano não é bissexto");
        }
    }
}
