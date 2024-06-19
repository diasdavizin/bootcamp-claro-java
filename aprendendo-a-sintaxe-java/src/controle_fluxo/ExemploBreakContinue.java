package controle_fluxo;

public class ExemploBreakContinue {
    public static void main(String[] args) {

        // Example of Break and Continue in Java

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                break;

            System.out.println(numero);

        }
        for (int number = 1; number <=5; number++) {
            if (number == 3)
                continue;

            System.out.println(number);
        }
    }
}
