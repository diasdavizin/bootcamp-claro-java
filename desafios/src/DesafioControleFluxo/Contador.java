package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Digite o primeiro número: ");
                int parametroUm = scanner.nextInt();

                System.out.println("Digite o segundo número: ");
                int parametroDois = scanner.nextInt();

                try {

                        contar(parametroUm, parametroDois);

                } catch (ParametrosInvalidosException e) {
                        System.out.println("Erro: " + e.getMessage());
                }
        }

        static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

                //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
                if (parametroUm > parametroDois) {
                        throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro parãmetro.");
                }

                //realizar o for para imprimir os números com base na variável contagem
                int cont = parametroDois - parametroUm;
                for (int i = 1; i <= cont; i++) {
                        System.out.println("Imprimindo o número " + i);
                }
        }
}