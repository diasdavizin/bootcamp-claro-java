package controle_fluxo;

public class FormatadorCepExemplo {
    public static void main(String[] args) {

        // Example of Exception Handling in Java
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras do negocio.");        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

        //simulando um cep formatado
        return "23.765-064";
    }
}
