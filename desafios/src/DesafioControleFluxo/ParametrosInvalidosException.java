package DesafioControleFluxo;

public class ParametrosInvalidosException extends RuntimeException {

        ParametrosInvalidosException(String s) {
        super("O segundo parâmetro deve ser maior que o primeiro parâmetro.");
    }
}