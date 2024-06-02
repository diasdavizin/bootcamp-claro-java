package operadores;

public class OperadoresConcatenação {
    public static void main(String[] args){

        // Exemples of Operators in Java

        // Aplication of adiction ( + ) when used with variables Srings, resulting in concatenation
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        //What is the result of the expressions below, use breakpoint to debug?

        String concatenacao ="?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        // So in the first result (31) concatenation and addition are used, but in the others Java understands the first "1" as a String type and only concatenates and does not add with the other numbers, without the last result ( 13 ) because whe use the parenteses.

    }
}
