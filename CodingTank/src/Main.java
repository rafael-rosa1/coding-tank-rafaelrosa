public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println(a + " e " + b);
        System.out.println("Soma: " + add(a, b));
        System.out.println("Subtração: " + sub(a, b));
        System.out.println("Multiplicação: " + mult(a, b));
        System.out.println("Divisão: " + div(a, b));
    }

    public static int add(int primeiro, int segundo) {
        return primeiro + segundo;
    }

    public static int sub(int primeiro, int segundo) {
        return primeiro - segundo;
    }

    public static int mult(int primeiro, int segundo) {
        return primeiro * segundo;
    }

    public static int div(int primeiro, int segundo) {
        return primeiro / segundo;
    }
}









