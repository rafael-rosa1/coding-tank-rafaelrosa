import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Conversor {
    public static void main(String[] args) {

        int[] velocidades = new int[5];


        for (int i = 0; i < 5; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
            velocidades[i] = randomNum;
        }

        System.out.printf("Velocidades aferidas:\n %s %s %s %s %s\n", velocidades[0], velocidades[1], velocidades[2], velocidades[3], velocidades[4]);

        Scanner leia = new Scanner(System.in);


        System.out.println("Qual a unidade de origem? [m/s, km/h, mile/h, knot]");
        String unidadeOrigem = leia.nextLine();

        System.out.println("Qual a unidade de destino?");
        String unidadeDestino = leia.nextLine();
        leia.close();

        double[] velocidadesConvertidas = new double[5];


        System.out.println("As velocidades convertidas são");
        if (unidadeOrigem.equals("m/s") && unidadeDestino.equals("km/h")) {
            for (int i = 0; i < 5; i++) {
                velocidadesConvertidas[i] = mpsParaKmph(velocidades[i]);
                System.out.printf("%s m/s = %s km/h\n", velocidades[i], velocidadesConvertidas[i]);
            }
        } else if (unidadeOrigem.equals("km/h") && unidadeDestino.equals("m/s")) {
            for (int i = 0; i < 5; i++) {
                velocidadesConvertidas[i] = kmphParaMps(velocidades[i]);
                System.out.printf("%s m/s = %s km/h\n", velocidades[i], velocidadesConvertidas[i]);
            }
        } else if (unidadeOrigem.equals("m/s") && unidadeDestino.equals("knot")) {
            for (int i = 0; i < 5; i++) {
                velocidadesConvertidas[i] = kmphParaKnot(mpsParaKmph(velocidades[i]));
                System.out.printf("%s m/s = %s km/h\n", velocidades[i], velocidadesConvertidas[i]);
            }
        } else if (unidadeOrigem.equals("knot") && unidadeDestino.equals("m/s")) {
            for (int i = 0; i < 5; i++) {
                velocidadesConvertidas[i] = kmphParaMps(knotParaKmph(velocidades[i]));
                System.out.printf("%s m/s = %s km/h\n", velocidades[i], velocidadesConvertidas[i]);
            }
        } else if (unidadeOrigem.equals("m/s") && unidadeDestino.equals("mile/h")) {
            for (int i = 0; i < 5; i++) {
                velocidadesConvertidas[i] = kmphParaMps(knotParaKmph(velocidades[i]));
                System.out.printf("%s m/s = %s km/h\n", velocidades[i], velocidadesConvertidas[i]);
            }
        }

    }

    private static double mpsParaKmph(double mps) {
        return mps * 3.6;
    }

    private static double kmphParaMps(double kmph) {
        return kmph / 3.6;
    }

    private static double milephParaKmph(double mileph) {
        return mileph * 1.609;
    }

    private static double kmphParaMileph(double kmph) {
        return kmph / 1.609;
    }

    private static double knotParaKmph(double knot) {
        return knot * 1.852;
    }

    private static double kmphParaKnot(double kmph) {
        return kmph / 1.852;
    }


}
