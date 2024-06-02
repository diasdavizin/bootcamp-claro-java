package tiposvariaveis;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception{

        // Tipos Primitivos ( Primitives Types )
        double  salarioMinimo = 2500;
        System.out.println(salarioMinimo);

        /* Representação de erro sobre aplicação de variável
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = numeroNormal;
        */

        /* Como fazer uma variável NÃO mudar ?

		 ao usar a palavra reservada final, você determina que jamais
		 esta variável poderá obter outro valor;
		 logo a linha 24 vai apresentar um erro de compilação
		 isso é considerado uma CONSTANTE na linguagem Java
		 */
        final double VALOR_DE_PI = 3.14;

        // VALOR_DE_PI=3.15; Esta linha vai apresentar erro de compilação!

        System.out.println(VALOR_DE_PI);

    }
}
