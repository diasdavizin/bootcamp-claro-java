package ControleCandidatos;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = { "FELIPE", "MARCIA", "JOAO", "CARLOS", "LUCAS"};
        for( String candidato: candidatos){
            System.out.println("O candidato é o: " + candidato);
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if ( continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        }while  (continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA REALIZADA. " );
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NÚMERO MAXIMO DE " + tentativasRealizadas + " TENTATIVAS REALIZADA." );
    }

    // método auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = { "FELIPE", "MARCIA", "JOAO", "CARLOS", "LUCAS"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento.");

        for( int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é o: " + candidatos[indice]);
        }
    }
    static void selecaoCandidatos() {

        String [] candidatos = { "FELIPE", "MARCIA", "JOAO", "CARLOS", "LUCAS", "MATEUS", "MARCOS", "FERNANDA", "MARIA", "JOANA" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println(" O candidato: " + candidato + " Solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase > salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato.");
        } else if(salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta.");
        }
        else {
            System.out.println("Aguardando resultado dos demais candidatos.");
        }
    }
}
