package operadores;

public class OperadoresLogicos {
    public static void main(String[] args){

        // Exemples of Logical Operators in Java

        // This example shows how to check if BOTH variables are TRUE.

        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2){
            System.out.println(" As duas condições são verdadeiras.");
        }

        // This example shows how to check if ONE variable are TRUE.

        if(condicao1 || condicao2){
            System.out.println(" Uma das condições é verdadeiras.");
        }
    }
}
