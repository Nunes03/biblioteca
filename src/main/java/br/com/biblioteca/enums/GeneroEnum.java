package main.java.br.com.biblioteca.enums;

public enum GeneroEnum {

    ROMANCE(0),
    TERROR(1),
    ACAO(2),
    SUSPENSE(3);

    private Integer indice;

    GeneroEnum(Integer indice) {
        this.indice = indice;
    }

    public Integer getOrdem() {
        return indice;
    }
}
