package main.java.br.com.biblioteca.excecoes.banco;

public class ManipulacaoBancoExcecao extends Exception {

	private static final long serialVersionUID = 2482194230677133050L;

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