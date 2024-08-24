## Estrutura do Projeto

1. **Crie o projeto `DesafioControleFluxo`**
2. **Dentro do projeto, crie a classe `Contador.java`** para realizar toda a codificação do nosso programa.
3. **Dentro do projeto, crie a classe `ParametrosInvalidosException`** que representará a exceção de negócio no sistema.

## Classes

### Contador.java

Esta classe será responsável por:

- Receber os parâmetros via terminal.
- Validar se o primeiro parâmetro é maior que o segundo.
- Realizar a contagem e impressão dos números incrementados.

### ParametrosInvalidosException.java

Esta classe representará a exceção de negócio no sistema, lançada quando o primeiro parâmetro for maior que o segundo.

## Exemplo de Uso

Para executar o programa, compile as classes e execute o comando no terminal passando os dois números como parâmetros:

```sh
java Contador 12 30