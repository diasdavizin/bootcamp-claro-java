package controle_fluxo;

public class ResultadoEscolar_1 {
        public static void main(String[] args) {

            // Exemplo of chained conditionals in Java

            int nota = 6;

            if (nota >= 7)
                System.out.println("Aprovado");
            else if (nota >= 5 && nota < 7)
                System.out.println("Recuperação");
            else
                System.out.println("Reprovado");
        }
}
