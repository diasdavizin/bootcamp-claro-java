package operadores;

public class OperadoresRelacionais {
    public static void main(String[] args){

        // Exemples of Relational Operators in Java

        // This exemple show how to check if a variable is EQUAL TO another.

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numero1 é igual a numero2? " + simNao);

        // This exemple show how to check if a variable is DIFFERENT from another.

        simNao = numero1 != numero2;

        System.out.println("numero1 é diferente do numero2? " + simNao);

        // This exemple show how to check if a variable is GREATER THAN another.

        simNao = numero1 > numero2;

        System.out.println("numero1 é maior que numero2? " + simNao);

    }
}
