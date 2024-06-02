package operadores;

public class OperadoresTernarios {
    public static void main (String[] args){

        // Conditional without using ternary operator.
        int a, b;

        a = 5;
        b = 6;
        String resultado = "";
        if(a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);

        //Same conditional, but this time, using the ternary conditional operator.

        int a, b;

        a = 6;
        b = 6;
        String resultado = a == b ?"verdadeiro" : "falso";

        System.out.println(resultado);

    }
}
