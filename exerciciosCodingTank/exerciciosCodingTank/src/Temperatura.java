import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Informa a temperatura 1 em graus Celsius");
        double temperatura1 = leia.nextDouble();
        System.out.println("Informa a temperatura 2 em graus Celsius");
        double temperatura2 = leia.nextDouble();

        System.out.print("Temperatura 1 ");
        conversor(temperatura1);
        System.out.print("Temperatura 2 ");
        conversor(temperatura2);

    }

    public static void conversor(double celsius) {
        double fahrenheit = (celsius * (9.0/5.0) + 32.0);
        System.out.println(celsius+"ºC são " + fahrenheit + "ºF");
    }
}
