package main.java.br.com.biblioteca.excecoes.banco;

public class ManipulacaoBancoExcecao extends Exception {

    public ManipulacaoBancoExcecao(String message) {
        super(message);
    }

    public ManipulacaoBancoExcecao(Throwable throwable) {
        super(throwable);
    }

    public ManipulacaoBancoExcecao(String message, Throwable throwable) {
        super(message, throwable);
    }
}