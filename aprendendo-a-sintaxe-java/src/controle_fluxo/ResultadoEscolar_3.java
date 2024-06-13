package controle_fluxo;

public class ResultadoEscolar_3 {
    public static void main(String[] args) {

        // Example of Ternary Operator in Java

        int nota = 6;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
