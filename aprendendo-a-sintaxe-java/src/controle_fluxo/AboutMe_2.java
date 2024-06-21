package controle_fluxo;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe_2 {
    public static void main(String[] args) {

        // Example of Try and Catch in Java

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome:");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura:");
            double altura = scanner.nextDouble();


            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        }
        catch (InputMismatchException e){
            System.err.println("Os campos idade e altura devem ser númericos.");
        }
    }
}
