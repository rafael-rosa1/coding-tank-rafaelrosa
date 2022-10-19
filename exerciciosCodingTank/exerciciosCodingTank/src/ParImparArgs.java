public class ParImparArgs {
    public static void main(String[] args) {

        if(args.length == 1) {
            int argsToInt = Integer.parseInt(args[0]);
            boolean ePar = argsToInt % 2 == 0;
            if(ePar) {
                System.out.println("Numero informado é par.");
            } else {
                System.out.println("Numero informado é impar");
            }
        } else {
            System.out.println("Numero invalido de argumentos, é esperado que seja informado um argumento.");
        }
    }
}
