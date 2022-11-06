package main.java.br.com.biblioteca.excecoes.banco;

public class ConexaoBancoExcecao extends RuntimeException{

	private static final long serialVersionUID = -1251693500504422151L;

	public ConexaoBancoExcecao(String message){
        super(message);
    }

    public ConexaoBancoExcecao(Throwable throwable){
        super(throwable);
    }

    public ConexaoBancoExcecao(String message, Throwable throwable){
        super(message, throwable);
    }
}
